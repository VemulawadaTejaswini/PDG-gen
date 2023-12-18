import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Amida, the City of Miracle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int n = parseInt(st.nextToken()); // ???????????¬??°
			int m = parseInt(st.nextToken()); // ?¨?????????¬??°
			int a = parseInt(st.nextToken()); // ????????????????????????

			if ((n | m | a) == 0) break;

			int[][] amida = new int[n + 1][1001];
			int top = 0;

			for (int i = 0; i < m; i++) {
				line = br.readLine();
				st = new StringTokenizer(line);
				int h = parseInt(st.nextToken());
				int p = parseInt(st.nextToken());
				int q = parseInt(st.nextToken());
				amida[p][h] = q;
				amida[q][h] = p;
				if (h > top) top = h;
			}

			int b = a;
			for (int i = top; i >= 1; i--) {
				if (amida[b][i] > 0) b = amida[b][i];
			}
			System.out.println(b);
		} // end while
	} // end main
}