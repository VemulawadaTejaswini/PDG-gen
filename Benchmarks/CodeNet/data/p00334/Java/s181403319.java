import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Geometric Data
 */
public class Main {

	static final int MAX = 1000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		boolean[][][] P = new boolean[MAX + 1][MAX + 1][MAX + 1];
		int count = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p1, p2, p3;
			p1 = parseInt(st.nextToken());
			p2 = parseInt(st.nextToken());
			p3 = parseInt(st.nextToken());
			if (P[p1][p2][p3]) count++;
			else P[p1][p2][p3] = true;
		}

		System.out.println(count);
	}
}