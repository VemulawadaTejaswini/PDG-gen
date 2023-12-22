import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] height = new int[N+1];
		int[] dp = new int[N+1];
		for(int i = 1; i <= N; i++) {
			height[i] = sc.nextInt();
		}
		dp[1] = 0;
		dp[2] = Math.abs(height[2]-height[1]);
		for(int i = 3; i <= N; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= K && i - j >= 1; j++) {
				int cost = Math.abs(height[i]-height[i-j]);
				min = Math.min(min,cost+dp[i-j]);

			}
			dp[i] = min;
		}
		System.out.println(dp[N]);
	}
}