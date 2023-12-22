public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), w = scanner.nextInt();
        long[][] dp = new long[n + 1][w + 1];
        for (int i = 1; i <= n; i++) {
            int w1 = scanner.nextInt(), u1 = scanner.nextInt();
            for (int j = 0; j <= w; j++)
                dp[i][j] = Math.max(j >= w1 ? dp[i - 1][j - w1] + u1 : 0, dp[i - 1][j]);
        }
        System.out.println(dp[n][w]);
    }
}