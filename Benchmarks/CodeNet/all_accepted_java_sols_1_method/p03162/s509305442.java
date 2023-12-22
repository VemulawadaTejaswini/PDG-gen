import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    b[i] = sc.nextInt();
		    c[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int[][] dp = new int[n][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int i = 0; i < n-1; i++){
		    dp[i+1][0] = max(dp[i][1], dp[i][2]) + a[i+1];
		    dp[i+1][1] = max(dp[i][2], dp[i][0]) + b[i+1];
		    dp[i+1][2] = max(dp[i][0], dp[i][1]) + c[i+1];
		}
		result = max(dp[n-1][0], max(dp[n-1][1], dp[n-1][2]));
		
		// 出力
		System.out.println(result);
	}
}
