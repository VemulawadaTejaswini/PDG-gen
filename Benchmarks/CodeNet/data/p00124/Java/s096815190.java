import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean next = false;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;
			
			String[] teams = new String[n];
			int[][] points = new int[n][2];
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				teams[i] = st.nextToken();
				points[i][0] = i;
				points[i][1] = parseInt(st.nextToken()) * 3 + parseInt(st.nextToken()) * 0 + parseInt(st.nextToken());
			}
			Arrays.sort(points, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[1] == o2[1]) {
						return o1[0] - o2[0];
					} else {
						return o2[1] - o1[1];
					}
				}
			});
			if (next) System.out.println();
			next = true;
			for (int i = 0; i < n; i++) {
				System.out.println(teams[points[i][0]] + "," + points[i][1]);
			}
		}
	}
}