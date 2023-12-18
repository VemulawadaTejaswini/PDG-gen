import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int R, C, K;
	long[][] map;
	long[][][] memo;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		R = Integer.parseInt(tokens[0]);
		C = Integer.parseInt(tokens[1]);
		K = Integer.parseInt(tokens[2]);
		map = new long[R][C];
		memo = new long[R][C][4];
		for (int i = 0; i < R; ++i) {
			Arrays.fill(map[i], 0);
		}
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				Arrays.fill(memo[i][j], 0L);
			}
		}
		for (int i = 0; i < K; ++i) {
			tokens = in.readLine().split(" ");
			int r = Integer.parseInt(tokens[0]) - 1;
			int c = Integer.parseInt(tokens[1]) - 1;
			long v = Long.parseLong(tokens[2]);
			map[r][c] = v;
		}

	}

	void calc() {
		if (map[0][0] > 0L) {
			for (int i = 1; i < 4; ++i) {
				memo[0][0][i] = map[0][0];
			}
		}
		// 初期
		for (int r = 1; r < R; ++r) {
			if (map[r][0] > 0L) {
				long v = map[r][0];
				memo[r][0][0] = memo[r - 1][0][3];
				for (int i = 1; i < 4; ++i) {
					memo[r][0][i] = memo[r - 1][0][3] + v;
				}
			} else {
				for (int i = 0; i < 4; ++i) {
					memo[r][0][i] = memo[r - 1][0][i];
				}
			}
		}
		for (int c = 1; c < C; ++c) {
			if (map[0][c] > 0L) {
				long v = map[0][c];
				memo[0][c][0] = memo[0][c - 1][3];
				for (int i = 1; i < 4; ++i) {
					memo[0][c][i] = Math.max(memo[0][c - 1][i], memo[0][c - 1][i - 1] + v);
				}
			} else {
				for (int i = 0; i < 4; ++i) {
					memo[0][c][i] = memo[0][c - 1][i];
				}
			}
		}

		// 計算
		for (int r = 1; r < R; ++r) {
			for (int c = 1; c < C; ++c) {
				if (map[r][c] > 0L) {
					long v = map[r][c];
					// 拾わない場合
					memo[r][c][0] = Math.max(memo[r - 1][c][3], memo[r][c - 1][0]);
					for (int i = 1; i < 4; ++i) {
						// 横から来た場合
						memo[r][c][i] = Math.max(memo[r][c - 1][i], memo[r][c - 1][i - 1] + v);
						// 上から来た場合
						memo[r][c][i] = Math.max(memo[r][c][i], memo[r - 1][c][3] + v);
					}
				} else {
					// 単純に上下の比較をする
					for (int i = 0; i < 4; ++i) {
						memo[r][c][i] = Math.max(memo[r - 1][c][i], memo[r][c - 1][i]);
					}
				}
			}
		}
	}

	void show(int i) {
		for (int r = 0; r < R; ++r) {
			for (int c = 0; c < C; ++c) {
				System.out.print(memo[r][c][i] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	void showResult() {
//		for (int i = 0; i < 4; ++i) {
//			show(i);
//		}
		long max = Long.MIN_VALUE / 2;
		for (int i = 0; i < 4; ++i) {
			max = Math.max(memo[R - 1][C - 1][i], max);
		}
		System.out.println(max);
	}
}