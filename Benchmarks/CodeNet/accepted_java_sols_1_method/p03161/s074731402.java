
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), h[] = new int[n];
		long dp[] = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0 && j >= i - k; j--) {
				long a = Integer.MAX_VALUE;
				if (i - 1 >= 0)
					a = dp[j] + Math.abs(h[j] - h[i]);
				dp[i] = Long.min(dp[i], a);
			}
		}
		System.out.println(dp[n - 1]);
		sc.close();
	}
}
