import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/*
 * Problem B: Thanksgiving
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, m;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;

			int[] p = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) p[i] = parseInt(st.nextToken());
			Arrays.sort(p);

			//
			int ans = 0;

			if (n >= m) {
				int r = n % m;
				for (int i = 0; i < r; i++) {
					ans += p[i];
				}
				for (int i = r; i < n; i++) {
					if (((i - r) % m) != 0) ans += p[i];
				}
			} else {
				for (int i = 0; i < n; i++) {
					ans += p[i];
				}
			}

			System.out.println(ans);
		}
	}
}