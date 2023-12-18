import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Problem B: Thanksgiving
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, m;
			int[] p;
			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) {
				break;
			}
			p = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				p[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(p);

			int sum = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (n >= m) {
					if ((n - i) % m != 0) {
						sum += p[i];
					}
				} else {
					sum += p[i];
				}
			}
			System.out.println(sum);
		}
	}
}