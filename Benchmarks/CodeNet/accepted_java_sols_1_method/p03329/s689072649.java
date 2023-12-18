import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[100010];
		for(int i = 0 ; i < 100010 ; i++) dp[i] = Integer.MAX_VALUE;
		dp[0] = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int pow6 = 1 ; i + pow6 <= n ; pow6 *= 6) dp[i + pow6] = Math.min(dp[i] + 1, dp[i + pow6]);
			for(int pow9 = 1 ; i + pow9 <= n ; pow9 *= 9) dp[i + pow9] = Math.min(dp[i] + 1, dp[i + pow9]);
		}
		System.out.println(dp[n]);
	}
}
