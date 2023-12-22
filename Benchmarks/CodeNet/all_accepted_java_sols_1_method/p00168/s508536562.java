import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dp = new int[30];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		for (int i = 3; i < 30; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			int d = dp[n - 1] / 10 + Math.min(1, dp[n - 1] % 10);
			int y = d / 365 + Math.min(1, d % 365);
			System.out.println(y);
		}
		
		sc.close();
	}
}