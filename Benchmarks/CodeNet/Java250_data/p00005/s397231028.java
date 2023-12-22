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
        AizuGCDLCM solver = new AizuGCDLCM();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuGCDLCM {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            while (in.hasNext()) {
                int x = in.nextInt();
                int y = in.nextInt();

                int g = gcd(x, y);
                long p = (long) x * y;
                long l = p / g;

                out.printf("%d %d\n", g, l);
            }
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


