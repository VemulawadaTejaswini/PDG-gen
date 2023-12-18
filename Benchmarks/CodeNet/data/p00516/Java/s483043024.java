import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class P0593 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, m;
			int[][] vote;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));
			vote = new int[n][2];
			for (int i = 0; i < n; i++) {
				vote[i][0] = parseInt(br.readLine());
			}
			for (int i = 0; i < m; i++) {
				int cost = parseInt(br.readLine());
				for (int j = 0; j < n; j++) {
					if (vote[j][0] <= cost) {
						vote[j][1]++;
						break;
					}
				}
			}
			int event = 0, max = 0;
			for (int i = 0; i < n; i++) {
				if (vote[i][1] > max) {
					max = vote[i][1];
					event = i;
				}
			}
			System.out.println(event + 1);
		}

	}

}