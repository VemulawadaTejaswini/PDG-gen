import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Cuboid
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[] sides = new int[1001];

		for (int i = 0; i < 6; i++) {
			line = br.readLine();
			int h, w;
			h = parseInt(line.substring(0, line.indexOf(' ')));
			w = parseInt(line.substring(line.indexOf(' ') + 1));
			sides[h] += 2;
			sides[w] += 2;
		}

		boolean ans = true;

		for (int i = 1; i < sides.length; i++) {
			if (!(sides[i] == 0 || sides[i] == 8 || sides[i] == 16 || sides[i] == 24)) {
				ans = false;
				break;
			}
		}

		System.out.println(ans ? "yes" : "no");

	} // end main
}