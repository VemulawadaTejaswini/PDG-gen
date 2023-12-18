import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Coastline
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int T, D, L;
			StringTokenizer st = new StringTokenizer(line);
			T = parseInt(st.nextToken());
			D = parseInt(st.nextToken());
			L = parseInt(st.nextToken());
			if ((T | D | L) == 0) break;

			int[] elapsed = new int[T + D + 1];

			for (int i = 1; i <= T; i++) {
				int x = parseInt(br.readLine());
				if (x >= L) {
					elapsed[i]++;
					elapsed[i + D]--;
				}
			}

			int ans = 0;

			for (int i = 1; i < T; i++) {
				elapsed[i] += elapsed[i - 1];
				if (elapsed[i] > 0) ans++;
			}

			System.out.println(ans);
		}
	}
}