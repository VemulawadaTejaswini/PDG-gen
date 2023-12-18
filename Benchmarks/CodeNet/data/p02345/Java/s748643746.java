import java.util.*;
import java.lang.*;

class Main {
	static int[] segTree;
	static int n;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int _n = scanner.nextInt();
		int q = scanner.nextInt();

		initSegTree(_n);

		for(int i = 0; i < q; i++) {
			int type = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if(type == 0) {
				// update(i,x): Change a[i] to x
				update(x, y);	
			} else if(type == 1) {
				// find(s,t): Find minimum in range [s,t]
				int result = find(x, y);
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
	}	

	static void update(int i, int x) {
		// Convert to index of segTree
		int k = i + n - 1;
		segTree[k] = x;
		while(k > 0) {
			// Update ancestors of k
			k = (k-1)/2;
			segTree[k] = Math.min(segTree[k*2+1], segTree[k*2+2]);
		}
	}

	static int find(int s, int t) {
		return query(s, t+1, 0, 0, n);
	}

	/* Find minimum element in the range [s,t)
	/* s : start of desired range
	/* t : end of desired range
	/* k : index of segTree
	/* l : left
	/* r : right 
	*/
	static int query(int s, int t, int k, int l, int r) {
		if (r <= s || t <= l) // [s,t] and [l,r] not intersect
			return Integer.MAX_VALUE;

		if (s <= l && r <= t) // [l,r] totally inside [s,t]
			return segTree[k];

		// [s,t] and [l,r] intersect
		int vleft = query(s, t, k*2+1, l, (l+r)/2);
		int vright = query(s, t, k*2+2, (l+r)/2, r);
		return Math.min(vleft, vright);
	}
}

