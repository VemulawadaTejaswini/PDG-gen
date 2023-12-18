import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A-un Breathing
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		int a = 0, u = 0;
		boolean order = true;

		for (int i = 0; i < N; i++) {

			if (br.readLine().equals("A")) {
				a++;
			} else {
				u++;
				if (u > a) {
					order = false;
					break;
				}
			}
		}

		if ((a == u) && order) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	} //end main
}