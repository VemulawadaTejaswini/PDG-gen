import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Patrol
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int[] degs = new int[101];

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int a, b;
			a = parseInt(line.substring(0, line.indexOf(' ')));
			b = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((a | b) == 0) {
				for (int i = 1; i < degs.length; i++) {
					if (i != 1 && i != 2 && degs[i] % 2 == 1) {
						System.out.println("NG");
						return;
					}
				}
				System.out.println("OK");
				Arrays.fill(degs, 0);
				continue;
			}
			degs[a]++;
			degs[b]++;
		}
	}
}