import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] As = new int[N+1];
		int[] Bs = new int[N+1];
		int[] Cs = new int[N+1];
		int[][] dp = new int[N+1][3];

		As[0] = 0;
		Bs[0] = 0;
		Cs[0] = 0;
		for (int i = 0; i <= N; ++i) {
			for (int j = 0; j < 3; ++j) {
				dp[i][j] = 0;
			}
		}
		for (int i = 1; i <= N; ++i) {
			As[i] = sc.nextInt();
			Bs[i] = sc.nextInt();
			Cs[i] = sc.nextInt();
		}
		dp[1][0] = As[1];
		dp[1][1] = Bs[1];
		dp[1][2] = Cs[1];


		//dp[i][j] := i日目までの最大の幸福度。jは、a or b or c ( 0 or 1 or 2)
		for (int i = 2; i <= N; ++i) {
			dp[i][0] = Math.max(dp[i-1][1] + As[i], dp[i-1][2] + As[i]);
			dp[i][1] = Math.max(dp[i-1][0] + Bs[i], dp[i-1][2] + Bs[i]);
			dp[i][2] = Math.max(dp[i-1][0] + Cs[i], dp[i-1][1] + Cs[i]);
		}
		System.out.println(Math.max(dp[N][2],Math.max(dp[N][0], dp[N][1])));
	}

}
