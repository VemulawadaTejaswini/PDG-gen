import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * How can I satisfy thee? Let me count the ways...
 */
public class Main {

	static enum OP {NOT, AND, OR}

	static enum VALUE {FALSE, UNK, TRUE}

	static VALUE[] TableNot = new VALUE[]{
			VALUE.TRUE, VALUE.UNK, VALUE.FALSE
	};
	static VALUE[][] TableAnd = new VALUE[][]{
			{VALUE.FALSE, VALUE.FALSE, VALUE.FALSE},
			{VALUE.FALSE, VALUE.UNK, VALUE.UNK},
			{VALUE.FALSE, VALUE.UNK, VALUE.TRUE},
	};
	static VALUE[][] TableOr = new VALUE[][]{
			{VALUE.FALSE, VALUE.UNK, VALUE.TRUE},
			{VALUE.UNK, VALUE.UNK, VALUE.TRUE},
			{VALUE.TRUE, VALUE.TRUE, VALUE.TRUE},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals(".")) break;

			//parse
			Var var = main.new Var();
			Exp exp = null;

			Deque<OP> ops = new ArrayDeque<>();
			Deque<Exp> exps = new ArrayDeque<>();
			Deque<Character> signs = new ArrayDeque<>();

			for (int i = 0; i < line.length(); i++) {

				char c = line.charAt(i);
				boolean mono = false;

				switch (c) {
					case '(':
						signs.add(c);
						break;
					case ')': {
						OP op = ops.pollLast();
						Exp s = exps.pollLast();
						Exp f = exps.pollLast();
						exps.add(main.new Exp(op, f, s));
						signs.pollLast();
						mono = true;
					}
					break;
					case '*':
						ops.add(OP.AND);
						break;
					case '+':
						ops.add(OP.OR);
						break;
					case '-':
						ops.add(OP.NOT);
						signs.add(c);
						break;
					default: {
						exps.add(main.new Exp(c, var));
						mono = true;
					}
					break;
				}
				//monominal?
				if (signs.peekLast() != null && mono) {
					while (signs.peekLast() != null && signs.peekLast() == '-') {
						OP op = ops.pollLast();
						Exp f = exps.pollLast();
						exps.add(main.new Exp(op, f));
						signs.pollLast();
					}
				}
			}

			//solve
			exp = exps.poll();
//			System.out.println(exp.toString());

			int count = 0;
			for (VALUE p : VALUE.values()) {
				for (VALUE q : VALUE.values()) {
					for (VALUE r : VALUE.values()) {
						var.substitution(p, q, r);
						if (exp.eval().equals(VALUE.TRUE)) count++;
					}
				}
			}
			System.out.println(count);
		}//end while
	} //end main

	class Var {

		VALUE P, Q, R;

		void substitution(VALUE P, VALUE Q, VALUE R) {
			this.P = P;
			this.Q = Q;
			this.R = R;
		}

		VALUE eval(char name) {
			VALUE ret = VALUE.FALSE;
			switch (name) {
				case '0':
					ret = VALUE.FALSE;
					break;
				case '1':
					ret = VALUE.UNK;
					break;
				case '2':
					ret = VALUE.TRUE;
					break;
				case 'P':
					ret = P;
					break;
				case 'Q':
					ret = Q;
					break;
				case 'R':
					ret = R;
					break;
			}
			return ret;
		}
	}

	class Exp {

		OP op;
		Exp f, s;
		char name;
		Var var;

		Exp(OP op, Exp f, Exp s) {
			this.op = op;
			this.f = f;//first term
			this.s = s;//second term
		}

		Exp(OP op, Exp F) {
			this.op = op;
			this.f = F;
		}

		Exp(char name, Var var) {
			this.name = name;
			this.var = var;
		}

		VALUE eval() {
			VALUE ret = VALUE.FALSE;
			if (var != null) {
				ret = var.eval(name);
			} else {
				switch (op) {
					case NOT:
						ret = TableNot[f.eval().ordinal()];
						break;
					case AND:
						ret = TableAnd[f.eval().ordinal()][s.eval().ordinal()];
						break;
					case OR:
						ret = TableOr[f.eval().ordinal()][s.eval().ordinal()];
						break;
				}
			}
			return ret;
		}

		public String toString() {
			String ret = "";
			if (var != null) {
				ret += name;
			} else {
				if (op == OP.NOT) {
					ret = "-" + f.toString();
				} else {
					String _op = "";
					switch (op) {
						case AND:
							_op = "*";
							break;
						case OR:
							_op = "+";
							break;
					}
					ret = "(" + f.toString() + _op + s.toString() + ")";
				}
			}
			return ret;
		}
	}
}