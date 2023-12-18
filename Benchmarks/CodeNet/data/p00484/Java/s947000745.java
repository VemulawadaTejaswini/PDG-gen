import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Books
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N, K;
		line = br.readLine();
		N = parseInt(line.substring(0, line.indexOf(' ')));
		K = parseInt(line.substring(line.indexOf(' ') + 1));

		Map<Integer, List<Integer>> CG = new HashMap<>();

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			int C, G;
			C = parseInt(line.substring(0, line.indexOf(' ')));
			G = parseInt(line.substring(line.indexOf(' ') + 1));
			CG.putIfAbsent(G, new ArrayList<>());
			CG.get(G).add(C);
		}

		for (int i = 1; i <= 10; i++) {
			if (CG.containsKey(i)) {
				Collections.sort(CG.get(i), Comparator.reverseOrder());
				for (int j = 1; j < CG.get(i).size(); j++) {
					CG.get(i).set(j, CG.get(i).get(j) + CG.get(i).get(j - 1));
				}
				for (int j = 1; j < CG.get(i).size(); j++) {
					CG.get(i).set(j, CG.get(i).get(j) + j * (j + 1));
				}
			}
		}

		//[?????£??????][?£??????¬????????°]
		int[][] dp = new int[11][K + 1];

		for (int i = 1; i <= 10; i++) {
			if (CG.containsKey(i)) {
				for (int j = 0; j <= K; j++) {
					for (int k = 0; k < CG.get(i).size(); k++) {
						if (j + k + 1 <= K) {
							dp[i][j + k + 1] = Math.max(dp[i][j + k + 1], dp[i - 1][j] + CG.get(i).get(k));
						}
					}
				}
			} else {
				for (int j = 0; j <= K; j++) {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		System.out.println(dp[10][K]);
	}
}