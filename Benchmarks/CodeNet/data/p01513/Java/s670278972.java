import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			boolean[][] privacy = new boolean[n + 1][n + 1];
			boolean[] suspects = new boolean[n + 1];

			// privacy[j][i] -> j known by i.
			for (int i = 1; i < n + 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				while (st.hasMoreTokens()) {
					privacy[parseInt(st.nextToken())][i] = true;
				}
			}

			//
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();

			Arrays.fill(suspects, true);
			while (st.hasMoreTokens()) {
				int l = parseInt(st.nextToken());
				for (int i = 1; i < n + 1; i++) suspects[i] &= privacy[l][i];
			}

			//
			int suspect = 0, count = 0;
			for (int i = 1; i < n + 1; i++) {
				if (suspects[i]) {
					suspect = i;
					count++;
				}
			}
			System.out.println(count == 1 ? suspect : -1);

		} //end while
	} //end main
}