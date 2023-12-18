import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Computation of Salary
 * PCK2013 ??¬???2
 */
public class Main {

	static final int MAX = 50_000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] s = new int[MAX];
		int[] t = new int[MAX];
		int[] e = new int[MAX];

		int i = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			s[i] = parseInt(words[0]);
			t[i] = parseInt(words[1]);
			e[i] = parseInt(words[2]);

			if ((s[i] | t[i] | e[i]) == 0) break;

			i++;

		}//end while

		int L;
		L = parseInt(br.readLine());

		for (int j = 0; j < L; j++) {

			words = br.readLine().split(" ");

			int[] S = new int[N + 1];
			int[] P = new int[M + 1];

			for (int k = 0; k < words.length; k++) {
				P[k + 1] = parseInt(words[k]);
			}

			for (int k = 0; k < MAX; k++) {
				if ((s[k] | t[k] | e[k]) == 0) break;
				S[s[k]] = P[t[k]] * e[k];
			}

			//out
			StringBuilder sb = new StringBuilder();
			for (int k = 1; k < S.length; k++) {
				if (k > 1) sb.append(" ");
				sb.append(S[k]);
			}
			System.out.println(sb.toString());
		}

	}//end main
}