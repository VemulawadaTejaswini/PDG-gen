import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++) h[i] = sc.nextInt();
        sc.close();

        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for(int i=2; i<n; i++){
            for(int j=1; j<=Math.min(k, i); j++){
                long cdp = dp[i-j] + Math.abs(h[i-j] - h[i]);
                dp[i] = Math.min(cdp, dp[i]);
            }
        }

        System.out.println(dp[n-1]);
    }
}