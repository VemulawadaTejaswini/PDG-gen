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
		// AtCoder_B
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int P[] = new int[N];

		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}

		Arrays.sort(P);

		int ans = 0;
		for(int i=0; i<K; i++) {
			ans += P[i];
		}

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
