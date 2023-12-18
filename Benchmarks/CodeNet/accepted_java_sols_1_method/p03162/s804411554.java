import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }

        int[][] dp = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = -1;
            }
        }

        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + b[i];
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + c[i];
        }

        int result = -1;
        for (int i = 0; i < 3; i++) {
            if (result < dp[n-1][i]) {
                result = dp[n-1][i];
            }
        }
        System.out.println(result);
    }
}
