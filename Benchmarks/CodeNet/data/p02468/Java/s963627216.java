import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        powVerify solver = new powVerify();
        solver.solve(1, in, out);
        out.close();
    }

    static class powVerify {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int m = in.nextInt();
            int n = in.nextInt();
            out.println(Arith.pow(m, n, (int) (1e9 + 7)));

        }

    }

    static class Arith {
        public static long pow(long a, long n, long MOD) {
            return n == 0 ? 1 : (pow(a * a % MOD, n / 2, MOD) * (n % 2 == 1 ? a : 1)) % MOD;
        }

    }
}


