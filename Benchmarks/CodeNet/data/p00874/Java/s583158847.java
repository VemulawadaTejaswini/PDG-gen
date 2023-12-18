import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Problem A: Cubist Artwork
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		P1295 main = new P1295();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int w, d;
			w = parseInt(line.substring(0, line.indexOf(' ')));
			d = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((w | d) == 0) break;

			int[][] h = new int[21][2];
			StringTokenizer st;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < w; i++) {
				h[parseInt(st.nextToken())][0]++;
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < d; i++) {
				h[parseInt(st.nextToken())][1]++;
			}

			int ans = 0;

			for (int i = 1; i <= 20; i++) {
				ans += i * Math.max(h[i][0], h[i][1]);
			}
			System.out.println(ans);
		}
	}
}