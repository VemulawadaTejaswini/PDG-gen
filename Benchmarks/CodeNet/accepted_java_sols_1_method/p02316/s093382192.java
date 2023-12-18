import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int dp[] = new int[W+1];
		for(int i = 0; i < dp.length; i++){
			dp[i] = -1;
		}
		dp[0] = 0;

		int value,weight;

		for(int loop = 0; loop < N; loop++){

			value = sc.nextInt();
			weight = sc.nextInt();

			for(int i = 0; i+weight <= W; i++){
				if(dp[i] == -1)continue;
				dp[i+weight] = Math.max(dp[i+weight],dp[i]+value);
			}
		}

		int ans = 0;
		for(int i = 1; i <= W; i++){
			ans = Math.max(ans, dp[i]);
		}

		System.out.println(ans);
	}
}

