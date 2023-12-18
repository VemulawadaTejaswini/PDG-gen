import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int MOD = 1000000007;

		// 入力
		int n = sc.nextInt();
		
		// 計算
		long result = 0L;
		int[][][][] dp = new int[n+1][4][4][4];
		// A->0 C->1 G->2 T->3
		dp[0][3][3][3] = 1;
		for(int len = 0; len < n; len++){
		    for(int i = 0; i < 4; i++){
		        for(int j = 0; j < 4; j++){
		            for(int k = 0; k < 4; k++){
		                if(dp[len][i][j][k] == 0) continue;
		                for(int a = 0; a < 4; a++){
		                    if(a == 1 && i == 2 && j == 0) continue;
		                    if(a == 1 && i == 0 && j == 2) continue;
		                    if(a == 1 && i == 2 && k == 0) continue;
		                    if(a == 1 && j == 2 && k == 0) continue;
		                    if(a == 2 && i == 1 && j == 0) continue;
		                    dp[len + 1][a][i][j] += dp[len][i][j][k];
		                    dp[len + 1][a][i][j] %= MOD;
		                }
		            }
		        }
		    }
		}

		// 出力
		for(int i = 0; i < 4; i++){
		    for(int j = 0; j < 4; j++){
		        for(int k = 0; k < 4; k++){
		            result += dp[n][i][j][k];
		            result %= MOD;
		        }
		    }
		}
		System.out.println(result);
        
	}
}
