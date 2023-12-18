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
        CoinChangeAizu solver = new CoinChangeAizu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CoinChangeAizu {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] c = new int[m];

            for (int i = 0; i < m; i++) {
                c[i] = in.nextInt();
            }

            int[] dp = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                dp[i] = Integer.MAX_VALUE - 1;
                for (int j = 0; j < m; j++) {
                    if (i >= c[j]) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - c[j]]);
                    }
                }
            }

            out.printf("%d\n", dp[n]);
        }

    }
}


