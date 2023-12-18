import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		char[][] room = new char[3][3];
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				room[i][j] = (char) ('A' + i * 3 + j);
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int s = sc.next().charAt(0) - 'A';
			int t = sc.next().charAt(0) - 'A';
			char b = sc.next().charAt(0);
			int r = s / 3;
			int c = s % 3;
			double[][] prob = new double[3][3];
			prob[r][c] = 1;
			for (int i = 0; i < N; ++i) {
				double[][] next = new double[3][3];
				for (int j = 0; j < 3; ++j) {
					for (int k = 0; k < 3; ++k) {
						for (int l = 0; l < 4; ++l) {
							int nr = j + DR[l];
							int nc = k + DC[l];
							if (nr < 0 || 3 <= nr || nc < 0 || 3 <= nc || room[nr][nc] == b) continue;
							next[nr][nc] += prob[j][k] / 4;
						}
					}
				}
				prob = next;
			}
			System.out.printf("%.9f\n", prob[t / 3][t % 3]);
		}
	}
}