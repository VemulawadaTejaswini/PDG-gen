import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Final Examination!
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int max = 0;
			int min = 500;

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int sum = 0;
				while (st.hasMoreElements()) {
					sum += parseInt(st.nextToken());
				}
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			System.out.println(max + " " + min);
		} // end while
	} // end main
}