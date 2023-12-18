import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Bamboo Blossoms
 */
public class Main {

	static final int MAX = 7368792;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m, n;
			m = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((m | n) == 0) break;

			boolean[] years = new boolean[MAX];
			int ans = 0;

			for (int i = 0, j = m; i < n; ) {
				if (!years[j]) {
					for (int k = j; k < MAX; k += j) {
						years[k] = true;
					}
					i++;
				}
				ans = ++j;
			}

			for (int i = ans; i < MAX; i++) {
				if (!years[i]) {
					ans = i;
					break;
				}
			}

			System.out.println(ans);

		} //end while
	} //end main
}