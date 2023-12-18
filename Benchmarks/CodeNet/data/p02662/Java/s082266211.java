import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        int[][] dp = new int[2][s + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int v = scanner.nextInt();
            for (int j = 0; j < s + 1; j++) {
                dp[i % 2][j] = dp[(i + 1) % 2][j] * 2;
            }
            for (int j = 0; j < s + 1 - v; j++) {
                if (dp[(i + 1) % 2][j] > 0) {
                    dp[i % 2][j + v] = (dp[i % 2][j + v] + dp[(i + 1) % 2][j]) % 998244353;
                }
            }
        }
        System.out.println(dp[n % 2][s]);
    }
}