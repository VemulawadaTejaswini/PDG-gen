import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int W, H, start, goal, n;
	static int[] cost;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		n = H * W;
		cost = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = 1;
		}
		ArrayList<Integer> M = new ArrayList<Integer>();
		for (int i = 0; i < H; i++) {
			char[] chs = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				char ch = chs[j];
				switch (ch) {
				case 'S':
					start = i * W + j;
					break;
				case 'G':
					goal = i * W + j;
					break;
				case 'M':
					M.add(i * W + j);
					break;
				case '#':
					for (int ii = i - 2; ii <= i + 2; ii++) {
						for (int jj = j - 2; jj <= j + 2; jj++) {
							if (0 <= ii && ii < H && 0 <= jj && jj < W) {
								cost[ii * W + jj] = Math.max(cost[ii * W + jj], 2);
							}
						}
					}
					for (int ii = i - 1; ii <= i + 1; ii++) {
						for (int jj = j - 1; jj <= j + 1; jj++) {
							if (0 <= ii && ii < H && 0 <= jj && jj < W) {
								cost[ii * W + jj] = Math.max(cost[ii * W + jj], 3);
							}
						}
					}
					cost[i * W + j] = 1000000000;
					break;
				}
			}
		}
		sc.close();

		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = -1;
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (j != 0) {
					map[i * W + j][i * W + j - 1] = cost[i * W + j];
				}
				if (j != W - 1) {
					map[i * W + j][i * W + j + 1] = cost[i * W + j];
				}
				if (i != 0) {
					map[i * W + j][(i - 1) * W + j] = cost[i * W + j];
				}
				if (i != H - 1) {
					map[i * W + j][(i + 1) * W + j] = cost[i * W + j];
				}
			}
		}

		int Msize = M.size();
		int[][] root = new int[Msize + 2][Msize + 2];
		int[] distance = new int[n];
		dijkstra(map, start, distance);
		for (int i = 0; i < Msize; i++) {
			root[0][i + 1] = distance[M.get(i)];
		}
		for (int i = 0; i < Msize; i++) {
			dijkstra(map, M.get(i), distance);
			for (int j = 0; j < Msize; j++) {
				root[i + 1][j + 1] = distance[M.get(j)];
			}
			root[i + 1][Msize + 1] = distance[goal];
		}

		int[] perm = new int[Msize];
		for (int i = 0; i < perm.length; i++) {
			perm[i] = i + 1;
		}
		int ans = Integer.MAX_VALUE;
		do {
			int time = 0;
			time += root[0][perm[0]];
			for (int i = 1; i < Msize; i++) {
				time += root[perm[i - 1]][perm[i]];
			}
			time += root[perm[Msize - 1]][Msize + 1];
			ans = Math.min(ans, time);
		} while (nextPermutation(perm));

		System.out.println(ans);

	}

	static void dijkstra(int[][] map, int start, int[] distance) {
		boolean[] fixed = new boolean[n];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;
		while (true) {
			int marked = minIndex(distance, fixed);
			if (marked < 0) {
				return;
			}
			if (distance[marked] == Integer.MAX_VALUE) {
				return;
			}
			fixed[marked] = true;
			for (int i = 0; i < n; i++) {
				if (map[marked][i] > 0 && !fixed[i]) {
					int newDistance = distance[marked] + map[marked][i];
					if (newDistance < distance[i]) {
						distance[i] = newDistance;
					}
				}
			}
		}
	}

	static int minIndex(int[] distance, boolean[] fixed) {
		for (int i = 0; i < n; i++) {
			if (!fixed[i]) {
				for (int j = i + 1; j < n; j++) {
					if (!fixed[j] && distance[j] < distance[i]) {
						i = j;
					}
				}
				return i;
			}
		}
		return -1;
	}

	static boolean nextPermutation(int[] perm) {
		for (int i = perm.length - 1; i > 0; --i) {
			if (perm[i - 1] < perm[i]) {
				int swapIndex = find(perm[i - 1], perm, i, perm.length - 1);
				int temp = perm[swapIndex];
				perm[swapIndex] = perm[i - 1];
				perm[i - 1] = temp;
				Arrays.sort(perm, i, perm.length);
				return true;
			}
		}
		return false;
	}

	static int find(int dest, int[] perm, int s, int e) {
		if (s == e) {
			return s;
		}
		int m = (s + e + 1) / 2;
		return perm[m] <= dest ? find(dest, perm, s, m - 1) : find(dest, perm, m, e);
	}

}