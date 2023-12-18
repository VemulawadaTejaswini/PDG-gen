import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	// Tree := (Tree Tree) | Leaf
	String t;
	int idx;
	int nidx;
	int ls[];
	int n;
	int ps[];
	Tree T;

	Tree tree() {
		if (t.charAt(idx) >= '0' && t.charAt(idx) <= '9') {
			int v = t.charAt(idx) - '0';
			idx++;
			return new Tree(v);
		}
		if (t.charAt(idx) == '(')
			idx++;
		Tree l = tree();
		idx++;
		Tree r = tree();
		if (t.charAt(idx) == ')')
			idx++;
		return new Tree(l, r);
	}

	void run() {
		while (true) {
			t = sc.nextLine();
			if (t.equals("END"))
				break;
			idx = 0;
			n = sc.nextInt();
			ls = new int[n];
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				ls[i] = (a << 3) + (b << 2) + (c << 1) + d;
			}
			sc.nextLine();
			ps = new int[n - 1];
			T = tree();
			System.out.println(solve(0));
		}
	}

	int solve(int k) {
		int res = 0;
		if (k == n - 1) {
			nidx = 0;
			int set = 0;
			if (n == 1) {
				set = ls[T.v];
			} else {
				set = check(T);
			}
			if (set == 15)
				return 1;
			else
				return 0;
		}
		for (int i = 0; i < 3; i++) {
			ps[k] = i;
			res += solve(k + 1);
		}
		return res;
	}

	int check(Tree tr) {
		if (tr.v >= 0) {
			return ls[tr.v - 1];
		}
		Tree l = tr.l;
		Tree r = tr.r;
		int res = 0;
		switch (ps[nidx++]) {
		case 0:
			res = check(l) & check(r);
			break;
		case 1:
			res = check(l) | check(r);
			break;
		case 2:
			res = check(l) ^ check(r);
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

class Tree {
	Tree l;
	Tree r;
	int v;

	Tree(Tree l, Tree r) {
		this.l = l;
		this.r = r;
		v = -1;
	}

	Tree(int v) {
		this.v = v;
	}

	public String toString() {
		if (v < 0) {
			return "(" + l.toString() + " " + r.toString() + ")";
		}
		return v + "";
	}
}