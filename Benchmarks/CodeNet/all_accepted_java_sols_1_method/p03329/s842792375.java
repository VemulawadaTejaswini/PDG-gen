import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int dp[] = new int[n+10];
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			int pow6=1;
			while(0<=i-pow6&&i-pow6<=n) {
			dp[i]=Math.min(dp[i], dp[i-pow6]+1);
			pow6*=6;
			}
			int pow9=1;
			while(0<=i-pow9&&i-pow9<=n) {
			dp[i]=Math.min(dp[i], dp[i-pow9]+1);
			pow9*=9;
			}
		}
		System.out.println(dp[n]);
	}
}