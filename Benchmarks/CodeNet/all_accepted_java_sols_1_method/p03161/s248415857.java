import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n+1];

        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        dp[1] = 0;
        dp[2] = Math.abs(a[1]-a[0]);
        for(int i = 3; i<n+1; i++)  {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j<=k; j++) {
                if(i-j>0) {
                    dp[i] = Math.min(dp[i], Math.abs(a[i - 1] - a[i - j - 1]) + dp[i-j]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}