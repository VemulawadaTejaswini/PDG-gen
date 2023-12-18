import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		boolean newLine = false;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);

			for (int i = 0; i < n; i++) {
				//
				int[][] puzzle = new int[9][9];
				boolean[][] result = new boolean[9][9];

				for (int j = 0; j < 9; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					for (int k = 0; k < 9; k++) {
						puzzle[j][k] = parseInt(st.nextToken());
					}
				}

				int[] occured = new int[10];

				//行
				for (int j = 0; j < 9; j++) {
					Arrays.fill(occured, 0);
					for (int k = 0; k < 9; k++) {
						occured[puzzle[j][k]]++;
						if (occured[puzzle[j][k]] > 1) result[j][k] = true;
					}
				}
				for (int j = 8; j >= 0; j--) {
					Arrays.fill(occured, 0);
					for (int k = 8; k >= 0; k--) {
						occured[puzzle[j][k]]++;
						if (occured[puzzle[j][k]] > 1) result[j][k] = true;
					}
				}

				//列
				for (int j = 0; j < 9; j++) {
					Arrays.fill(occured, 0);
					for (int k = 0; k < 9; k++) {
						occured[puzzle[k][j]]++;
						if (occured[puzzle[k][j]] > 1) result[k][j] = true;
					}
				}
				for (int j = 8; j >= 0; j--) {
					Arrays.fill(occured, 0);
					for (int k = 8; k >= 0; k--) {
						occured[puzzle[k][j]]++;
						if (occured[puzzle[k][j]] > 1) result[k][j] = true;
					}
				}

				// 3x3
				for (int j = 0; j < 9; j += 3) {
					for (int k = 0; k < 9; k += 3) {
						Arrays.fill(occured, 0);
						for (int l = j; l < j + 3; l++) {
							for (int m = k; m < k + 3; m++) {
								occured[puzzle[l][m]]++;
								if (occured[puzzle[l][m]] > 1) result[l][m] = true;
							}
						}
					}
				}
				for (int j = 8; j > 0; j -= 3) {
					for (int k = 8; k > 0; k -= 3) {
						Arrays.fill(occured, 0);
						for (int l = j; l > j - 3; l--) {
							for (int m = k; m > k - 3; m--) {
								occured[puzzle[l][m]]++;
								if (occured[puzzle[l][m]] > 1) result[l][m] = true;
							}
						}
					}
				}

				//出力
				if (newLine) System.out.println();
				newLine = true;
				for (int j = 0; j < 9; j++) {
					for (int k = 0; k < 9; k++) {
						if (result[j][k])
							System.out.print("*" + puzzle[j][k]);
						else
							System.out.print(" " + puzzle[j][k]);
					}
					System.out.println();
				}
			}
		}
	}
}