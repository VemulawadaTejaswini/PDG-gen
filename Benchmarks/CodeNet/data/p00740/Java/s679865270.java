/**
 * Next Mayor
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

			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int p = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | p) == 0) break;

			int bowl = p;
			int[] candidate = new int[n];
			int next = -1;

			for (int i = 0; ; i++) {
				if (i == n) i = 0;
				if (bowl > 0) {
					candidate[i]++;
					bowl--;
					if (candidate[i] == p) {
						next = i;
						break;
					}
				} else {
					bowl = candidate[i];
					candidate[i] = 0;
				}
			}
			System.out.println(next);
		} //end while
	} //end main
}