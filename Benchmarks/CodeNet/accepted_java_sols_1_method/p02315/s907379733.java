import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= W; j++) {
                if (j - w[i] >= 0) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}
