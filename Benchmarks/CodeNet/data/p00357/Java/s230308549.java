import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Trampoline
 */
public class Main {

	static int N;
	static int[] d;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		N = parseInt(br.readLine());
		d = new int[N];

		for (int i = 0; i < N; i++) {
			d[i] = parseInt(br.readLine());
		}

		int a = solve();

		for (int i = 0, j = N - 1; i < N / 2; i++, j--) {
			int t = d[i];
			d[i] = d[j];
			d[j] = t;
		}

		int b = solve();

		System.out.println(a == 1 && b == 1 ? "yes" : "no");
	}

	static int solve() {
		int last = 0;
		for (int i = 0; i < N; i++) {
			if (last < i * 10) return 0;
			last = Math.max(last, i * 10 + d[i]);
		}
		return 1;
	}
}
