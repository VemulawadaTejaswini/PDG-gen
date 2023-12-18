import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        
        // 入力情報
        int N = sc.nextInt();
        int W = sc.nextInt();
        
        long[] w = new long[N];
        long[] v = new long[N];
        
        long maxV = -1;
        for(int i = 0; i < N; i ++){
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
            if (maxV < v[i]) maxV = v[i];
        }
        
        
        int dpSize = (int)(N * maxV);
        
        // dp[k][v] : k番目以下の品物で価値vより大きくなるような重みの最小値
        long[][] dp = new long[N][dpSize];
        
        for(int i = 1; i < N; i ++){
            for(int j = 0; j < dpSize; j ++) dp[i][j] = 0;
        }
        
        for(int j = 0; j < dpSize; j ++){
            dp[0][j] = (v[0] > j) ? w[0] : 0;
        }
        
        for (int i = 1; i < N; i ++){
            for(int j = 0; j < (int)v[i]; j ++){
                // 加えない場合しかない
                long w1 = dp[i-1][j];
                long w2 = w[i];
                
                dp[i][j] = (0 < w1 && w1 < w2) ? w1 : w2;
            }
            
            // (w[i], v[i])を追加するか考える
            for(int j = (int)v[i]; j < dpSize; j ++){
                // 加えない場合
                long w1 = dp[i - 1][j];
                
                // 加える場合
                long before = dp[i - 1][j - (int)v[i]];
                long w2 = before == 0 ? 0 : (before + w[i]);
                
                dp[i][j] = (0 < w1 && w1 < w2) ? w1 : w2;
            }
            
        }
        
        
        long ans = 0;
        for(int j = dpSize - 1; j >= 0; j --){
            if (0 < dp[N-1][j] && dp[N-1][j] <= W){
                ans = j + 1;
                break;
            }
        }

        // 出力
        System.out.print(ans);
    }
}