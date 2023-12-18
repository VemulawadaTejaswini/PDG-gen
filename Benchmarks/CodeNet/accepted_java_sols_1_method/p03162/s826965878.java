import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i=0; i<n; i++) for(int j=0; j<3; j++) a[i][j] = sc.nextInt();
        sc.close();
        long[][] dp = new long[n][3];
        for(int i=0; i<3; i++) dp[0][i] = a[0][i];
        for(int i=1; i<n; i++){
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i][0];
            dp[i][1] = Math.max(dp[i-1][2], dp[i-1][0]) + a[i][1];
            dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + a[i][2];
        }

        System.out.println(Arrays.stream(dp[n-1]).max().getAsLong());
    }
}