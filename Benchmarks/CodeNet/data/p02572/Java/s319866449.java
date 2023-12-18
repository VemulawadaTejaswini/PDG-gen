import java.util.*;

public class Main {

	static long MOD = 1000000007l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		// 累積和
		long[] S = new long[N + 1];
		S[0] = 0;
		for (int i = 0; i < N; i++) {
			S[i + 1] = (S[i] + A[i]) % MOD;
		}

		long ans = 0;
		for (int i = N - 1; i > 0; i--) {
			ans += A[i] * S[i];
			ans %= MOD;
		}

		System.out.println(ans);
	}
}
