public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] dp = new int[n + 1][3];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + scanner.nextInt();
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + scanner.nextInt();
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + scanner.nextInt();
        }
        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
    }
}