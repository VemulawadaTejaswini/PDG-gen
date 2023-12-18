import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        int[][] dp = new int[n + 1][h + 1];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int aa = Integer.parseInt(sc.next());
            max = Math.max(max, aa);
            a[i] = aa;
            b[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], 1_000_000_000);
        }
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= h; j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
                dp[i + 1][Math.min(j + a[i], h)] = Math.min(dp[i + 1][Math.min(j + a[i], h)], dp[i + 1][j] + b[i]);
            }
        }
        System.out.println(dp[n][h]);
    }
}
