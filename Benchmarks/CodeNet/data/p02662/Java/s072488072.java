import java.util.*;

public class Main {
    static long MOD = 998244353;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // ans: f(T)の全パターンの和
        // f(T): 集合Tの部分集合であって、和がsになるパターン数
        long ans = 0;
        
        // ans: [x^s] (f{1}+f{2}+f{3}+f{1,2}+f{1,3}+f{2,3}+f{1,2,3})
        // ex. f{1,2,3}: f1f2f3
        // ex. f{1,2}: f1f2
        // (空集合は含まないので-1すべきだが、s>=1なので-1は無視してOK)
        
        // ex. n = 3, s = 4, array[] = {2, 2, 4}
        // -> f{3}に1個、f{1,2}に1個、f{1,3}に1個、f{2,3}に1個、f{1,2,3}に2個 -> ans = 6
        // F1: f1
        // F2: F1f2 + f2 = f1f2 + f2
        // F3: F1~2f3 + f3 = f1f3 + f1f2f3 + f2f3 + f3
        // Fn: F1~n-1fn + fn
        // -> ans: [x^s] (F1 + F2 + ... + Fn)
        
        // dp[i][s]: [x^s] (Fi)
        long[][] dp = new long[n+1][s+1];
        for (int i = 0; i < n; i++) {
            int offset = array[i];
            
            // Fi+1 = F1~ifi + fi
            
            // F1~i
            long[] sum = new long[s+1];
            for (int j = 0; j < i+1; j++) {
                for (int k = 0; k <= s; k++) {
                    sum[k] += dp[j][k];
                }
            }
            
            // F1~ifi (選ぶ)
            for (int j = s; j - offset >= 0; j--) {
                dp[i+1][j] += sum[j-offset];
                dp[i+1][j] %= MOD;
            }
            // F1~ifi (選ばない)
            for (int j = 0; j <= s; j++) {
                dp[i+1][j] += sum[j];
                dp[i+1][j] %= MOD;
            }
            
            // fi (選ぶ)
            if (offset <= s) {
                dp[i+1][offset]++;
                dp[i+1][offset] %= MOD;
            }
            // fi (選ばない)
            dp[i+1][0]++;
            dp[i+1][0] %= MOD;
            
            ans += dp[i+1][s];
            ans %= MOD;
        }
        // for (int i = 0; i <= n; i++) {
            // System.out.println(Arrays.toString(dp[i]));
        // }
        
        System.out.println(ans);
    }
}