import java.util.Scanner;

public class Main {

	abstract class P {
		abstract boolean getValue();
	}

	class AND extends P {
		P left;
		P right;

		public AND(P l, P r) {
			left = l;
			right = r;
		}

		boolean getValue() {
			return left.getValue() && right.getValue();
		}

		public String toString(){
			return "("+left+"∧"+right+")";
		}
	}

	class OR extends P {
		P left;
		P right;

		public OR(P l, P r) {
			left = l;
			right = r;
		}

		boolean getValue() {
			return left.getValue() || right.getValue();
		}
		public String toString(){
			return "("+left+"∨"+right+")";
		}
	}

	class ARROW extends P {
		P left;
		P right;

		public ARROW(P l, P r) {
			left = l;
			right = r;
		}

		boolean getValue() {
			return !left.getValue() || right.getValue();
		}
		public String toString(){
			return "("+left+"→"+right+")";
		}
	}

	class NOT extends P {
		P exp;

		public NOT(P e) {
			this.exp = e;
		}

		boolean getValue() {
			return !exp.getValue();
		}
		public String toString(){
			return "¬"+exp;
		}
	}

	class PARAM extends P {
		int hensuu;

		public PARAM(int val) {
			hensuu = val;
		}

		boolean getValue() {
			return bmap[hensuu];
		}
		public String toString(){
			return hensuu+"";
		}
	}

	class TF extends P {
		boolean b;

		public TF(boolean val) {
			b = val;
		}

		boolean getValue() {
			return b;
		}
		public String toString(){
			return b?"T":"F";
		}
	}

	class EQUAL extends P {
		P l;
		P r;

		public EQUAL(P le, P ri) {
			l = le;
			r = ri;
		}

		boolean getValue() {
			return l.getValue() == r.getValue();
		}
		public String toString(){
			return l+"="+r;
		}
	}

	boolean[] bmap;

	P l;
	boolean isleft;

	public EQUAL eq(String str) {
		int eq = str.indexOf("=");
		return new EQUAL(formula(str.substring(0, eq)), formula(str.substring(
				eq + 1, str.length())));
	}

	public P formula(String str) {
		if (str.length() == 1) {
			char c = str.charAt(0);
			if (c == 'T') {
				return new TF(true);
			}
			if (c == 'F') {
				return new TF(false);
			}
			if ('a' <= c && c <= 'k') {
				return new PARAM(c - 'a');
			}
		}
		// 区切り点を捜索
		if (str.charAt(0) == '-') {
			P node = formula(str.substring(1));
			return new NOT(node);
		}
		if (str.charAt(0) == '(') {
			int ca = 0;
			for (int i = 1;; i++) {
				char c = str.charAt(i);
				switch (c) {
				case '(':
					ca++;
					break;
				case ')':
					ca--;
					break;
				}
				if (ca > 0) {
					continue;
				}
				switch (c) {
				case '+':
					P l1 = formula(str.substring(1, i));
					P r1 = formula(str.substring(i + 1, str.length() - 1));
					return new OR(l1, r1);
				case '*':
					P l2 = formula(str.substring(1, i));
					P r2 = formula(str.substring(i + 1, str.length() - 1));
					return new AND(l2, r2);
				case '-':
					if (str.charAt(i + 1) != '>') {
						break;
					}
					P l3 = formula(str.substring(1, i));
					P r3 = formula(str.substring(i + 2, str.length() - 1));
					return new ARROW(l3, r3);
				}
			}
		}
		return null;
	}

	public void run() throws Exception {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();
			if (str.equals("#")) {
				break;
			}
			EQUAL eq = eq(str);

			boolean res = true;
			bmap = new boolean[11];
			for (int p = 0; p < (1 << 11); p++) {
				for (int i = 0; i < 11; i++) {
					bmap[i] = (p / (1 << i)) % 2 == 1;
				}
				if (!eq.getValue()) {
					res = false;
					break;
				}
			}
			pr(res ? "YES" : "NO");
			/*
			 * if('#'==st.nextToken()){ break; }
			 */
			// isleft=true;
			// st.pushBack();
			formula(str);
		}
	}

	public static void main(String[] _) throws Exception {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.println(o);
	}
}