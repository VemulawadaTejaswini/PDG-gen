
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;

public class Atcoder172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = new PrintStream(System.out);
        new ProblemE().solve(scanner, printStream);
    }

    static class Utils {
        public static int[] readIntArray(Scanner scanner, int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = scanner.nextInt();
            }
            return res;
        }

        public static void println(PrintStream printStream, List<Integer> a) {
            for (int x : a) {
                printStream.print(x + " ");
            }
            printStream.println();
        }

        public static void println(PrintStream printStream, int[] a) {
            for (int x : a) {
                printStream.print(x + " ");
            }
            printStream.println();
        }
    }

    static class ProblemE {

        long qpow(long a, long b, long mod) {
            long res = 1;
            while (b != 0) {
                if (b % 2 == 1) {
                    res = res * a % mod;
                }
                a = a * a % mod;
                b >>= 1;
            }
            return res;
        }

        long mul(long mod, long... arr) {
            long res = 1;
            for (long x : arr) {
                res = res * x % mod;
            }
            return res;
        }

        void solve(Scanner scanner, PrintStream printStream) {
            final long mod = (long) (1e9 + 7);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long[] fac = new long[(m + 10)];

            fac[0] = 1;
            for (int i = 1; i <= m; i++) {
                fac[i] = fac[i - 1] * i % mod;
            }

            long[] d = new long[(m + 10)];
            d[0] = 1;
            d[1] = 0;
            d[2] = 1;
            for (int i = 3; i <= m; i++) {
                d[i] = (i - 1) * (d[i - 1] + d[i - 2]) % mod;
            }


            long[] inv = new long[m + 1];
            inv[m] = qpow(fac[m], mod - 2, mod);
            for (int i = m - 1; i >= 0; i--) {
                inv[i] = inv[i + 1] * (i + 1) % mod;
            }

            long ans = 0;
            for (int i = 0; i <= m - n; i++) {
                ans += mul(mod, d[m - i], inv[m - n - i], inv[i]);
                ans %= mod;
            }
            printStream.println(ans * fac[m] % mod * inv[m - n] % mod);
        }
    }
}
