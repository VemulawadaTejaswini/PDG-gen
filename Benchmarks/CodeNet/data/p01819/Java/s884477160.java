import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Where is the Boundary
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] p = new int[n + 2];

		for (int i = 0; i < m; i++) {
			line = br.readLine();
			for (int j = 0; j < n; j++) {
				if (line.charAt(j) == 'W') { p[j + 1]++;} else {p[j + 1]--;}
			}
		}

		int b = 0;
		for (b = 0; b <= n; b++) {
			if (p[b + 1] <= 0) break;
		}

		System.out.println(b + " " + (b + 1));

	} //end main
}