import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][3];
		dp[0][0] = sc.nextInt();
		dp[0][1] = sc.nextInt();
		dp[0][2] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dp[i][0] = Math.max(dp[i-1][1]+a, dp[i-1][2]+a);
			dp[i][1] = Math.max(dp[i-1][0]+b, dp[i-1][2]+b);
			dp[i][2] = Math.max(dp[i-1][0]+c, dp[i-1][1]+c);
		}
		int max = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
		System.out.println(max);
		sc.close();
	}

}