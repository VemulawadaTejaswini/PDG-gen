import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			List<Integer> ints = new ArrayList<>();
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			ints.add(in.nextInt());
			if(ints.get(0) == 0) return;
			System.out.println(solve(ints));
		}
	}

	/**
	 * http://dai1741.github.io/maximum-algo-2012/docs/parsing/
	 */
	static class Calc {
		int i;
		String s;
		private static final Map<String, Integer> opPriority = new HashMap<String, Integer>() {
			{
				put("+", 2);
				put("-", 2);
				put("*", 3);
				put("(", 3);
				put(")", 3);
			}
		};

		public boolean isOperator(String token) {
			return opPriority.containsKey(token);
		}

		public int calc(String exp) throws Exception {
			i=0;
			s = exp;
			s = s.replaceAll(" ", "");
			return expr();
		}

		public int expr() throws Exception {
			int val = term();
			while(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
				char op = s.charAt(i);
				i++;
				int val2 = term();
				if (op == '+') val += val2;
				else val -= val2;
			}
			return val;
		}

		public int term() throws Exception {
			int val = factor();
			while(i < s.length() && s.charAt(i) == '*') {
				char op = s.charAt(i);
				i++;
				int val2 = factor();
				val *= val2;
			}
			return val;
		}

		public int factor() throws Exception {
			if(Character.isDigit(s.charAt(i))) {
				return number();
			}

			if(s.charAt(i) != '(') {
				new Exception();
			}
			i++;
			int ret = expr();
			if(s.charAt(i) != ')') {
				new Exception();
			}
			i++;
			return ret;
		}

		public int number() throws Exception {
			int n = Integer.parseInt(""+s.charAt(i));
			i++;
			while(i < s.length() && Character.isDigit(s.charAt(i))) {
				n = n * 10 + Integer.parseInt(""+s.charAt(i));
				i++;
			}
			return n;
		}
	};

	public static String solve(List<Integer> ints) throws Exception {
		String[] exps={
				"(a x a) x a x a",
				"(a x a x a) x a",
				"(a x a x a x a)",
				"((a x a) x a x a)",
				"((a x a x a) x a)",
				"(((a x a) x a) x a)",
				"((a x (a x a)) x a)",
				"(a x (a x a) x a)",
				"(a x (a x a x a))",
				"(a x ((a x a) x a))",
				"(a x (a x (a x a)))",
				"(a x a x (a x a))",
				"((a x a) x a) x a",
				"(a x (a x a)) x a",
				"a x (a x a) x a",
				"a x (a x a x a)",
				"a x ((a x a) x a)",
				"a x (a x (a x a))",
				"a x a x (a x a)",
		};
		String[] ops = {"+","-","*"};
		for(int a=0;a<4;a++) {
			for(int b=0;b<4;b++) {
				if(a == b) continue;
				for(int c=0;c<4;c++) {
					if(a == c || b == c) continue;
					for(int d=0;d<4;d++) {
						if(a == d || b == d || c == d) continue;
						for(int e=0;e<3;e++) {
							for(int f=0;f<3;f++) {
								for (int g = 0; g < 3; g++) {
									for (int i = 0; i < exps.length; i++) {
										String exp = exps[i];
										String buf = new String(exp);
										buf = buf.substring(0, buf.indexOf('a')) + ints.get(a) + buf.substring(buf.indexOf('a')+1);
										buf = buf.substring(0, buf.indexOf('a')) + ints.get(b) + buf.substring(buf.indexOf('a')+1);
										buf = buf.substring(0, buf.indexOf('a')) + ints.get(c) + buf.substring(buf.indexOf('a')+1);
										buf = buf.substring(0, buf.indexOf('a')) + ints.get(d) + buf.substring(buf.indexOf('a')+1);
										buf = buf.substring(0, buf.indexOf('x')) + ops[e] + buf.substring(buf.indexOf('x')+1);
										buf = buf.substring(0, buf.indexOf('x')) + ops[f] + buf.substring(buf.indexOf('x')+1);
										buf = buf.substring(0, buf.indexOf('x')) + ops[g] + buf.substring(buf.indexOf('x')+1);
										if((new Calc().calc(buf)) == 10) {
											return buf;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return "0";
	}
}