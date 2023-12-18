import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Programming Contest
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();
		int m = parseInt(line.substring(0, line.indexOf(' ')));
		int n = parseInt(line.substring(line.indexOf(' ') + 1));

		int max = -1;
		for (int i = 0; i < m; i++) {
			line = br.readLine();
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if (line.charAt(j * 2) == '1') sum++;
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	} // end main
}