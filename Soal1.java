/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3pbo;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka:");
        int angka = input.nextInt();

        if (ribuan(angka)) {
            System.out.println(angka + " adalah ribuan Karena terdiri dari 4 angka.");
        } else {
            System.out.println(angka + " bukan ribuan karena kurang dari 4 angka.");
        }

        input.close();
    }

    public static boolean ribuan(int angka) {
        return angka >= 1000 && angka < 10000;
    }
}
