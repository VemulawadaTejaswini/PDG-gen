import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Salary for a Plumber
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int max = 0;
			int len = 0;
			int[] joint = new int[n - 1];

			StringTokenizer st;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				len += parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n - 1; i++) {
				joint[i] = parseInt(st.nextToken());
				len += joint[i];
			}
			Arrays.sort(joint);

			max = len;
			for (int i = 0; i < n - 1; i++) {
				len -= joint[i];
				max = Math.max(max, len * (i + 2));
			}
			System.out.println(max);
		}
	}
}