package com.example.practclass_sem7_librerias_audio_dama

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Español
        val btnUno = findViewById<ImageButton>(R.id.btnUno)
        val btnDos = findViewById<ImageButton>(R.id.btnDos)
        val btnTres = findViewById<ImageButton>(R.id.btnTres)
        val btnCuatro = findViewById<ImageButton>(R.id.btnCuatro)
        val btnCinco = findViewById<ImageButton>(R.id.btnCinco)
        val btnSeis = findViewById<ImageButton>(R.id.btnSeis)
        val btnSiete = findViewById<ImageButton>(R.id.btnSiete)
        val btnOcho = findViewById<ImageButton>(R.id.btnOcho)
        val btnNueve = findViewById<ImageButton>(R.id.btnNueve)
        val btnDiez = findViewById<ImageButton>(R.id.btnDiez)


        // Inglés
        val btnOne = findViewById<ImageButton>(R.id.btnOne)
        val btnTwo = findViewById<ImageButton>(R.id.btnTwo)
        val btnThree = findViewById<ImageButton>(R.id.btnThree)
        val btnFour = findViewById<ImageButton>(R.id.btnFour)
        val btnFive = findViewById<ImageButton>(R.id.btnFive)
        val btnSix = findViewById<ImageButton>(R.id.btnSix)
        val btnSeven = findViewById<ImageButton>(R.id.btnSeven)
        val btnEight = findViewById<ImageButton>(R.id.btnEight)
        val btnNine = findViewById<ImageButton>(R.id.btnNine)
        val btnTen = findViewById<ImageButton>(R.id.btnTen)

        // Eventos de clic para los números en español
        btnUno.setOnClickListener { playSound(R.raw.uno); mostrarMensaje("Uno") }
        btnDos.setOnClickListener { playSound(R.raw.dos); mostrarMensaje("Dos") }
        btnTres.setOnClickListener { playSound(R.raw.tres); mostrarMensaje("Tres") }
        btnCuatro.setOnClickListener { playSound(R.raw.cuatro); mostrarMensaje("Cuatro") }
        btnCinco.setOnClickListener { playSound(R.raw.cinco); mostrarMensaje("Cinco") }
        btnSeis.setOnClickListener { playSound(R.raw.seis); mostrarMensaje("Seis") }
        btnSiete.setOnClickListener { playSound(R.raw.siete); mostrarMensaje("Siete") }
        btnOcho.setOnClickListener { playSound(R.raw.ocho); mostrarMensaje("Ocho") }
        btnNueve.setOnClickListener { playSound(R.raw.nueve); mostrarMensaje("Nueve") }
        btnDiez.setOnClickListener { playSound(R.raw.diez); mostrarMensaje("Diez") }

        // Eventos de clic para los números en inglés
        btnOne.setOnClickListener { playSound(R.raw.one); mostrarMensaje("One") }
        btnTwo.setOnClickListener { playSound(R.raw.two); mostrarMensaje("Two") }
        btnThree.setOnClickListener { playSound(R.raw.three); mostrarMensaje("Three") }
        btnFour.setOnClickListener { playSound(R.raw.four); mostrarMensaje("Four") }
        btnFive.setOnClickListener { playSound(R.raw.five); mostrarMensaje("Five") }
        btnSix.setOnClickListener { playSound(R.raw.six); mostrarMensaje("Six") }
        btnSeven.setOnClickListener { playSound(R.raw.seven); mostrarMensaje("Seven") }
        btnEight.setOnClickListener { playSound(R.raw.eight); mostrarMensaje("Eight") }
        btnNine.setOnClickListener { playSound(R.raw.nine); mostrarMensaje("Nine") }
        btnTen.setOnClickListener { playSound(R.raw.ten); mostrarMensaje("Ten") }
    }

    private fun playSound(soundResId: Int) {
        mediaPlayer?.release()
        mediaPlayer = MediaPlayer.create(this, soundResId)
        mediaPlayer?.start()
    }

    private fun mostrarMensaje(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}