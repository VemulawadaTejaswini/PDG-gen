import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * RUPC
 */
public class Main {

	static final int MAX = 300_001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//
		int N = parseInt(br.readLine());
		long[] sum = new long[MAX];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int a = parseInt(st.nextToken());
			sum[a]++;
		}

		for (int i = 1; i < MAX; i++) {
			sum[i] = sum[i] * i + sum[i - 1];
		}

		//
		int M = parseInt(br.readLine());
		int[] b = new int[M];
		int[] c = new int[M];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			b[i] = parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			c[i] = parseInt(st.nextToken());
		}

		//
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			if (sum[b[i]] >= c[i]) {
				sb.append("Yes\n");
			} else {
				sb.append("No\n");
			}
		}

		System.out.print(sb.toString());

	}
}