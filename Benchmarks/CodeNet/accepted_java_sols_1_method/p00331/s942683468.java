import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sunrise and Sunset
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int H, R;
		H = parseInt(line.substring(0, line.indexOf(' ')));
		R = parseInt(line.substring(line.indexOf(' ') + 1));

		if (H > -R) {
			System.out.println(1);
		} else if (H == -R) {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}
	}
}