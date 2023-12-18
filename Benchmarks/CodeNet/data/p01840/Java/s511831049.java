import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Delivery to a Luxurious House
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N, M, T;
		N = parseInt(st.nextToken());
		M = parseInt(st.nextToken());
		T = parseInt(st.nextToken());

		int a[] = new int[N + 2];

		a[0] = -M;
		a[N + 1] = T + M;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			a[i + 1] = parseInt(st.nextToken());
		}

		int t = 0;

		for (int i = 1; i < N + 2; i++) {
			int _t = a[i] - a[i - 1] - 2 * M;
			if (_t > 0) t += _t;
		}

		System.out.println(t);

	} //end main
}