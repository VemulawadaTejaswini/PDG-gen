import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static final int MAX = 5000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ArrayList<HashSet<Integer>> dot_list = new
		 * ArrayList<HashSet<Integer>>(MAX + 1); for(int i = 0; i <= MAX; i++){
		 * dot_list.add(new HashSet<Integer>()); }
		 */

		boolean[][] is_point = new boolean[MAX + 1][MAX + 1];
		int[] x_pos = new int[3001];
		int[] y_pos = new int[3001];

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			for (int i = 0; i <= MAX; i++) {
				Arrays.fill(is_point[i], false);
			}
			// System.gc();

			for (int i = 0; i < n; i++) {
				final int x = sc.nextInt();
				final int y = sc.nextInt();

				is_point[y][x] = true;
				x_pos[i] = x;
				y_pos[i] = y;
			}

			int max_size = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					final int x1 = x_pos[i];
					final int y1 = y_pos[i];
					final int x2 = x_pos[j];
					final int y2 = y_pos[j];

					int diff_x = x2 - x1;
					int diff_y = y2 - y1;

					int pt_1_x = x1 + diff_y;
					int pt_1_y = y1 - diff_x;

					if (pt_1_x < 0 || pt_1_x > MAX || pt_1_y < 0
							|| pt_1_y > MAX) {
						continue;
					} else if (!is_point[pt_1_y][pt_1_x]) {
						continue;
					}

					int pt_2_x = pt_1_x + diff_x;
					int pt_2_y = pt_1_y + diff_y;

					if (pt_2_x < 0 || pt_2_x > MAX || pt_2_y < 0
							|| pt_2_y > MAX) {
						continue;
					} else if (!is_point[pt_2_y][pt_2_x]) {
						continue;
					}

					max_size = Math.max(max_size, diff_x * diff_x + diff_y
							* diff_y);

				}
			}

			System.out.println(max_size);
		}
	}
}