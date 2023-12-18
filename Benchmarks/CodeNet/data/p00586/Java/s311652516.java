import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int c = line.indexOf(' ');
			System.out.println(
					parseInt(line.substring(0, c))
							+ +parseInt(line.substring(c + 1)
					));
		}
	}
}