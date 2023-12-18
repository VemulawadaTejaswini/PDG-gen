import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Rank Checker
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[][] rank = new int[101][3];

		// read.
		for (;;) {
			line = br.readLine();
			int p = parseInt(line.substring(0, line.indexOf(',')));// 整理番号
			int q = parseInt(line.substring(line.indexOf(',') + 1));// 正解数
			if ((p | q) == 0) {
				break;
			}
			rank[p][0] = p;
			rank[p][1] = q;
		}

		// ranking.
		Arrays.sort(rank, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		});

		rank[0][2] = 1;
		for (int j = 1; j < rank.length; j++) {
			if (rank[j][0] == 0) {
				break;
			}
			if (rank[j - 1][1] != rank[j][1]) {
				rank[j][2] = rank[j - 1][2] + 1;
			} else {
				rank[j][2] = rank[j - 1][2];
			}
		}

		Arrays.sort(rank, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == 0) {
					return 1;
				}
				if (o2[0] == 0) {
					return -1;
				}
				return o1[0] - o2[0];
			}
		});

		//
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(rank[parseInt(line) - 1][2]);
		}
	}
}