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
        AizuKnapsackNoRepetitions solver = new AizuKnapsackNoRepetitions();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuKnapsackNoRepetitions {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[] vs = new int[n];
            int[] ws = new int[n];

            for (int i = 0; i < n; i++) {
                vs[i] = in.nextInt();
                ws[i] = in.nextInt();
            }

            out.printf("%d\n", knapsack(w, vs, ws, n));
        }

        private int knapsack(int w, int[] vs, int[] ws, int n) {
            int[][] dp = new int[w + 1][n + 1];

            for (int i = 1; i < w + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    dp[i][j] = dp[i][j - 1];
                    if (i >= ws[j - 1]) {
                        dp[i][j] = Math.max(dp[i][j], vs[j - 1] + dp[i - ws[j - 1]][j - 1]);
                    }
                }
            }

            return dp[w][n];
        }

    }
}


