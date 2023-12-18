import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		long[] dp = new long[n];
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			dp[i] = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
			for (int j = 2; j <= k; j++) {
				if (i - j < 0) break;
				dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i - j] - h[i]));
			}
		}
		
		System.out.println(dp[n - 1]);
		
		sc.close();
	}
}

