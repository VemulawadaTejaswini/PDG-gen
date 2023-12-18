import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Equal Sum Sets
 */
public class Main {

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

			System.out.println(solve(n, k, s));

		} //end while
	} //end main

	public static int solve(int n, int c, int r) {

		int ret = 0;

		if (c == 0 && r == 0) {
			ret = 1;
		} else if (n != 0) {
			ret = solve(n - 1, c - 1, r - n)
					+ solve(n - 1, c, r);
		}
		return ret;
	}
}