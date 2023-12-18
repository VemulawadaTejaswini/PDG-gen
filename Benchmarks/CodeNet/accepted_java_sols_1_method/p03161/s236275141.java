import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] stones = new int[n];
		int[] dp = new int[n];
		dp[0] = 0;
		for (int i = 0; i < n; ++i) {
			stones[i] = sc.nextInt();
			if (i > 0) dp[i] = Math.abs(stones[i] - stones[i - 1]) + dp[i - 1];
			for (int j = 2; j < k + 1; ++j) {
				if (i - j < 0) break;
				dp[i] = Math.min(dp[i], Math.abs(stones[i] - stones[i - j]) + dp[i - j]);
			}
		}
		System.out.println(dp[n - 1]);
		
		sc.close();
	}

}
