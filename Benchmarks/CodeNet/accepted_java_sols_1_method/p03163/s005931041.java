import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[n];
		long[] v = new long[n];
		for(int i = 0; i < n; i++){
		    w[i] = sc.nextInt();
		    v[i] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long[][] dp = new long[n][W+1];
		dp[0][0] = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < W+1; j++){
		        if(w[i]+j < W+1 && i == 0) dp[i][w[i]+j] = v[i];
		        if(i > 0){
		            dp[i][j] = max(dp[i][j], dp[i-1][j]);
		            if(w[i]+j < W+1) dp[i][w[i]+j] = max(dp[i][w[i]+j], dp[i-1][j] + v[i]);
		        }
		    }
		}
		for(int i = 0; i < W+1; i++){
		    result = max(result, dp[n-1][i]);
		}
		
		// 出力
		System.out.println(result);
	}
}
