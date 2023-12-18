import java.util.*;
import java.io.*;

public class Main {

	static int r, c, k;
	static int[][] a;
	static long memo[][][];

	static long dp(int con, int x, int y) {
		if (x == r || y == c)
			return (long) 0;
		if (x > r || y > c)
			return (long) -1e18;
		if (memo[con][x][y] != -1)
			return memo[con][x][y];
		long ans = (long) -1e18;
		if (con == 3) {
			if (a[x][y] > 0)
				ans = Math.max(dp(0, x + 1, y), dp(0, x, y + 1));
			else
				ans = Math.max(dp(0, x + 1, y), dp(con, x, y + 1));
		} else {
			if (a[x][y] > 0) {
				ans = a[x][y] + Math.max(dp(0, x + 1, y), dp(con + 1, x, y + 1));
				ans = Math.max(ans, Math.max(dp(0, x + 1, y), dp(0, x, y + 1)));
			} else
				ans = Math.max(dp(0, x + 1, y), dp(con, x, y + 1));
		}
		return memo[con][x][y] = ans;
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		a = new int[r + 1][c + 1];
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			a[x - 1][y - 1] = v;
		}
		memo = new long[4][r + 1][c + 1];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= r; j++) {
				Arrays.fill(memo[i][j], -1);
			}
		}
		pw.println(dp(0, 0, 0));
		pw.flush();
	}

	static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		pair[] array, sTree, lazy;

		SegmentTree(pair[] in) {
			array = in;
			N = in.length - 1;
			sTree = new pair[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new pair[N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e)
				sTree[node] = array[b];
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				int x = sTree[node << 1 | 1].x;
				int y = sTree[node << 1].y;
				if (x == -1)
					sTree[node] = sTree[node << 1];
				else if (y == -1)
					sTree[node] = sTree[node << 1 | 1];
				else {
					if (sTree[node << 1].x >= sTree[node << 1 | 1].y)
						x += sTree[node << 1].x - sTree[node << 1 | 1].y;
					else
						y += sTree[node << 1 | 1].y - sTree[node << 1].x;
					sTree[node] = new pair(x, y);
				}
			}
		}

//		void update_point(int index, long val) // O(log n)
//		{
//			index += N - 1;
//			sTree[index] = val;
//			while (index > 1) {
//				index >>= 1;
//				sTree[index] = Math.max(sTree[index << 1], sTree[index << 1 | 1]);
//			}
//		}
//
//		void update_range(int i, int j, int val) // O(log n)
//		{
//			update_range(1, 1, N, i, j, val);
//		}
//
//		void update_range(int node, int b, int e, int i, int j, int val) {
//			if (i > e || j < b)
//				return;
//			if (b >= i && e <= j) {
//				sTree[node] = (e - b + 1) * val;
//				lazy[node] = val;
//			} else {
//				int mid = b + e >> 1;
//				propagate(node, b, mid, e);
//				update_range(node << 1, b, mid, i, j, val);
//				update_range(node << 1 | 1, mid + 1, e, i, j, val);
//				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
//			}
//
//		}
//
//		void propagate(int node, int b, int mid, int e) {
//			lazy[node << 1] += lazy[node];
//			lazy[node << 1 | 1] += lazy[node];
//			sTree[node << 1] += (mid - b + 1) * lazy[node];
//			sTree[node << 1 | 1] += (e - mid) * lazy[node];
//			lazy[node] = 0;
//
//		}

		int query(int i, int j) {
			pair t = query(1, 1, N, i, j);
			return j - i + 1 - t.x - t.y;
		}

		pair query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return new pair(-1, -1);
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
//			propagate(node, b, mid, e);
			pair q1 = query(node << 1, b, mid, i, j);
			pair q2 = query(node << 1 | 1, mid + 1, e, i, j);
			if (q1.x == -1)
				return q2;
			else if (q2.x == -1)
				return q1;
			int x = q2.x;
			int y = q1.y;
			if (q1.x >= q2.y)
				x += q1.x - q2.y;
			else
				y += q2.y - q1.x;
			return new pair(x, y);

		}

	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int a, int b) {
			x = a;
			y = b;
		}

		@Override
		public int compareTo(pair o) {
			return x - o.x;
		}

	}
}