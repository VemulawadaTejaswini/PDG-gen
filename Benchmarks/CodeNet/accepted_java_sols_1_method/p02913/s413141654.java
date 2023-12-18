import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		long result = 0;
		int[][] dp = new int[n+1][n+1];
		for(int i = n - 1; i >= 0; i--){
		    for(int j = n - 1; j >= 0; j--){
		        if(s.charAt(i) == s.charAt(j)){
		            dp[i][j] = dp[i + 1][j + 1] + 1;
		            result = max(result, min(dp[i][j], abs(j - i)));
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}
