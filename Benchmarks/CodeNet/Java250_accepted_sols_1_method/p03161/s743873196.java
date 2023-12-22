import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int H[] = new int[N];
		long DP[] = new long[N];
		Arrays.fill(H, 0);
		Arrays.fill(DP, INF);

		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		DP[0] = 0;

		for(int now=1; now<N; now++) {
			for(int i=1; i<=K; i++) {
				if(now < i) break;
				DP[now] = Math.min(DP[now], DP[now-i]+Math.abs(H[now]-H[now-i]));
			}
		}

		// 出力
		System.out.println(DP[N-1]);
	}
}
