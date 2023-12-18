import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][][][] mask = new int[5][5][5][5];

	static int solve(int start) {
		HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
		visited.put(start, 0);
		ArrayList<Integer> cur = new ArrayList<Integer>();
		cur.add(start);
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				ArrayList<Integer> next = new ArrayList<Integer>();
				for (int st : cur) {
					if (!bit(st, i, j)) {
						next.add(st);
						continue;
					}
					for (int k = i; k < N; ++k) {
						for (int l = j; l < N; ++l) {
							int nv = st ^ mask[i][j][k][l];
							int count = visited.get(st) + 1;
							if (visited.containsKey(nv)) {
								if (count < visited.get(nv)) {
									visited.put(nv, count);
									next.add(nv);
								}
							} else {
								visited.put(nv, count);
								next.add(nv);
							}
						}
					}
				}
				cur = next;
			}
		}
		return visited.get(0);
	}

	static boolean bit(int state, int r, int c) {
		return (state & (1 << (r * 5 + c))) != 0;
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				for (int k = i; k < 5; ++k) {
					for (int l = j; l < 5; ++l) {
						for (int r = i; r <= k; ++r) {
							for (int c = j; c <= l; ++c) {
								mask[i][j][k][l] |= (1 << (r * 5 + c));
							}
						}
					}
				}
			}
		}
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int start = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					int v = sc.nextInt();
					if (v == 1) start += (1 << (i * 5 + j));
				}
			}
			int ans = solve(start);
			for (int j = 0; j < ans; ++j) {
				System.out.print("myon");
			}
			System.out.println();
		}
	}
}