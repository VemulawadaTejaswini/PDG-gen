/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_A&lang=jp
 */

import java.util.*;
public class Main {
	int[] A;
	boolean solve(int m, int d) {
		if (d >= A.length) return false;
		int x = m - A[d];
		if (x == 0) return true;
		else {
			if (x > 0) solve(x, d+1);
			solve(m, d+1);
		}
		return solve(m-A[d], d+1) || solve(m, d+1);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) A[i] = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int m = sc.nextInt();
			if (solve(m, 0)) System.out.println("yes");
			else System.out.println("no");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

