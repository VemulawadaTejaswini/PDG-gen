import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		UnionFind uft = new UnionFind(n);

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			uft.unite(a - 1, b - 1);
		}

		long max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, uft.size(i));
		}

		System.out.println(max);
	}
}

class UnionFind {

	// 自身が親であれば、その集合に属する頂点数に-1を掛けたもの
	// そうでなければ親のid
	int r[];

	public UnionFind(int n) {
		r = new int[n];
		Arrays.fill(r, -1);
	}

	int root(int x) {
		if (r[x] < 0)
			return x;
		return r[x] = root(r[x]);
	}

	boolean unite(int x, int y) {
		x = root(x);
		y = root(y);
		if (x == y)
			return false;
		if (r[x] > r[y]) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		r[x] += r[y];
		r[y] = x;
		return true;
	}

	int size(int x) {
		return -r[root(x)];
	}
}
