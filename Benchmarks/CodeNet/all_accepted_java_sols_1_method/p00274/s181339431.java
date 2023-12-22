import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * A Pair of Prizes
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			int ans = 0;
			boolean a = false;

			StringTokenizer st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				int k = parseInt(st.nextToken());
				if (k > 0) ans++;
				if (k > 1) a |= true;
			}

			System.out.println(a ? ans + 1 : "NA");
		}
	}
}