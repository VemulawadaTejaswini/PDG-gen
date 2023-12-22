import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			int L = scan.nextInt();

			int[][] distanceMap = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					distanceMap[i][j] = i == j ? 0 : 1001001001;
				}
			}
			for (int i = 0; i < m; i++) {
				int from = scan.nextInt() - 1;
				int to = scan.nextInt() - 1;
				int len = scan.nextInt();
				distanceMap[from][to] = distanceMap[to][from] = len;
			}

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						distanceMap[i][j] = Math.min(distanceMap[i][j], distanceMap[i][k] + distanceMap[k][j]);
					}
				}
			}

			int[][] supplyMap = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					supplyMap[i][j] = 1001001001;
					if(distanceMap[i][j] <= L)
					supplyMap[i][j] = 1;
				}
			}

			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						supplyMap[i][j] = Math.min(supplyMap[i][j], supplyMap[i][k] + supplyMap[k][j]);
					}
				}
			}

			int Q = scan.nextInt();

			int[] start = new int[Q];
			int[] end = new int[Q];

			for (int i = 0; i < Q; i++) {
				int s = scan.nextInt() - 1;
				int e = scan.nextInt() - 1;
				start[i] = s;
				end[i] = e;
			}

			for (int i = 0; i < Q; i++) {
				int ans = supplyMap[start[i]][end[i]] == 1001001001? -1: supplyMap[start[i]][end[i]]-1;
				System.out.println(ans);
			}

		}
	}
}