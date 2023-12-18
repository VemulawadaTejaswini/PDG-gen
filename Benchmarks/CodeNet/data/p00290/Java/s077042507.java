import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * The Number of Chairs
 * PCK2014 ??????1
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		words = br.readLine().split(" ");

		int d, c;
		d = parseInt(words[1]);
		c = parseInt(words[2]);

		System.out.println(d * c);
	}
}