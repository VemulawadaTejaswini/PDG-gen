import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] h;
	static int[] w;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0 && M == 0)
				break;
			h = new int[N + 1];
			w = new int[M + 1];
			for (int i = 0; i < N; ++i) {
				h[i + 1] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				w[i + 1] = sc.nextInt();
			}
			for (int i = 1; i <= N; ++i) {
				h[i] = h[i - 1] + h[i];
			}
			for (int i = 1; i <= M; ++i) {
				w[i] = w[i - 1] + w[i];
			}

			int[] hs = new int[1000 * 1000 + 1];
			int[] ws = new int[1000 * 1000 + 1];
			for (int i = 0; i <= N; ++i) {
				for (int j = i + 1; j <= N; ++j) {
					++hs[h[j] - h[i]];
				}
			}
			for (int i = 0; i <= M; ++i) {
				for (int j = i + 1; j <= M; ++j) {
					++ws[w[j] - w[i]];
				}
			}
			int ans = 0;
			for (int i = 1; i < hs.length; ++i) {
				ans += hs[i] * ws[i];
			}
			System.out.println(ans);
		}
		sc.close();
	}
}