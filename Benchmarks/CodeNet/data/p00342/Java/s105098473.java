import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Maximization of Relational Expression
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		long[] a = Arrays.stream(br.readLine().split(" "))
				.mapToLong(Long::parseLong)
				.sorted()
				.toArray();

		double max = 0;

		for (int i = 0; i < N - 2; i++) {
			max = Math.max(max, ((double) a[N - 1] + a[N - 2]) / (a[i + 1] - a[i]));
		}

		max = Math.max(max, ((double) a[N - 1] + a[N - 3]) / (a[N - 2] - a[N - 4]));
		max = Math.max(max, ((double) a[N - 1] + a[N - 4]) / (a[N - 2] - a[N - 3]));
		max = Math.max(max, ((double) a[N - 2] + a[N - 4]) / (a[N - 1] - a[N - 3]));
		max = Math.max(max, ((double) a[N - 3] + a[N - 4]) / (a[N - 1] - a[N - 2]));

		System.out.println(max);

	}
}