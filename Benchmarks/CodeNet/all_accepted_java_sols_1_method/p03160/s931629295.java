import java.util.*;
import java.math.*;
class Main {
    //
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(ary[1] - ary[0]);
        for(int i = 2;i < n;i++){
            dp[i] = Math.min(Math.abs(ary[i]-ary[i-1])+dp[i-1], Math.abs(ary[i]-ary[i-2])+dp[i-2]);
        }
        System.out.println(dp[n-1]);
        
    }
}
