import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int W = scan.nextInt();
		int[]v = new int[N];
		int[]w = new int[N];
		for(int i = 0; i < N; i++) {
			v[i] = scan.nextInt();
			w[i] = scan.nextInt();
		}
		scan.close();
		int[] dp = new int[W + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int i = 0; i < N; i++) {
			for(int j = W - w[i]; j >= 0; j--) {
				int t = j + w[i];
				if(dp[j] != -1 && t <= W) {
					dp[t] = Math.max(dp[t], dp[j] + v[i]);
				}
			}
		}
		int max = 0;
		for(int i : dp) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}
}
