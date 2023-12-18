import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Selecting Subjects
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int sum = 0;
		int min1 = 101, min2 = 101;

		for (int i = 0; i < 6; i++) {
			int n = parseInt(br.readLine());
			sum += n;
			if (i < 4) {
				min1 = Math.min(min1, n);
			} else {
				min2 = Math.min(min2, n);
			}
		}

		System.out.println(sum - min1 - min2);
	}
}