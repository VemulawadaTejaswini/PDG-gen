import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;

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
							int nv = st;
							for (int r = i; r <= k; ++r) {
								for (int c = j; c <= l; ++c) {
									nv ^= (1 << (r * N + c));
								}
							}
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
		return (state & (1 << (r * N + c))) != 0;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int start = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					int v = sc.nextInt();
					if (v == 1) start += (1 << (i * N + j));
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