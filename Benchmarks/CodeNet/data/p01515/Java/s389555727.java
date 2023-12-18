import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	 String str = in.next();
	 if (!"#".equals(str)) {
		String[] lr = str.split("=");
		Formula left = Formula.of(lr[0]);
		Formula right = Formula.of(lr[1]);
		int max = Integer.parseInt("11111111111", 2);
		boolean isYes = true;
		for (int i = 0; i <= max && isYes; i++) {
		 isYes = left.getAns(i) == right.getAns(i);
		}
		System.out.println(isYes ? "YES" : "NO");
		str = in.next();
	 }
	}
 }

 abstract static class Formula {
	static final Pattern PATTERN =
	                               Pattern
	                                 .compile("^\\((.+)\\)$");

	abstract boolean getAns(int bools);

	public static Formula of(String string) {
	 if ("T".equals(string)) { return Teisu.T; }
	 if ("F".equals(string)) { return Teisu.F; }
	 if ("a".equals(string)) { return Var.a; }
	 if ("b".equals(string)) { return Var.b; }
	 if ("c".equals(string)) { return Var.c; }
	 if ("d".equals(string)) { return Var.d; }
	 if ("e".equals(string)) { return Var.e; }
	 if ("f".equals(string)) { return Var.f; }
	 if ("g".equals(string)) { return Var.g; }
	 if ("h".equals(string)) { return Var.h; }
	 if ("i".equals(string)) { return Var.i; }
	 if (string.startsWith("-")) {
		Not n = new Not(of(string.substring(1)));
		return n;
	 }
	 String f1 = null;
	 String f2 = null;
	 String op = null;
	 StringBuilder sb = new StringBuilder();
	 int kakko = 0;
	 int posi = 1;
	 while (posi < string.length() - 1) {
		char c = string.charAt(posi++);
		if (c == '(') {
		 kakko++;
		} else if (c == ')') {
		 kakko--;
		}
		if (kakko == 0) {
		 if (c == '+' || c == '*') {
			op = (c == '+') ? "+" : "*";
			f1 = sb.toString();
			sb.setLength(0);
		 } else if (c == '-' && string.charAt(posi) == '>') {
			posi++;
			op = "->";
			f1 = sb.toString();
			sb.setLength(0);
		 } else {
			sb.append(c);
		 }
		} else {
		 sb.append(c);
		}
	 }
	 f2 = sb.toString();
	 return new Ope(of(f1), op, of(f2));

	}

 }

static class Teisu extends Formula {
	final boolean      bool;
	static final Teisu T = new Teisu(true);
	static final Teisu F = new Teisu(false);

	Teisu(boolean bool) {
	 this.bool = bool;
	}

	@Override
	boolean getAns(int bools) {
	 return bool;
	}
 }

static class Var extends Formula {
	static final Var a = new Var(1);
	static final Var b = new Var(2);
	static final Var c = new Var(4);
	static final Var d = new Var(8);
	static final Var e = new Var(16);
	static final Var f = new Var(32);
	static final Var g = new Var(64);
	static final Var h = new Var(128);
	static final Var i = new Var(256);
	final int        var;

	Var(int var) {
	 this.var = var;
	}

	@Override
	boolean getAns(int bools) {
	 return var == (var & bools);
	}
 }

static class Not extends Formula {
	final Formula f;

	Not(Formula f) {
	 this.f = f;
	}

	@Override
	boolean getAns(int bools) {
	 return !f.getAns(bools);
	}
 }

 static class Ope extends Formula {
	final Formula f1;
	final Formula f2;
	final String  op;

	Ope(Formula f1, String op, Formula f2) {
	 this.f1 = f1;
	 this.f2 = f2;
	 this.op = op;
	}

	@Override
	boolean getAns(int bools) {
	 boolean result;
	 if ("*".equals(op)) {
		result = f1.getAns(bools) && f2.getAns(bools);
	 } else if ("+".equals(op)) {
		result = f1.getAns(bools) || f2.getAns(bools);
	 } else {
		result = f1.getAns(bools) == false || f2.getAns(bools) == true;
	 }
	 return result;
	}

 }
}