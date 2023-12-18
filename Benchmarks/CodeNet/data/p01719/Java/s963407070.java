import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        InvestMaster solver = new InvestMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class InvestMaster {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int MAX = (int) 1e5 + 10;
            int n = in.nextInt();
            int d = in.nextInt();
            int x = in.nextInt();
            int[][] p = new int[d][n];
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < n; j++) {
                    p[i][j] = in.nextInt();
                }
            }
            int[] dp = new int[MAX];
            for (int i = 0; i < d - 1; i++) {
                Arrays.fill(dp, 0);
                for (int j = 0; j < x + 1; j++) {
                    dp[j] = j;
                }
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < x + 1; k++) {
                        if (k - p[i][j] >= 0) {
                            dp[k] = Math.max(dp[k], dp[k - p[i][j]] + p[i + 1][j]);
                        }
                    }
                }
                int buf = 0;
                for (int j = 0; j < x + 1; j++) {
                    buf = Math.max(buf, dp[j]);
                }
                x = buf;
            }
            out.println(x);
        }

    }
}


