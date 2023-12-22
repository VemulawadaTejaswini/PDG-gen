import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;i++)    h[i] = in.nextInt();
        dp[1] = Math.abs(h[1] - h[0]);
        solve(n, h, dp);
        System.out.println(dp[n-1]);
        in.close();
    }

    static void solve(int n, int[] h, int[] dp) {
        for(int i=2;i<n;i++)    {
            int s1 = Math.abs(h[i]-h[i-1]) + dp[i-1];
            int s2 = Math.abs(h[i]-h[i-2]) + dp[i-2];
            dp[i] = Math.min(s1, s2);
        }
    }
}