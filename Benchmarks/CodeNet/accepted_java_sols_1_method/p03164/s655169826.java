import java.util.*;
 
public class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        int val_sum = 0;
        for(int i = 0; i < n; i++) {weight[i] = sc.nextInt(); value[i] = sc.nextInt(); val_sum += value[i];}
        long[][] dp = new long[n + 1][val_sum + 1];
        for(int i = 1; i <= val_sum; i++) dp[0][i] = 1000000000001L;

        for(int i = 1; i <= n; i++){
            int cweight = weight[i - 1];
            int cvalue = value[i - 1];
            for(int j = 1; j <= val_sum; j++){
                if(j < cvalue){
                    dp[i][j] = dp[i - 1][j];
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - cvalue] + cweight);
                }
            }
        }
        for(int i = val_sum; i >= 0; i--){
            if(dp[n][i] <= w){
                System.out.println(i);
                return;
            }
        }
    }
}
