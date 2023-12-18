import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int[] dp = new int[n];
		Arrays.fill(dp, 1000000000);
		dp[0] = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 1; j <= min(k, n-i-1); j++){
		        dp[i+j] = min(dp[i+j], dp[i] + abs(h[i] - h[i+j]));
		    }
		}
		result = dp[n-1];
		
		// 出力
		System.out.println(result);
	}
}
