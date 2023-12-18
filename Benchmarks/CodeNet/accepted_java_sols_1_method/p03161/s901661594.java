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
		dp[1] = Math.abs(h[0] - h[1]);
		for (int i = 2; i < n; i++) {
			long min = Long.MAX_VALUE;
			for (int j = 1; j <= k; j++) {
				if (i - j < 0) break;
				min = Math.min(min, dp[i - j] + Math.abs(h[i - j] - h[i]));
			}
			dp[i] = min;
		}
		
//		System.out.println(Arrays.toString(dp));
		
		System.out.println(dp[n - 1]);
 		
		sc.close();
	}
}

