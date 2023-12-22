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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        static final int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;

            ans = nCk(n, 2, mod) + nCk(m, 2, mod);
            if (n == 0) ans--;
            if (m == 0) ans--;
            if (n == 1) ans--;
            if (m == 1) ans--;

            // 出力
            out.println(ans);

        }

        public static int nCk(int n, int k, int M) {
            long ret = 1;
            int min = Math.min(k, n - k);
            for (int i = 1; i <= min; i++) {
                ret = (ret * pow(i, M - 2, M)) % M;
            }
            for (int i = n - min + 1; i <= n; i++) {
                ret = (ret * i) % M;
            }
            return (int) ret;
        }

        public static long pow(long a, long b, int M) {
            long ret = 1;
            long tmp = a;
            while (b > 0) {
                if ((b & 1) == 1) ret = (ret * tmp) % M;
                tmp = (tmp * tmp) % M;
                b = b >> 1;
            }
            return ret;
        }

    }
}

