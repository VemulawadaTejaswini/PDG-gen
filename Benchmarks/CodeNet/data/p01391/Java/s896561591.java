import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, K;

	public static void main(String[] args) throws Exception {
		N = sc.nextInt();
		K = sc.nextInt();
		sc.nextLine();
		int[][] c = new int[K][N / 2];
		boolean[][] f = new boolean[K][N];
		int[] count = new int[N];
		for (int i = 0; i < K; ++i) {
			String[] line = sc.nextLine().split(" ");
			for (int j = 0; j < N / 2; ++j) {
				c[i][j] = Integer.parseInt(line[j]) - 1;
				count[c[i][j]]++;
				f[i][c[i][j]] = true;
			}
		}
		int[] ans = new int[N];
		int[] used = new int[K];
		for (int i = 0; i < 3 * N / 8; ++i) {
			int idx = 0;
			int max = 0;
			for (int j = 0; j < N; ++j) {
				if (ans[j] != 0) {
					continue;
				}
				if (max < count[j]) {
					idx = j;
					max = count[j];
				}
			}
//			System.out.println(idx + " " + max);
			ans[idx] = 1;
			for (int j = 0; j < K; ++j) {
				if (f[j][idx]) {
					used[j]++;
					if (used[j] == N / 8) {
						for (int k = 0; k < N / 2; ++k) {
							count[c[j][k]]--;
						}
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; ++i) {
			sb.append(ans[i]);
		}
		System.out.println(sb.toString());
	}

}