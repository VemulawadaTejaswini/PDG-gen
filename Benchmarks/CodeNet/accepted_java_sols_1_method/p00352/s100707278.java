import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Handsel
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int a, b;
		a = parseInt(line.substring(0, line.indexOf(' ')));
		b = parseInt(line.substring(line.indexOf(' ') + 1));

		System.out.println((a + b) / 2);
	}
}