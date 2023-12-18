import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	private static final int[][] d = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int W = sc.nextInt();
			if (W == 0) {
				sc.close();
				break;
			}
			int H = sc.nextInt();

			char[][] mapL = new char[H + 2][];
			char[][] mapR = new char[H + 2][];

			char[] wall = new char[W + 2];
			Arrays.fill(wall, '#');
			mapL[0] = wall;
			mapR[0] = wall;
			mapL[H + 1] = wall;
			mapR[H + 1] = wall;

			for (int i = 0; i < H; i++) {
				String lineL = "#" + sc.next() + "#";
				mapL[i + 1] = lineL.toCharArray();
				String lineR = "#" + sc.next() + "#";
				mapR[i + 1] = lineR.toCharArray();
			}

			Integer[] posi = new Integer[4];
			for (int i = 0; i < mapL.length; i++) {
				for (int j = 0; j < mapL[i].length; j++) {
					if (mapL[i][j] == 'L') {
						posi[0] = i;
						posi[1] = j;
					}
					if (mapR[i][j] == 'R') {
						posi[2] = i;
						posi[3] = j;
					}
				}
			}

			boolean[][] used = new boolean[5051][5051];
			Deque<Integer[]> bfs = new ArrayDeque<Integer[]>();
			bfs.addLast(posi);
			used[posi[0] * 100 + posi[1]][posi[2] * 100 + posi[3]] = true;
			boolean cleared = false;
			bfs: while (!bfs.isEmpty()) {
				Integer[] poll = bfs.pollFirst();
				int iL = poll[0];
				int jL = poll[1];
				int iR = poll[2];
				int jR = poll[3];

				for (int i = 0; i < d.length; i++) {
					char nextL = mapL[iL + d[i][0]][jL + d[i][1]];
					char nextR = mapR[iR + d[i][0]][jR - d[i][1]];

					if (nextL == '#' && nextR == '#') {
						continue;
					} else if (nextL == '%' && nextR == '%') {
						// YES
						cleared = true;
						break bfs;
					} else if ((nextL == '%' && nextR != '%') || (nextL != '%' && nextR == '%')) {
						continue;
					} else {
						if (nextL == '#' && nextR == '.' && !used[iL * 100 + jL][(iR + d[i][0]) * 100 + jR - d[i][1]]) {
							used[iL * 100 + jL][(iR + d[i][0]) * 100 + jR - d[i][1]] = true;
							Integer[] push = { iL, jL, iR + d[i][0], jR - d[i][1] };
							bfs.addLast(push);
						} else if (nextR == '#' && nextL == '.'
								&& !used[(iL + d[i][0]) * 100 + jL + d[i][1]][iR * 100 + jR]) {
							used[(iL + d[i][0]) * 100 + jL + d[i][1]][iR * 100 + jR] = true;
							Integer[] push = { iL + d[i][0], jL + d[i][1], iR, jR };
							bfs.addLast(push);
						} else if (nextL == '.' && nextR == '.'
								&& !used[(iL + d[i][0]) * 100 + jL + d[i][1]][(iR + d[i][0]) * 100 + jR - d[i][1]]) {
							used[(iL + d[i][0]) * 100 + jL + d[i][1]][(iR + d[i][0]) * 100 + jR - d[i][1]] = true;
							Integer[] push = { iL + d[i][0], jL + d[i][1], iR + d[i][0], jR - d[i][1] };
							bfs.addLast(push);
						}
					}
				}
			}
			if (cleared) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			System.gc();

		}

	}
}