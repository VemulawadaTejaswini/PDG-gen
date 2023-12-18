/**
 * Tunnel
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			int m = parseInt(br.readLine());
			int max = m;

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				if (max < 0) continue;

				int a = parseInt(line.substring(0, line.indexOf(' ')));
				int b = parseInt(line.substring(line.indexOf(' ') + 1));
				m = m + a - b;
				if (m < 0) {
					max = m;
				} else {
					max = Math.max(max, m);
				}
			}
			System.out.println(max);
		} //end while
	} //end main
}