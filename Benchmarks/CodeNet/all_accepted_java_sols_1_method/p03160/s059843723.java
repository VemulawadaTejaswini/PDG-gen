import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] dp = new int[n];
        dp[0] = 0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(i - 1 >= 0)
                dp[i] = dp[i - 1] + Math.abs(a[i] - a[i - 1]);
            if(i - 2 >= 0)
                dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(a[i] - a[i - 2]));
        }
        System.out.println(dp[n - 1]);
    }
}