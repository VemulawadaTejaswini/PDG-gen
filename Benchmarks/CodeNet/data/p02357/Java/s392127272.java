import java.util.*;
import java.lang.*;

class Main {
	static int n; // length of target array
	static int[] D; // segment tree

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int L = scanner.nextInt();

		// Initialize segment tree
		initSegTree(N);

		// Build segment tree
		int val;
		for(int i = 0; i < N; i++) {
			val = scanner.nextInt();
			update(i, val);
		}

		// Find sliding minimum elements
		for(int i = 0; i <= N-L; i++) {
			System.out.print(RMQ(i, i+L-1));
			if(i < N-L)
				System.out.print(" ");
		}
		System.out.println();
	}

	public static void initSegTree(int _n) {
		n = 1;
		while(n < _n) {
			n *= 2;
		}

		D = new int[2*n-1];
		Arrays.fill(D, Integer.MAX_VALUE);
	}

	public static void update(int i, int val) {
		// Convert array index to tree index
		i = i + n - 1;

		// Update the target position
		D[i] = val;

		// Update all of its ascendants
		while(i > 0) {
			i = (i-1)/2;
			D[i] = Math.min(D[2*i+1], D[2*i+2]);
		}
	}

	public static int RMQ(int s, int t) {
		return query(s, t+1, 0, 0, n);
	}

	private static int query(int s, int t, int k, int l, int r) {
		if(l >= t || r <= s)
			return Integer.MAX_VALUE;

		else if(l >= s && r <= t)
			return D[k];

		else {
			int left = query(s, t, 2*k+1, l, (l+r)/2);
			int right = query(s, t, 2*k+2, (l+r)/2, r);
			return Math.min(left, right);
		}
	}
}
