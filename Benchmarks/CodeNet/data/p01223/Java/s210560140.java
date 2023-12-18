import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Saizo
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n = parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int t = parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			int up = 0, down = 0;
			int prev = parseInt(st.nextToken()), next, diff;

			for (int j = 1; j < t; j++) {
				next = parseInt(st.nextToken());
				diff = prev - next;
				if (diff < 0) {
					if (diff < up) up = diff;
				} else if (diff > 0) {
					if (diff > down) down = diff;
				}
				prev = next;
			}
			System.out.println(-up + " " + down);
		}
	}
}