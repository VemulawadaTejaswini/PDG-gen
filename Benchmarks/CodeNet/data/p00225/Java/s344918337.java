
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				return;
			strs = new String[n];
			for (int i = 0; i < n; i++) {
				strs[i] = scanner.next();
			}
			System.out.println(solve() ? "OK" : "NG");
		}
	}

	private boolean solve() {
		int[] in = new int[26], out = new int[26];
		UnionFind unionFind = new UnionFind(26);
		for (int i = 0; i < n; i++) {
			int from = (int) (strs[i].charAt(0) - 'a');
			int to = (int) (strs[i].charAt(strs[i].length() - 1) - 'a');
			in[from]++;
			out[to]++;
			unionFind.merge(to, from);
		}
		for (int i = 0; i < 26; i++) {
			if (in[i] != out[i]) {
				return false;
			}
		}
		for (int i = 1; i < 26; i++) {
			if (in[i] == 0)
				continue;
			if (!unionFind.isSame(in[0], in[i]))
				return false;

		}

		return true;
	}

	int n;
	String[] strs;

	class UnionFind {
		int[] pars;
		int[] rank;

		@Override
		public String toString() {
			return "UnionFind [pars=" + Arrays.toString(pars) + ", rank="
					+ Arrays.toString(rank) + "]";
		}

		UnionFind(int size) {
			pars = new int[size];
			rank = new int[size];
			for (int i = 0; i < size; i++)
				pars[i] = i;
		}

		int root(int x) {
			if (x == pars[x])
				return x;
			return pars[x] = root(pars[x]);
		}

		boolean isSame(int x, int y) {
			return root(x) == root(y);
		}

		void merge(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y)
				return;
			if (rank[x] > rank[y])
				pars[y] = x;
			else {
				pars[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}
	}
}