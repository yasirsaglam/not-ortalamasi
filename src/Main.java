import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, tarih, muzik, fizik, kimya;

        Scanner giris = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = giris.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = giris.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = giris.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = giris.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = giris.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = giris.nextInt();

        int toplam = (mat + tarih + turkce + fizik + muzik + kimya);
        double ort = toplam / 6;

        System.out.println("Not Ortalamanız : " + ort);

    }
}
