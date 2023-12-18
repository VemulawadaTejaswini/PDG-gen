import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Reservation System
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int[] reserve = new int[1001];

		line = br.readLine();

		int a, b;
		a = parseInt(line.substring(0, line.indexOf(' ')));
		b = parseInt(line.substring(line.indexOf(' ') + 1));

		reserve[a]++;
		reserve[b]--;

		int N = parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			int s, f;
			s = parseInt(line.substring(0, line.indexOf(' ')));
			f = parseInt(line.substring(line.indexOf(' ') + 1));
			reserve[s]++;
			reserve[f]--;
		}

		int ans = 0;

		for (int i = 1; i <= 1000; i++) {
			reserve[i] += reserve[i - 1];
			if (reserve[i] > 1) {
				ans = 1;
				break;
			}
		}

		System.out.println(ans);
	}
}