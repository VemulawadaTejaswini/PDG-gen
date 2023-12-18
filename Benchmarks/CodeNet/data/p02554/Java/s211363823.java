import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        long tmpN = sc.nextLong();
        long mod = (long) (Math.pow(10, 9) + 7);
        long totals = powmod(10, tmpN, mod) - powmod(9, tmpN, mod) - powmod(9, tmpN, mod) + powmod(8, tmpN, mod);

        System.out.println(totals);

        sc.close();
    }

    public static long powmod(int x, long y, long mod) {
        long total = 1;
        for (long i = 0; i < y; i++) {
            total = (total * x) % mod;
        }
        return total;

    }
}