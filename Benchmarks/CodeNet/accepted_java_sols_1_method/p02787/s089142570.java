public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int dp[][] = new int[n + 1][h + 1];
        dp[0][0] = 0;
        for (int j = 1; j <= h; j++) {
            dp[0][j] = INF;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= h; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][Math.max(0, j - a[i - 1])] + b[i - 1]);
            }
        }
        System.out.println(dp[n][h]);
    }
    public static final int INF = 1000000000;
}