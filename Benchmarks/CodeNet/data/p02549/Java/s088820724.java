import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        DLeapingTak solver = new DLeapingTak();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLeapingTak {
        long[] dp_acc;
        static long MOD = 998244353;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            int[] l = new int[k];
            int[] r = new int[k];
            for (int i = 0; i < k; i++) {
                l[i] = in.nextInt();
                r[i] = in.nextInt();
            }

            long[] dp = new long[n];
            dp_acc = new long[n];
            for (int i = 0; i < n; i++) {
                dp_acc[i] = i == 0 ? 1 : 0;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    dp[i] += dp_acc(i - r[j], i - l[j]);
                  	dp[i] %= MOD;
                    dp_acc[i] = (dp_acc[i - 1] + dp[i]) % MOD;
                }
            }

            System.out.println(dp[n - 1] % MOD);

        }

        public long dp_acc(int l, int r) {
            long left, right;
            if (l <= 0) {
                left = 0;
            } else {
                left = dp_acc[l - 1];
            }

            if (r < 0) {
                right = 0;
            } else {
                right = dp_acc[r];
            }

            return (right - left + MOD) % MOD;
        }

    }
}

