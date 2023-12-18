import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Broken Audio Signal
 */
public class Main {

	static final long MAX = (1L << 32) + 1;
	static final long MIN = MAX * -1;
	static final long X = MAX - 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			StringTokenizer st = new StringTokenizer(br.readLine());

			long[] a = new long[N + 2];
			int c = 0;
			for (int i = 0; i < N + 2; i++) {
				if (i == 0) {
					a[0] = MAX;
				} else if (i == N + 1) {
					if (i % 2 == 0) {
						a[i] = MAX;
					} else {
						a[i] = MIN;
					}
				} else {
					String token = st.nextToken();
					if (token.equals("x")) {
						a[i] = X;
						c++;
					} else {
						a[i] = parseInt(token);
					}
				}
			}

			//
			long min = MAX, max = MIN;
			for (int i = 1; i <= N; i++) {
				if (a[i] == X) {
					if (i % 2 == 0) {
						max = Math.max(max, Math.max(a[i - 1], a[i + 1]) + 1);
					} else {
						min = Math.min(min, Math.min(a[i - 1], a[i + 1]) - 1);
					}
				} else {
					if (i % 2 == 0) {
						if (a[i] <= a[i - 1] || a[i] <= a[i - 1]) {
							min = MIN;
							max = MAX;
							break;
						}
					} else {
						if (a[i] >= a[i - 1] || a[i] >= a[i - 1]) {
							min = MIN;
							max = MAX;
							break;
						}
					}
				}
			}

			if (max == min) System.out.println(min);
			else if (min - max > 0) System.out.println("ambiguous");
			else System.out.println("none");

		} //end while
	} //end main
}