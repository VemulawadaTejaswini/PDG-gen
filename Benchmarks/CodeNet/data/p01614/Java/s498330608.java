import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());
		Map<Integer, Integer> P = new HashMap<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s, l, p;
			s = parseInt(st.nextToken());
			l = parseInt(st.nextToken());
			p = parseInt(st.nextToken());
			for (int j = s; j <= l; j++) {
				P.putIfAbsent(j, 0);
				P.put(j, Math.max(P.get(j), p));
			}
		}

		int m = parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		boolean notfound = false;

		for (int i = 0; i < m; i++) {
			int w = parseInt(br.readLine());
			int[] dp = new int[w + 1];
			for (Map.Entry<Integer, Integer> p : P.entrySet()) {
				for (int j = p.getKey(); j <= w; j++) {
					dp[j] = Math.max(dp[j], dp[j - p.getKey()] + p.getValue());
				}
			}
			if (dp[w] == 0) {
				notfound = true;
				break;
			}
			ans.append(dp[w]).append('\n');
		}

		if (notfound) {
			System.out.println(-1);
		} else {
			System.out.print(ans.toString());
		}
	}
}

