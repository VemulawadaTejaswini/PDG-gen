import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = arr[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = arr[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        int max = Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
        System.out.println(max);
        sc.close();
    }
}
