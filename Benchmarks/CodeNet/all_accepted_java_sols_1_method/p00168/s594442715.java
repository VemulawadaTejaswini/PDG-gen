import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			} else if (n == 1) {
				System.out.println(1);
				continue;
			} else if (n == 2) {
				System.out.println(1);
				continue;
			}
			
			int[] dp = new int[n+1];
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = dp[0] + dp[1];
			
			for (int i = 3; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			
			int d = dp[n] / 10;
			int y = (d-1) / 365 + 1;
			System.out.println(y);
		}
	}
}