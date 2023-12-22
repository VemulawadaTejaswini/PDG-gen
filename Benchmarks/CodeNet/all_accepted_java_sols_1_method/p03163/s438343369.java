import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp   = scanner.nextLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int W = Integer.parseInt(temp[1]);

		int wgh = 0;
		long val = 0;

		long[][] dp  = new long[N + 1][W + 1];

		for(int i = 0; i <= W; i ++) {

			dp[0][i] = 0;

		}


		for(int i = 1; i <= N; i++) {
			String[] tmp = scanner.nextLine().split(" ");
			wgh = Integer.parseInt(tmp[0]);
			val = Long.parseLong(tmp[1]);

			for(int w = 1; w <= W; w++) {

				if(w >= wgh) dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wgh] + val);
				else dp[i][w] = dp[i - 1][w];

			}
		}

		System.out.println(dp[N][W]);


	}

}
