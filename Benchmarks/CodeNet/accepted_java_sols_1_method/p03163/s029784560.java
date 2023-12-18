import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        long [] dp = new long[w + 1];
        for(int i = 0; i < n; i++)
        {
            int w1 = sc.nextInt();
            int v = sc.nextInt();
            for(int j = w; j >= w1; j--)
                dp[j] = Math.max(dp[j], dp[j - w1] + v);
        }
        System.out.println(dp[w]);
    }
}