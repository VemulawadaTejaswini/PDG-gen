import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        int [] v = new int[n];
        long [] w1 = new long[n];
        for(int i = 0; i < n; i++)
        {
            w1[i] = sc.nextInt();
            v[i] = sc.nextInt();
            sum += v[i];
        }
        long [] dp = new long[sum + 1];
        for(int j = 0; j <= sum; j++)
            dp[j] = 100000000000000L;
        dp[0] = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = sum; j >= v[i]; j--)
                dp[j] = Math.min(dp[j - v[i]] + w1[i], dp[j]);
        }
        int ans = 0;
        for(int i = 1; i <= sum; i++)
        {
            if(dp[i] <= w)
                ans = i;
        }
        System.out.println(ans);
    }
}