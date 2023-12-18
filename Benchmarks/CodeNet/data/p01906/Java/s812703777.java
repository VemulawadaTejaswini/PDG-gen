import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Weight Range
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		words = br.readLine().split(" ");

		int[] A = new int[N * 2];
		for (int i = 0; i < N; i++) {
			A[i] = A[i + N] = parseInt(words[i]);
		}

		int lcm = lcm(N, M);
		int ans = 0;

		for (int i = 0; i < lcm; i += M) {
			int[] a = Arrays.copyOfRange(A, i % N, i % N + M);
			Arrays.sort(a);
			ans += a[M - 1] - a[0];
		}

		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}
}