import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long INF = 1L << 60;
	static long[] h = new long [100010];
	static long[] dp = new long [100100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		for(int i=0;i<n;i++)h[i] = Long.parseLong(sc.next());
		sc.close();
		//初期化(INF)
		Arrays.fill(dp,INF);
		dp[0] = 0;

		for(int i=1;i<n;i++) {
			 for (int j = 1; j <= k&&j<=i; j++) {
				 	dp[i]=Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i - j]));
		        }
		}
		System.out.println(dp[n-1]);

	}

}

