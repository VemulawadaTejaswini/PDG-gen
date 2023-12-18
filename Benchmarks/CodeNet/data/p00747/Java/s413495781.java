

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {

			int w = s.nextInt(), h = s.nextInt();
			if (w == 0 && h == 0) {
				return;
			}

			String[][] map = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = "";
				}
			}

			for (int i = 0; i < w; i++) {
				map[0][i] = "U";
				map[h - 1][i] = "D";
			}
			for (int i = 0; i < h; i++) {
				map[i][0] += "L";
				map[i][w - 1] += "R";
			}

			for (int i = 0; i < 2 * h - 1; i++) {

				if (i % 2 == 0) {
					for (int j = 0; j < w - 1; j++) {

						int in = s.nextInt();
						if (in == 1) {
							map[i / 2][j] += "R";
							map[i / 2][j + 1] += "L";
						}

					}
				} else {
					for (int j = 0; j < w; j++) {

						int in1 = s.nextInt();
						if (in1 == 1) {
							map[i / 2][j] += "D";
							map[i / 2 + 1][j] += "U";

						}
					}
				}

			}

			Deque<int[]> q = new ArrayDeque<>();
			q.add(new int[] { 0, 0, 1 });
			boolean[][] cst = new boolean[h][w];

			while (!q.isEmpty()) {

				int[] u = q.poll();

				if (u[0] == h - 1 && u[1] == w - 1) {
					System.out.println(u[2]);
					return;
				}
				cst[u[0]][u[1]] = true;

				if (!map[u[0]][u[1]].contains("U")) {
					if (!cst[u[0] - 1][u[1]]) {
						q.add(new int[] { u[0] - 1, u[1], u[2] + 1 });

						cst[u[0] - 1][u[1]] = true;
					}
				}
				if (!map[u[0]][u[1]].contains("R")) {
					if (!cst[u[0]][u[1] + 1]) {
						q.add(new int[] { u[0], u[1] + 1, u[2] + 1 });

						cst[u[0]][u[1] + 1] = true;
					}
				}

				if (!map[u[0]][u[1]].contains("D")) {
					if (!cst[u[0] + 1][u[1]]) {
						q.add(new int[] { u[0] + 1, u[1], u[2] + 1 });

						cst[u[0] + 1][u[1]] = true;
					}
				}

				if (!map[u[0]][u[1]].contains("L")) {
					if (!cst[u[0]][u[1] - 1]) {
						q.add(new int[] { u[0], u[1] - 1, u[2] + 1 });

						cst[u[0]][u[1] - 1] = true;
					}
				}

			}

			System.out.println(0);
		}
	}
}