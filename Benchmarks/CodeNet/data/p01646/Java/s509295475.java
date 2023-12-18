import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String[] str;
	static int N;
	static boolean[][] g;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			str = new String[N];
			for (int i = 0; i < N; ++i) {
				str[i] = sc.next();
			}
			System.out.println(solve() ? "yes" : "no");
		}
	}

	static boolean solve() {
		g = new boolean[26][26];
		if (!construct(0, N, 0)) {
			return false;
		}
		for (int i = 0; i < 26; ++i) {
			boolean[] visited = new boolean[26];
			if (!dfs(i, visited)) {
				return false;
			}
		}
		return true;
	}

	static boolean dfs(int pos, boolean[] visited) {
		if (visited[pos]) return false;
		visited[pos] = true;
		for (int i = 0; i < 26; ++i) {
			if (g[pos][i]) {
				if (!dfs(i, visited)) {
					return false;
				}
			}
		}
		visited[pos] = false;
		return true;
	}

	static boolean construct(int s, int e, int pos) {
		// System.out.println(s + " " + e + " " + pos);
		if (e - s == 1) return true;
		while (s < e && str[s].length() == pos) {
			++s;
		}
		if (s >= e - 1) return true;
		int prev = s;
		for (int i = s + 1;; ++i) {
			if (i == e) {
				if (!construct(prev, i, pos + 1)) {
					return false;
				}
				break;
			}
			if (str[i].length() == pos) {
				return false;
			}
			if (str[i].charAt(pos) != str[prev].charAt(pos)) {
				g[str[prev].charAt(pos) - 'a'][str[i].charAt(pos) - 'a'] = true;
				// System.out.println(s + " " + e + " " + pos + " " + str[prev].charAt(pos) + " " + str[i].charAt(pos));
				if (!construct(prev, i, pos + 1)) {
					return false;
				}
				prev = i;
			}
		}
		return true;
	}

}