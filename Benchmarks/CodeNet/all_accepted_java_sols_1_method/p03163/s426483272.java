import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int W = sc.nextInt();
        
        long[] w = new long[N];
        long[] v = new long[N];
        
        for(int i = 0; i < N; i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        
        //dp[商品数][商品の重さ] = 商品数と商品の重さがわかっている時の、価値の総和の最大値
        
        long[][] dp = new long[110][100100]; 
        
        for(int i = 0; i < N; i++){ //商品
            for(int k = 0; k <= W; k++){ //重さ
                if(k - w[i] >= 0){ //重さ - i番目商品の重さ が０以上だったら 選ぶ場合
                //dp[i+1][商品の重さ] = max(dp[i+1][k],dp[i][重量-商品の重さ=残りの重量]=残りの重量の価値の総和の最大値+価値=価値の総和)
                    dp[i+1][k] = Math.max(dp[i+1][k],dp[i][(int) (k-w[i])]+v[i]);
                }
                //選ばない場合
                dp[i+1][k] = Math.max(dp[i+1][k],dp[i][k]);
            }
        }
        
        System.out.println(dp[N][W]);
        
    }
}
