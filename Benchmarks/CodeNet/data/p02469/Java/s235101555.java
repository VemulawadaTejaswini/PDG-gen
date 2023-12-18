import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AizuLCM solver = new AizuLCM();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuLCM {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            long p = 1L;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                p *= a[i];
            }

            int g = 0;
            int l = 0;
            if (n == 1) {
                g = a[0];
            } else {
                g = gcd(a[0], a[1]);
                l = (a[0] * a[1]) / g;

                for (int i = 2; i < n; i++) {
                    g = gcd(l, a[i]);
                    l = (l * a[i]) / g;
                }
            }

            out.printf("%d\n", l);
        }

        private int gcd(int x, int y) {
            while (y != 0) {
                int t = x % y;
                x = y;
                y = t;
            }

            return x;
        }

    }
}


