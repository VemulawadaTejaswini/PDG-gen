
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int[][] ind2ar, c;
	HashMap<A, Integer> ar2ind;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		c = new int[n][n];
		for (int i=0;i<n;i++) for (int j=0;j<n;j++)
			c[i][j] = sc.nextInt();

		ind2ar = new int[nPk(n, n)][n];
		ar2ind = new  HashMap<A, Integer>();

		Permutation per = new Permutation(n);
		for (int i=0;per.hasNext();i++) {
			int[] ar = per.next();
			ar2ind.put(new A(ar), i);
			System.arraycopy(ar, 0, ind2ar[i], 0, n);
		}
		
		int[] d = new int[nPk(n, n)];
		fill(d, INF);
		d[0] = 0;
		PriorityQueue<V> q = new PriorityQueue<V>();
		q.add(new V(0, 0));
		int ans = 0;
		for (;! q.isEmpty();) {
			V cur = q.remove();
			if (d[cur.p] != cur.c) continue;
			ans = max(ans, cur.c);
			
			for (int[] next : nextState(cur.p, n)) if (next[1] + cur.c < d[next[0]]){
				d[next[0]] = next[1] + cur.c;
				q.add(new V(next[0], cur.c + next[1]));
			}
		}
		System.out.println(ans);
	}
	
	int[][] nextState(int ind, int n) {
		int[] cur = ind2ar[ind];
		int[][] next = new int[nPk(n, 2) / 2][2];
		int index = 0;
		for (int i=0;i<n-1;i++) for (int j=i+1;j<n;j++) {
			int[] tmp = new int[n];
			System.arraycopy(cur, 0, tmp, 0, n);
			int t = tmp[i];
			tmp[i] = tmp[j];
			tmp[j] = t;
			next[index][0] = ar2ind.get(new A(tmp));
			next[index][1] = c[i][j];
			index++;
		}
		return next;
	}

	int nPk(int n, int k) {
		if (k == 0) return 1;
		return n * nPk(n-1, k-1);
	}
	
	class A {
		int[] ar;
		A(int[] ar) {
			this.ar = new int[ar.length];
			System.arraycopy(ar, 0, this.ar, 0, ar.length);
		}
		
		public boolean equals(Object o) {
			if (o instanceof A) {
				A a = (A) o;
				for (int i=0;i<ar.length;i++)
					if (a.ar[i] != ar[i]) return false;
				return true;
			}
			return false;
		}
		
		public int hashCode() {
			int sum = 0, pow = 1;
			for (int i=0;i<ar.length;i++) {
				sum += pow * ar[i];
				pow *= 10;
			}
			return sum;
		}
	}

	class V implements Comparable<V>{
		int p, c;
		V(int p, int c) {
			this.p = p;
			this.c = c;
		}
		@Override
		public int compareTo(V o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return c - o.c;
		}
	}

	class Permutation {
		private final int size;

		public Permutation(int size) {
			if (size <= 0) throw new IllegalArgumentException();
			this.size = size;
			source = new int[size];
			for (int i=0;i<size;i++) source[i] = i;
		}

		int[] source;
		boolean isFirst = true;

		public boolean hasNext() {
			if (isFirst) {
				isFirst = false;
				return true;
			}

			int n = source.length;
			for (int i = n - 1; i > 0; i--) {
				if (source[i - 1] < source[i]) {
					int j = n;
					while (source[i - 1] >= source[--j]);
					swap(source, i - 1, j);
					reverse(source, i, n);
					return true;
				}
			}
			reverse(source, 0, n);
			return false;
		}

		public int[] next() {
			return source;
		}

		private void swap(int[] is, int i, int j) {
			int t = is[i];
			is[i] = is[j];
			is[j] = t;
		}

		private void reverse(int[] is, int s, int t) {
			while (s < --t) swap(is, s++, t);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}