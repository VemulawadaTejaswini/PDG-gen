import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:47-

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            out.println(b - a + 1 - cnt(a, b, c) - cnt(a, b, d) + cnt(a, b, lcm(c, d)));

        }
    }

    private static long cnt(long a, long b, long c) {
        long consumed = (a - 1) % c;
        long rest = c - 1 - consumed;
        a += rest;
        return (b - a + 1 + c - 1) / c;
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
