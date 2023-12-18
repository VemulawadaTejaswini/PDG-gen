
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, k;
	Books[] books;
	int[][] vals;

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); k = sc.nextInt();
		books = new Books[10];
		for (int i=0;i<10;i++) books[i] = new Books();
		for (int i=0;i<n;i++) {
			int c = sc.nextInt(), g = sc.nextInt() - 1;
			books[g].add(c);
		}
		for (int i=0;i<10;i++) sort(books[i], new MyComp());
		vals = new int[10][k+1];
		vals[0][0] = 0;
		for (int i=0;i<10;i++) {
			int p = 1, sum = 0;
			for (int v : books[i]) {
				sum += v;
				vals[i][p] = sum + p * (p-1);
				if (p == k) break;
				p++;
			}
		}
		mem = new int[10][k+1];
		for (int[] a : mem) fill(a, -1);
		System.out.println(solve(0, k));

	}
	int[][] mem;
	int solve(int j, int k) {
		if (j == 10 || k == 0) return 0;
		if (mem[j][k] >= 0) return mem[j][k];

		int ret = 0;
		for (int i=0;i<=k;i++) {
			ret = max(ret, solve(j+1, k-i) + vals[j][i]);
		}

		return mem[j][k] = ret;
	}

	class MyComp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return o2 - o1;
		}

	}

	class Books extends LinkedList<Integer> {}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}