import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] grid = new int[8][8];// oなら1、xなら-1を入れておく
		int[] dir = { -1, 0, 1 };

		for (int i = 0; i < grid.length; i++) {
			String line = scanner.next();
			for (int j = 0; j < grid[i].length; j++) {
				char piece = line.charAt(j);
				if (piece == 'o') {
					grid[i][j] = 1;
				} else if (piece == 'x') {
					grid[i][j] = -1;
				}
			}
		}

		int turn = 0;
		int pass = 0;
		while (pass < 2) {
			int max = 0;
			int x = -1;
			int y = -1;
			int me = 1;
			if (turn % 2 == 1) {
				me = -1;
			}
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					int gain = 0;
					int pi = i;
					int pj = j;
					if (turn % 2 == 1) {
						pi = 7 - i;
						pj = 7 - j;
					}
					if (grid[pi][pj] != 0) {
						continue;
					}

					for (int d1 = 0; d1 < dir.length; d1++) {
						for (int d2 = 0; d2 < dir.length; d2++) {
							if (dir[d1] == 0 && dir[d2] == 0) {
								continue;
							}
							int distance = 1;
							while (pi + dir[d1] * distance >= 0
									&& pi + dir[d1] * distance < 8
									&& pj + dir[d2] * distance >= 0
									&& pj + dir[d2] * distance < 8) {
								if (grid[pi + dir[d1] * distance][pj + dir[d2]
										* distance] == -1 * me) {
									distance++;
								} else if (grid[pi + dir[d1] * distance][pj
										+ dir[d2] * distance] == me) {
									gain += distance - 1;
									break;
								} else {
									break;
								}
							}
						}
					}

					if (max < gain) {
						max = gain;
						x = pi;
						y = pj;
					}

				}

			}
			if (x != -1) {
				pass = 0;
				grid[x][y] = me;
				for (int d1 = 0; d1 < dir.length; d1++) {
					for (int d2 = 0; d2 < dir.length; d2++) {
						if (dir[d1] == 0 && dir[d2] == 0) {
							continue;
						}
						int distance = 1;
						while (x + dir[d1] * distance >= 0
								&& x + dir[d1] * distance < 8
								&& y + dir[d2] * distance >= 0
								&& y + dir[d2] * distance < 8) {
							if (grid[x + dir[d1] * distance][y + dir[d2]
									* distance] == -1 * me) {
								distance++;
							} else if (grid[x + dir[d1] * distance][y + dir[d2]
									* distance] == me) {
								for (int dist = 1; dist < distance; dist++) {
									grid[x + dir[d1] * dist][y + dir[d2] * dist] = me;
								}
								break;
							} else {
								break;
							}
						}
					}
				}
			} else {
				pass++;
			}
			turn++;
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					System.out.print("o");
				} else if (grid[i][j] == -1) {
					System.out.print("x");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}
}