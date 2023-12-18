import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] var = new int[3];
	static char[] str;
	static int pos;

	public static void main(String[] arg) {
		while (true) {
			str = sc.next().toCharArray();
			if (str[0] == '.') break;
			pos = 0;
			Formula root = parse();
			int ans = 0;
			for (var[0] = 0; var[0] < 3; ++var[0]) {
				for (var[1] = 0; var[1] < 3; ++var[1]) {
					for (var[2] = 0; var[2] < 3; ++var[2]) {
						if (root.eval() == 2) ++ans;
					}
				}
			}
			System.out.println(ans);
		}
	}

	static Formula parse() {
		char c = str[pos++];
		if ('0' <= c && c <= '2') return new Constant(c - '0');
		if ('P' <= c && c <= 'R') return new Var(c);
		if (c == '-') return new Not(parse());
		Formula l = parse();
		char op = str[pos++];
		Formula r = parse();
		pos++;
		if (op == '*') {
			return new And(l, r);
		} else {
			return new Or(l, r);
		}
	}

	static abstract class Formula {
		abstract int eval();
	}

	static class Constant extends Formula {
		int v;

		Constant(int v) {
			this.v = v;
		}

		int eval() {
			return this.v;
		}
	}

	static class Var extends Formula {
		int p;

		Var(char name) {
			if (name == 'P') {
				this.p = 0;
			} else if (name == 'Q') {
				this.p = 1;
			} else {
				this.p = 2;
			}
		}

		int eval() {
			return var[p];
		}
	}

	static class Not extends Formula {
		Formula f;

		Not(Formula f) {
			this.f = f;
		}

		int eval() {
			int v = f.eval();
			return v == 1 ? v : 2 - v;
		}
	}

	static class And extends Formula {
		Formula left, right;

		And(Formula l, Formula r) {
			this.left = l;
			this.right = r;
		}

		int eval() {
			int vl = left.eval();
			int vr = right.eval();
			if (vl == 0 || vr == 0) return 0;
			if (vl == 1 || vr == 1) return 1;
			return 2;
		}
	}

	static class Or extends Formula {
		Formula left, right;

		Or(Formula l, Formula r) {
			this.left = l;
			this.right = r;
		}

		int eval() {
			int vl = left.eval();
			int vr = right.eval();
			if (vl == 2 || vr == 2) return 2;
			if (vl == 1 || vr == 1) return 1;
			return 0;
		}
	}

}