import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Koto Municipal Subway
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int D, E;
			D = parseInt(line.substring(0, line.indexOf(' ')));
			E = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((D | E) == 0) break;

			double min = Double.POSITIVE_INFINITY;
			for (int x = 0; x <= D / 2; x++) {
				int y = D - x;
				min = Math.min(min, Math.abs(Math.sqrt(x * x + y * y) - E));
			}
			System.out.println(min);
		} //end while
	} //end main
}