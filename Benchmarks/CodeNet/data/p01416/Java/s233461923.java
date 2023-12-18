import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final int MAX = 500;

	public static boolean is_ok(int x, int y, int w, int h) {
		if (x < 0 || x >= w || y < 0 || y >= h) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] places = new boolean[26];
		int[][] x_pos = new int[26][2];
		int[][] y_pos = new int[26][2];

		final int M = sc.nextInt();
		final int N = sc.nextInt();

		boolean[][] is_placed = new boolean[M][N];
		
		Arrays.fill(places, false);

		for (int i = 0; i < M; i++) {
			char[] input = sc.next().toCharArray();

			for (int j = 0; j < N; j++) {
				if ('A' <= input[j] && input[j] <= 'Z') {
					is_placed[i][j] = true;

					int count = places[input[j] - 'A'] ? 1 : 0;
					places[input[j] - 'A'] = true;
					x_pos[input[j] - 'A'][count] = j;
					y_pos[input[j] - 'A'][count] = i;
				} else {
					is_placed[i][j] = false;
				}
			}
		}

		int score = 0;
		while (true) {
			boolean updated = false;

			for (int mozi = 0; mozi < 26; mozi++) {
				if (!places[mozi]) {
					continue;
				}

				int fst_min_x = x_pos[mozi][0];
				int fst_max_x = x_pos[mozi][0];
				int fst_min_y = y_pos[mozi][0];
				int fst_max_y = y_pos[mozi][0];
				int snd_min_x = x_pos[mozi][1];
				int snd_max_x = x_pos[mozi][1];
				int snd_min_y = y_pos[mozi][1];
				int snd_max_y = y_pos[mozi][1];

				for (int x = x_pos[mozi][0] - 1;; x--) {
					if (!is_ok(x, y_pos[mozi][0], N, M)) {
						break;
					} else if (is_placed[y_pos[mozi][0]][x]) {
						break;
					}

					fst_min_x = x;
				}
				for (int x = x_pos[mozi][0] + 1;; x++) {
					if (!is_ok(x, y_pos[mozi][0], N, M)) {
						break;
					} else if (is_placed[y_pos[mozi][0]][x]) {
						break;
					}

					fst_max_x = x;
				}
				for (int y = y_pos[mozi][0] - 1;; y--) {
					if (!is_ok(x_pos[mozi][0], y, N, M)) {
						break;
					} else if (is_placed[y][x_pos[mozi][0]]) {
						break;
					}

					fst_min_y = y;
				}
				for (int y = y_pos[mozi][0] + 1;; y++) {
					if (!is_ok(x_pos[mozi][0], y, N, M)) {
						break;
					} else if (is_placed[y][x_pos[mozi][0]]) {
						break;
					}

					fst_max_y = y;
				}

				for (int x = x_pos[mozi][1] - 1;; x--) {
					if (!is_ok(x, y_pos[mozi][1], N, M)) {
						break;
					} else if (is_placed[y_pos[mozi][1]][x]) {
						break;
					}

					snd_min_x = x;
				}
				for (int x = x_pos[mozi][1] + 1;; x++) {
					if (!is_ok(x, y_pos[mozi][1], N, M)) {
						break;
					} else if (is_placed[y_pos[mozi][1]][x]) {
						break;
					}

					snd_max_x = x;
				}
				for (int y = y_pos[mozi][1] - 1;; y--) {
					if (!is_ok(x_pos[mozi][1], y, N, M)) {
						break;
					} else if (is_placed[y][x_pos[mozi][1]]) {
						break;
					}

					snd_min_y = y;
				}
				for (int y = y_pos[mozi][1] + 1;; y++) {
					if (!is_ok(x_pos[mozi][1], y, N, M)) {
						break;
					} else if (is_placed[y][x_pos[mozi][1]]) {
						break;
					}

					snd_max_y = y;
				}
				
				//System.out.println((char)(mozi + 'A') + "  " + x_pos[mozi][0] + " " + y_pos[mozi][0] + " " + x_pos[mozi][1] + " " + y_pos[mozi][1]);
				//System.out.println((char)(mozi + 'A') + "1 " + fst_min_x + " " + fst_max_x + " "+ fst_min_y + " " + fst_max_y);
				//System.out.println((char)(mozi + 'A') + "2 " + snd_min_x + " " + snd_max_x + " "+ snd_min_y + " " + snd_max_y);
				
				boolean flag = false;
				flag |= (fst_max_y >= y_pos[mozi][1]
						&& x_pos[mozi][0] <= x_pos[mozi][1] && x_pos[mozi][0] >= snd_min_x);
				flag |= (fst_max_y >= y_pos[mozi][1]
						&& x_pos[mozi][0] >= x_pos[mozi][1] && x_pos[mozi][0] <= snd_max_x);

				flag |= (snd_min_y <= y_pos[mozi][0]
						&& x_pos[mozi][0] <= x_pos[mozi][1] && x_pos[mozi][1] <= fst_max_x);
				flag |= (snd_min_y <= y_pos[mozi][0]
						&& x_pos[mozi][0] >= x_pos[mozi][1] && x_pos[mozi][1] >= fst_min_x);
				flag |= (x_pos[mozi][0] == x_pos[mozi][1] && fst_max_y >= snd_min_y);
				flag |= (y_pos[mozi][0] == y_pos[mozi][1] && x_pos[mozi][0] <= x_pos[mozi][1] && fst_max_x >= snd_min_x);
				flag |= (y_pos[mozi][0] == y_pos[mozi][1] && x_pos[mozi][0] >= x_pos[mozi][1] && fst_min_x <= snd_max_x);

				if (flag) {
					score += 2;
					is_placed[y_pos[mozi][0]][x_pos[mozi][0]] = false;
					is_placed[y_pos[mozi][1]][x_pos[mozi][1]] = false;

					places[mozi] = false;

					updated = true;
					//System.out.println("erase " + (char)(mozi + 'A'));
				}
			}

			if (!updated) {
				break;
			}
		}

		System.out.println(score);

	}

}