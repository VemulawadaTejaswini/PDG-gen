import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n, k;
		int[] stock;
		int[] needs;
		StringTokenizer st;

		next: while ((line = br.readLine()) != null && !line.isEmpty()) {

			n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if (n == 0 && k == 0) {
				break;
			}
			stock = new int[k];
			needs = new int[k];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < k; i++) {
				stock[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < k; j++) {
					needs[j] += Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 0; i < k; i++) {
				if (stock[i] < needs[i]) {
					System.out.println("No");
					continue next;
				}
			}
			System.out.println("Yes");
		}
	}
}