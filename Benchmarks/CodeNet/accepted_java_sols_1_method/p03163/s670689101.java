
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
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
        long[][] dp = new long[n + 1][w + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (j - ws[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - ws[i - 1]] + vs[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
