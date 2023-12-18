import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Ohajiki Game
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int i = parseInt(line);
			if (i == 0) break;

			int[] a = new int[i];

			words = br.readLine().split(" ");
			for (int j = 0; j < i; j++) {
				a[j] = parseInt(words[j]);
			}

			int n = 32, j = 0;
			while (true) {
				n -= (n - 1) % 5;
				System.out.println(n);
				if (n <= 0) break;

				if (n >= a[j % i]) {
					n -= a[j % i];
				} else {
					n = 0;
				}
				j++;
				System.out.println(n);
				if (n <= 0) break;
			}

		} //ene while
	}//end main
}