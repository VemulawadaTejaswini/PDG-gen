import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Hs = new int[N+1];
		Hs[0] = Integer.MAX_VALUE;
		for (int i = 1; i <= N; ++i) Hs[i] = sc.nextInt();
		int[] dp = new int[N+1];
		Arrays.fill(dp, 0);
		dp[2] = Math.abs(Hs[2]-Hs[1]);
		if(N == 2) {

			System.out.println(Math.abs(Hs[2]-Hs[1]));

		}else {

			for (int i = 3; i <= N; ++i) {

				dp[i] = Math.min(dp[i-1] + Math.abs(Hs[i-1]-Hs[i]), dp[i-2] + Math.abs(Hs[i-2]-Hs[i]));
			}
			System.out.println(dp[N]);
		}
	}

}
