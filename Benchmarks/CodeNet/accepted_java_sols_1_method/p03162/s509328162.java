import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int[][] dp = new int[n+1][3];

        for(int i = 0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }

        dp[1][0] = a[0][0];
        dp[1][1] = a[0][1];
        dp[1][2] = a[0][2];

        for(int i = 2; i<n+1; i++) {
            for(int j = 0; j<3; j++) {
                int ca = (j+1)%3;
                int cb = (j+2)%3;
                dp[i][j] = Math.max(dp[i-1][ca]+a[i-1][j], dp[i-1][cb]+a[i-1][j]);

            }
        }
        int ans = Math.max(dp[n][0],dp[n][1]);
        ans = Math.max(ans,dp[n][2]);
        System.out.println(ans);
    }
}