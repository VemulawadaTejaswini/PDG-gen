import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			c[i] = sc.nextInt();
		}

		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < m; j++) {
				if (i - c[j] >= 0) {
					dp[i] = Math.min(dp[i], dp[i - c[j]] + 1);
				}
			}
		}
		
		System.out.println(dp[n]);

		sc.close();
	}
}