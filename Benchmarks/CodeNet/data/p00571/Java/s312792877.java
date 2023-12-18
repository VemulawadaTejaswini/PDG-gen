import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Art Exhibition
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		long[][] AB = new long[N][2];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			AB[i][0] = parseLong(line.substring(0, line.indexOf(' ')));
			AB[i][1] = parseLong(line.substring(line.indexOf(' ') + 1));
		}

		Arrays.sort(AB, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0], o2[0]);
			}
		});

		long ans, acc, min;
		ans = acc = min = 0;

		for (int i = 0; i < N; i++) {
			min = Math.min(min, acc - AB[i][0]);
			acc += AB[i][1];
			ans = Math.max(ans, acc - AB[i][0] - min);
		}

		System.out.println(ans);
	}
}
