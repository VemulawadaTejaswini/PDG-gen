import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 */
public class Main {

	static int[] A;
	static int[] E;
	static int[] R;
	static int min;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int D, N;
			D = parseInt(line.substring(0, line.indexOf(' ')));
			N = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((D | N) == 0) break;

			A = new int[N];
			E = new int[N];
			R = new int[N];
			min = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				words = br.readLine().split(" ");
				A[i] = parseInt(words[0]);
				E[i] = parseInt(words[1]);
				R[i] = parseInt(words[2]);
			}

			boolean possible = false;

			for (int i = 0; i < N; i++) {
				if (R[i] == 0 && E[i] > 0) {
					possible = true;
					break;
				}
			}

			for (int i = 0; i < N; i++) {
				if (possible && A[i] > 0) {
					break;
				}
			}

			if (possible) {
				rec(D, 0, 0);
				System.out.println(min);
			} else {
				System.out.println("NA");
			}

		}
	}

	static void rec(int d, int e, int c) {

		if (c >= min && d > 0) {
			return;
		}

		if (d <= 0) {
			min = Math.min(min, c);
			return;
		}

		for (int i = A.length - 1; i >= 0; i--) {
			if (R[i] <= e) {
				rec(d - A[i], e + E[i], c + 1);
			}
		}
	}
}