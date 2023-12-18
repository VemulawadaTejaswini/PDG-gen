import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0) break;
			int[] P = new int[N];
			for (int i = 0; i < N; ++i) {
				P[i] = sc.nextInt();
			}
			int[] t = new int[N * (N + 1) / 2 + N + 1];
			int pos = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = i; j < N; ++j) {
					t[pos++] = P[i] + P[j];
				}
			}
			for (int i = 0; i < N; ++i) {
				t[pos++] = P[i];
			}
			Arrays.sort(t);
			int ans = 0;
			int r = t.length - 1;
			for (int i = 0; i <= r; ++i) {
				while (r >= 0 && t[i] + t[r] > M) {
					--r;
				}
				if (r >= 0) ans = Math.max(ans, t[i] + t[r]);
			}
			System.out.println(ans);
		}
	}
}