import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), L = sc.nextInt();
		int[] K = new int[N];
		long[] S = new long[M];
		for (int i = 0; i < N; i++) {
			K[i] = sc.nextInt() - 1;
		}
		for (int i = 0; i < M; i++) {
			S[i] = sc.nextLong();
		}
		long[] accum = new long[M];
		for (int i = 0; i < M; i++) {
			if (i >= 1)
				accum[i] += accum[i - 1];
			accum[i] += S[i];
		}
		Arrays.sort(K);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {
				if (K[i] == K[i + 1]) {
					ans += S[K[i]] / L;
					continue;
				}
				ans += Math.abs((accum[K[i + 1]] - accum[K[i]] + S[K[i]]) / L);
			} else {
				ans += Math.abs((accum[K[N - 1]] - accum[K[0]] + S[K[0]]) / L);
			}
		}
		System.out.println(ans);
	}
}