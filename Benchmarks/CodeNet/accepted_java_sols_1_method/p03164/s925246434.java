
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static final int maxN = 100000;

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int w = in.nextInt();

        int[] ws = new int[n];
        int[] vs = new int[n];

        for (int i = 0; i < n; i++) {
            ws[i] = in.nextInt();
            vs[i] = in.nextInt();
        }

        int[][] dp = new int[n + 1][maxN + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= maxN; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxN; j++) { //v
                if (j >= vs[i - 1]
                        && dp[i - 1][j - vs[i - 1]] != Integer.MAX_VALUE
                        && dp[i - 1][j - vs[i - 1]] + ws[i - 1] <= w) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - vs[i - 1]] + ws[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = maxN; i >= 0; --i) {
            if (dp[n][i] != Integer.MAX_VALUE) {
                System.out.println(i);
                break;
            }
        }
    }
}
