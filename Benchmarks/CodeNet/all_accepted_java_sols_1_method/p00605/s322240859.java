import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] stock = new int[100];
		int[] needs = new int[100];

		next: while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | k) == 0) {
				break;
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < k; i++) {
				stock[i] = Integer.parseInt(st.nextToken());
				needs[i] ^= needs[i];
			}
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < k; j++) {
					needs[j] += Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 0; i < k; i++) {
				if (stock[i] < needs[i]) {
					sb.append("No\n");
					continue next;
				}
			}
			sb.append("Yes\n");
		}
		System.out.print(sb.toString());
	}
}