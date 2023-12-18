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
        AizuLCS solver = new AizuLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuLCS {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n-- != 0) {
                String x = in.next();
                String y = in.next();

                out.printf("%d\n", lcs(x, y));
            }
        }

        private int lcs(final String x, final String y) {
            int xlen = x.length();
            int ylen = y.length();
            int[][] dp = new int[xlen + 1][ylen + 1];

            for (int i = 1; i <= xlen; i++) {
                for (int j = 1; j <= ylen; j++) {
                    int insertion = dp[i][j - 1];
                    int deletion = dp[i - 1][j];

                    if (x.charAt(i - 1) == y.charAt(j - 1)) {
                        dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, Math.min(insertion, deletion));
                    } else {
                        dp[i][j] = Math.max(insertion, deletion);
                    }
                }
            }

            return dp[xlen][ylen];
        }

    }
}


