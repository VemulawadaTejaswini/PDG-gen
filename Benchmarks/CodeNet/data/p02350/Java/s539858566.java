import java.util.*;
import java.lang.*;

class Main {
	static int[] segTree;
	static int[] lazy;
	static int n; // nearest power of 2 to true length of array
	// i.e. true length = 13 -> n = 16 = 2*2*2*2

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int q = scanner.nextInt();

		initSegTree(len);

		int type;
		for (int i = 0; i < q; i++) {
			type = scanner.nextInt();
			if(type == 0) {
				// update(s,t,x): Change a[s]...a[t] to x
				update(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
				// printArr();
			} else if(type == 1) {
				// find(s,t): Find minimum in range [s,t]
				int result = find(scanner.nextInt(), scanner.nextInt());
				System.out.println(result);
			}
		}
	}

	static void initSegTree(int _n) {
		n = 1;
		while(n < _n)
			n *= 2;

		segTree = new int[2*n-1];
		Arrays.fill(segTree, Integer.MAX_VALUE);

		lazy = new int[2*n-1];
		Arrays.fill(lazy, -1);
	}

	static void lazy_evaluate(int k) {
		if(lazy[k] == -1)
			return;

		segTree[k] = lazy[k];
		if(k < n-1) { // not leaf
			lazy[2*k+1] = lazy[k];
			lazy[2*k+2] = lazy[k];
		}
		lazy[k] = -1;
	}

	static void update(int s, int t, int x) {
		update(0, 0, n-1, s, t, x);
	}

	static void update(int k, int l, int r, int s, int t, int x) {

		lazy_evaluate(k);

		// Out of range
		if(s > t || s > r || t < l)
			return;

		// Node k is a leaf
		if(s <= l && r <= t) {
			lazy[k] = x;
			lazy_evaluate(k);
			return;
		}

		// If not a leaf node, recur for children
		int mid = (l+r)/2;
		update(k*2+1, l, mid, s, t, x);
		update(k*2+2, mid+1, r, s, t, x);

		// Use the results of children calls to update this node
		segTree[k] = Math.min(segTree[k*2+1], segTree[k*2+2]);
	}

	static int find(int s, int t) {
		return query(0, 0, n, s, t+1);
	}

	static int query(int k, int l, int r, int s, int t) {
		lazy_evaluate(k);

		// Out of range
		if(r <= s || t <= l)
			return Integer.MAX_VALUE;

		// [l,r] inside [s,t]
		if(s <= l && r <= t) 
			return segTree[k];

		// Intersect
		int mid = (l+r)/2;
		int minLeft = query(k*2+1, l, mid, s, t);
		int minRight = query(k*2+2, mid, r, s, t);

		return Math.min(minLeft, minRight);
	}
}
