import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		sc.nextLine();

		int[] h = new int[n + 1];
		int[] dp = new int[n + 1];

		h[0] = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			h[i] = sc.nextInt();
			dp[i] = Integer.MAX_VALUE;
		}

		dp[1] = 0;
		for (int j = 1; j < n; j++) {
			for (int a = 1; a <= k; a++) {
				if (j + a <= n) {
					dp[j + a] = Math.min(dp[j + a], dp[j] + Math.abs(h[j] - h[j + a]));
				}
			}
		}

		System.out.println(dp[n]);

	}
}
