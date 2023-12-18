import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Daruma Otoshi
 */
public class Main {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[] bs = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				bs[i] = parseInt(st.nextToken());
			}

			count = 0;

			solve(0, bs);

			System.out.println(count);

		} //end while
	} //end main

	static void solve(int c, int[] bs) {

		if (c + bs.length <= count) {
			return;
		}

		int r = 0;

		for (int i = 0; i < bs.length - 1; i++) {
			if (Math.abs(bs[i] - bs[i + 1]) < 2) {
				int[] _blocks = new int[bs.length - 2];
				for (int j = 0, k = 0; j < bs.length; j++) {
					if (j != i && j != i + 1) {
						_blocks[k] = bs[j];
						k++;
					}
				}
				solve(c + 2, _blocks);
				r++;
			}
		}

		if (r == 0 && c > count) {
			count = c;
		}
	}
}