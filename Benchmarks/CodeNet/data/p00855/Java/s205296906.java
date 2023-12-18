import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Problem B: Prime Gap
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		boolean[] ps = new boolean[1299709 + 1];

		Arrays.fill(ps, 2, ps.length, true);

		for (int i = 2; i <= Math.sqrt(ps.length); i++) {
			if (ps[i]) {
				for (int j = i * 2; j < ps.length; j += i) {
					if (ps[j]) ps[j] = false;
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int k = parseInt(line);
			if (k == 0) break;

			int from = 0, to = 0;
			if (!ps[k]) {
				// from
				for (int i = k; ; i--) {
					if (ps[i]) {
						from = i;
						break;
					}
				}
				// to
				for (int i = k; ; i++) {
					if (ps[i]) {
						to = i;
						break;
					}
				}
			}
			System.out.println(to - from);

		} //end while
	} //end main
}