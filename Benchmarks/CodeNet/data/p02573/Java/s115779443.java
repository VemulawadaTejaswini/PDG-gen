import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		UnionFindTree uft = new UnionFindTree(200100);

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			uft.union(a, b);
		}

		long s[] = new long[200100];
		for (int i = 0; i < n; i++) {
			s[uft.parent[i + 1]]++;
		}

		long max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, s[i + 1]);
		}

		System.out.println(max);
	}
}

class UnionFindTree {

	int[] parent; // ルートノードのインデックス
	int[] rank; // 木の高さ

	public UnionFindTree(int size) {
		this.parent = new int[size];
		this.rank = new int[size];

		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}

	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0; // 集合の高さ
	}

	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);

		// xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; // yの親をxに更新

		} else if (rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;

		} else if (xRoot != yRoot) {
			parent[yRoot] = xRoot;
			rank[xRoot]++; // 同じ高さの木がルートの子として着くから
		}
	}

	// 引数の属する木のルートのidを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	// 同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
