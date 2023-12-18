import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
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
		    if(i+1 < n) dp[i+1] = min(dp[i+1], dp[i] + abs(h[i] - h[i+1]));
		    if(i+2 < n) dp[i+2] = min(dp[i+2], dp[i] + abs(h[i] - h[i+2]));
		}
		result = dp[n-1];
		
		// 出力
		System.out.println(result);
	}
}
