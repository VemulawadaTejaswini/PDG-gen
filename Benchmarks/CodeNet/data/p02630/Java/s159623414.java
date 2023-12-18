import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	static long chmin(long a, long b) {
		return Math.min(a, b);
	}

	static long chmax(long a, long b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int AWk[] = new int[100001];
		Arrays.fill(AWk, 0);

		for(int i=0; i<N; i++) {
			AWk[sc.nextInt()]++;
		}

		// 初期ansを求めておく
		long ans = 0;
		for(int j=0; j<100001; j++) {
			ans += j*AWk[j];
		}

		int Q = sc.nextInt();

		for(int i=0; i<Q; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();

			ans += (C-B)*AWk[B];
			System.out.println(ans);

			AWk[C] += AWk[B];
			AWk[B] = 0;
		}

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
