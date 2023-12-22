import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		Arrays.fill(dp, 2000000000);
		dp[0] = 0;
		int[] ashiba = new int[n];

		for(int i = 0; i < n; i++) {
			ashiba[i] = sc.nextInt();
		}

		for(int i = 1; i < n; i++) {
			if(i < 2) dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(ashiba[i - 1] - ashiba[i]));
			else {
				dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(ashiba[i - 1] - ashiba[i]));
				dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(ashiba[i - 2] - ashiba[i]));
			}
		}

		System.out.println(dp[n - 1]);
		sc.close();
	}
}
