import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[][] plate = new char[10][];
	static int[][] plateI = new int[10][2];
	static int ans;
	static HashSet<Integer> used = new HashSet<Integer>();

	public static void main(String[] args) {
		while (true) {
			plate[0] = sc.next().toCharArray();
			if (plate[0].length == 3) break;
			for (int i = 1; i < 10; ++i) {
				plate[i] = sc.next().toCharArray();
			}
			for (int i = 0; i < 10; ++i) {
				plateI[i][0] = plateI[i][1] = 0;
				for (int j = 0; j < 5; ++j) {
					if (plate[i][j] == '1') {
						plateI[i][0] += 1 << j;
						plateI[i][1] += 1 << (4 - j);
					}
				}
			}
			System.out.println(solve());
		}
	}

	static int solve() {
		ans = 0;
		used.clear();
		boolean[] selected = new boolean[10];
		dfs(0, 0, selected);
		return ans;
	}

	static void dfs(int state, int depth, boolean[] selected) {
		if (depth == 5) {
			finish(state, selected);
			return;
		}
		for (int i = 0; i < 10; ++i) {
			if (selected[i]) continue;
			selected[i] = true;
			dfs(state + ((0x1F - plateI[i][0]) << (depth * 5)), depth + 1, selected);
			if (plateI[i][0] != plateI[i][1]) {
				dfs(state + ((0x1F - plateI[i][1]) << (depth * 5)), depth + 1, selected);
			}
			selected[i] = false;
		}
	}

	static void finish(int state, boolean[] selected) {
		if (used.contains(state)) return;
		int[] rev = new int[5];
		for (int i = 0; i < 25; ++i) {
			if ((state & (1 << i)) != 0) {
				rev[i % 5] += 1 << (i / 5);
			}
		}
		//		System.out.println(Integer.toBinaryString(state));
		//		for (int i = 0; i < 5; ++i) {
		//			System.out.println(Integer.toBinaryString(rev[i]));
		//		}
		boolean[] rest = selected.clone();
		for (int i = 0; i < 5; ++i) {
			boolean found = false;
			for (int j = 0; j < 10; ++j) {
				if (!rest[j] && (rev[i] == plateI[j][0] || rev[i] == plateI[j][1])) {
					rest[j] = true;
					found = true;
					break;
				}
			}
			if (!found) return;
		}
		int all = (1 << 25) - 1;
		used.add(state);
		used.add(all - state);
		int mir = mirror(state);
		used.add(mir);
		used.add(all - mir);
		for (int i = 0; i < 3; ++i) {
			state = rotate(state);
			mir = rotate(mir);
			used.add(state);
			used.add(all - state);
			used.add(mir);
			used.add(all - mir);
		}
		++ans;
	}

	static int rotate(int v) {
		int ret = 0;
		for (int i = 0; i < 25; ++i) {
			if ((v & (1 << i)) != 0) {
				ret += 1 << ((i % 5) * 5 + (4 - i / 5));
			}
		}
		return ret;
	}

	static int mirror(int v) {
		int ret = 0;
		for (int i = 0; i < 25; ++i) {
			if ((v & (1 << i)) != 0) {
				ret += 1 << ((i / 5) * 5 + (4 - i % 5));
			}
		}
		return ret;
	}

	static void print(int v) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.print((v >> (i * 5 + j)) & 1);
			}
			System.out.println();
		}
	}

}