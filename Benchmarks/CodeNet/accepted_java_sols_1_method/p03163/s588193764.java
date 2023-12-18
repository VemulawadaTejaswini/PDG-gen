import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] u = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();

		long[] dp = new long[w + 1];
		for (int i = 0; i < n; i++) {
			for (int j = w; j >= u[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - u[i]] + v[i]);
			}
		}

		long ans = 0;
		for (int j = 1; j <= w; j++) {
			ans = Math.max(ans, dp[j]);
		}
		System.out.println(ans);
	}
}
