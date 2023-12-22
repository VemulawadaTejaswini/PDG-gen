
import java.util.Scanner;

class Main {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int chukan = sc.nextInt();
        int kimatu = sc.nextInt();
        int saisi = sc.nextInt();
        while (chukan != -1 || kimatu != -1 || saisi != -1) {
            int o = kimatu + chukan;
            if (o < 30) {
                System.out.println("F");
            } else if (chukan == -1 || kimatu == -1) {
                System.out.println("F");
            } else if (80 <= o) {
                System.out.println("A");
            } else if (65 <= o && o < 80) {
                System.out.println("B");
            } else if (50 <= o && o < 65) {
                System.out.println("C");
            } else if (30 <= o && o < 50 && saisi >= 50) {
                System.out.println("C");
            } else if (30 <= o && o < 50 && saisi < 50) {
                System.out.println("D");

            }
            chukan = sc.nextInt();
            kimatu = sc.nextInt();
            saisi = sc.nextInt();
        }
    }

}

