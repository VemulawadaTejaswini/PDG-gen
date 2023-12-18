import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int	vLim	= 0;
	static int	ｗLim	= 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ｗLim = in.nextInt();

		// 1-originにしたいので
		int weight[] = new int[num + 1];
		int value[] = new int[num + 1];
		for ( int i = 1; i <= num; i++ ) {
			weight[i] = in.nextInt();
			value[i] = in.nextInt();
			vLim += value[i];
		}
		in.close();

		long dp[][] = new long[num + 1][vLim + 1];
		for ( long[] ls : dp ) {
			Arrays.fill(ls, Integer.MAX_VALUE);
		}

		for ( int i = 0; i <= num; i++ ) {
			dp[i][0] = 0;
		}

		long ans = 0;
		for ( int n = 1; n <= num; n++ ) {
			for ( int v = 1; v <= vLim; v++ ) {
				dp[n][v] = dp[n - 1][v];

				if ( v - value[n] >= 0 && dp[n - 1][v - value[n]] + weight[n] < dp[n][v] ) {
					dp[n][v] = dp[n - 1][v - value[n]] + weight[n];
				}
			}
		}

//		for ( long[] ls : dp ) {
//			for ( long l : ls ) {
//				System.out.printf("%3d ", l);
//			}
//			System.out.println();
//		}


		for ( int i = 1; i <= vLim; i++ ) {
			if(dp[num][i] <= ｗLim && ans < i) {
				ans = i;
			}
		}
		System.out.println(ans);

	}
}
