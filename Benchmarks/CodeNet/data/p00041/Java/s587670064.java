
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[] used = new boolean[4];
	int[] node = new int[4];
	int un = 0;

	class expression {
		int used;
		int val;
		String exp;

		expression(int val, String exp, int used) {
			this.val = val;
			this.exp = exp;
		}

		public String toString() {
			return this.exp;
		}

		expression add(expression e) {
			expression ret = new expression(this.val + e.val, "( " + this.exp
					+ " ) + ( " + e.exp + " )", this.used | e.used);
			return ret;
		}

		expression sub(expression e) {
			expression ret = new expression(this.val - e.val, "( " + this.exp
					+ " ) - ( " + e.exp + " )", this.used | e.used);
			return ret;
		}

		expression mul(expression e) {
			expression ret = new expression(this.val * e.val, "( " + this.exp
					+ " ) * ( " + e.exp + " )", this.used | e.used);
			return ret;
		}
	}

	int ope(int a, int b, int oper) {
		if (oper == 0) {
			return a + b;
		} else if (oper == 1) {
			return a - b;
		} else {
			return a * b;
		}
	}

	String opep(String a, String b, int oper) {
		if (oper == 0) {
			return "( "+a + " + " + b+" )";
		} else if (oper == 1) {
			return "( "+a + " - " + b+" )";
		} else {
			return "( "+a + " * " + b+" )";
		}
	}

	String dec(int order1, int order2, int order3, int order4, int ope1,
			int ope2, int ope3, int structure) {
		if (structure == 0) {
			return opep(
					opep(opep(node[order1] + "", node[order2] + "", ope1), node[order3] + "",
							ope2), node[order4] + "", ope3);
		} else {
			return opep(opep(node[order1] + "", node[order2] + "", ope1),
					opep(node[order3] + "", node[order4] + "", ope3), ope2);
		}
	}

	int decode(int order1, int order2, int order3, int order4, int ope1,
			int ope2, int ope3, int structure) {
		if (structure == 0) {
			return ope(ope(ope(node[order1], node[order2], ope1), node[order3], ope2), node[order4],
					ope3);
		} else {
			return ope(ope(node[order1], node[order2], ope1), ope(node[order3], node[order4], ope3),
					ope2);
		}
	}

	boolean check(int order1, int order2, int order3, int order4, int ope1,
			int ope2, int ope3, int structure) {
		boolean[] b = new boolean[4];
		b[order1] = true;
		b[order2] = true;
		b[order3] = true;
		b[order4] = true;
		boolean check = true;
		for (int i = 0; i < 4; i++) {
			check &= b[i];
		}
		if (!check) {
			return false;
		} else {
			return 10 == decode(order1, order2, order3, order4, ope1, ope2,
					ope3, structure);
		}
	}

	void run() {
		for (;;) {
			int zero = 0;
			used = new boolean[4];
			node = new int[4];
			un = 0;
			for (int i = 0; i < 4; i++) {
				node[i] = sc.nextInt();
				zero |= node[i];
			}
			if (zero == 0) {
				break;
			}
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					for (int k = 0; k < 4; k++)
						for (int l = 0; l < 4; l++)
							for (int m = 0; m < 3; m++)
								for (int n = 0; n < 3; n++)
									for (int o = 0; o < 3; o++)
										for (int p = 0; p < 2; p++)
											if (check(i, j, k, l, m, n, o, p)){
												System.out.println(dec(i, j, k,
														l, m, n, o, p));
												i=j=k=l=m=n=o=p=4;
											}

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();

	}
}