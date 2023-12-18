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
        CSumOfProductOfPairs solver = new CSumOfProductOfPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSumOfProductOfPairs {
        static final int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(in.next());
            }


            // 累積和
            long s[] = new long[N + 1];
            for (int i = 0; i < N; ++i) {
                s[i + 1] = s[i] + A[i];
                s[i + 1] %= mod;
            }

            long ans = 0;

            for (int i = 0; i < N; i++) {
                s[N] -= A[i];
                if (s[N] < 0) s[N] += mod;
                ans += A[i] * s[N];
                ans %= mod;
            }

            // 出力
            out.println(ans);

        }

    }
}

