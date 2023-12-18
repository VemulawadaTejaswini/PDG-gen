/**
 * Maximum Sum Sequence II
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			int[][] matrix = new int[n + 2][n + 2];

			for (int i = 1; i < n + 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 1; j < n + 1; j++) {
					matrix[i][j] = parseInt(st.nextToken()) + matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1];
				}
			}

			//
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n + 1; j++) {
					for (int k = 0; k < n; k++) {
						for (int l = k + 1; l < n + 1; l++) {
							max = Math.max(max, matrix[j][l] - matrix[j][k] - matrix[i][l] + matrix[i][k]);
						}
					}
				}
			}
			System.out.println(max);
		} //end while
	} //end main
}