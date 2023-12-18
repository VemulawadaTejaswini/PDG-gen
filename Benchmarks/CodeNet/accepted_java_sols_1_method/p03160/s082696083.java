import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n];
		long[] h = new long[n];
		for(int i = 0; i < n ; i++) {
			h[i] = sc.nextLong();
		}
		for(int i = 0 ; i < n ; i ++) {
			if(i == 0) {
				dp[i] = 0;
			}
			else if(i == 1) {
				dp[i] = Math.abs(h[i] - h[i - 1]);
			}
			else {
				dp[i] = Math.min(dp[i - 2] + Math.abs(h[i] - h[i - 2]), dp[i - 1] + Math.abs(h[i] - h[i - 1]));
			}
		}

		System.out.println(dp[n - 1]);

	}


}

