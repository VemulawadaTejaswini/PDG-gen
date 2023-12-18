import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] dp = new long[100010];
		long[] h = new long[100010];
		
		Arrays.fill(dp, Long.MAX_VALUE);
		
		dp[0] = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) h[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			dp[i+1] = Math.min(dp[i]+Math.abs(h[i]-h[i+1]), dp[i+1]);
			dp[i+2] = Math.min(dp[i]+Math.abs(h[i]-h[i+2]), dp[i+2]);
		}
		
		System.out.println(dp[n-1]);
	}
}