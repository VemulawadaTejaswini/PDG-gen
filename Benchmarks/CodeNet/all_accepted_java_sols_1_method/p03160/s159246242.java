import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            dp[i] = Math.min((dp[Math.max(i-1,0)]+(Math.abs(a[i]-a[Math.max(i-1,0)]))),(dp[Math.max(i-2,0)]+(Math.abs(a[i]-a[Math.max(i-2,0)]))));
        }
        System.out.print(dp[n-1]);
    }
}