import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int W = sc.nextInt();
		long[] w = new long[n];
		int[] v = new int[n];
		for(int i = 0; i < n; i++){
		    w[i] = sc.nextLong();
		    v[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		long[][] dp = new long[n+1][100001];
		for(int i = 0; i < n+1; i++){
		    Arrays.fill(dp[i], 1001001001);
		}
		dp[0][0] = 0;
		for(int i = 1; i <= n; i++){
		    for(int j = 0; j < dp[0].length; j++){
		        if(j-v[i-1] >= 0){
		            dp[i][j] = min(dp[i-1][j], dp[i-1][j-v[i-1]] + w[i-1]);
		        }else{
		            dp[i][j] = dp[i-1][j];
		        }
		    }
		}
		for(int i = 0; i < dp[0].length; i++){
		    if(dp[n][i] <= W) result = max(result, i);
		}

		
		// 出力
		System.out.println(result);
	}
}
