import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Equal Sum Sets
 */
public class Main {

	public static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int n, k, s;
			n = parseInt(st.nextToken());
			k = parseInt(st.nextToken());
			s = parseInt(st.nextToken());
			if ((n | k | s) == 0) break;

			count = 0;
			solve(n, k, s);

			System.out.println(count);

		} //end while
	} //end main

	public static void solve(int n, int c, int r) {

		if (c == 0) {
			if (r == 0) count++;
			return;
		}

		if (n == 0) {
			return;
		}

		solve(n - 1, c - 1, r - n);
		solve(n - 1, c, r);
	}
}