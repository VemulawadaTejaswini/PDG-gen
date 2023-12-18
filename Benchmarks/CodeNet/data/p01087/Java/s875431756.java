public class Main {
	
	private static int getLevel(String s) {
		int r = 0;
		for (; r < s.length(); ++r) {
			if (s.charAt(r) != '.')
				break ;
		}
		return (r);
	}
	
	private static String getData(String s) {
		return s.substring(getLevel(s));
	}

	public static void main(String[] args) {
		try (java.io.InputStreamReader sr = new java.io.InputStreamReader(System.in);
				java.io.BufferedReader br = new java.io.BufferedReader(sr)) {
			for (;;) {
				final StringBuilder sb = new StringBuilder();
				final String[] d = new String[Integer.parseInt(br.readLine())];
				if (d.length == 0) break ;
				for (int i = 0; i < d.length; ++i) {
					d[i] = br.readLine();
				}
				for (int i = 0; i < d.length; ++i) {
					if (i + 1 < d.length && getLevel(d[i]) < getLevel(d[i + 1]))
						sb.append('(');
					sb.append(getData(d[i]));
					final int diff = getLevel(d[i]) - (i + 1 < d.length ? getLevel(d[i + 1]) : 0);
					if (diff <= 0)
						sb.append(' ');
					for (int j = 0; j < diff; ++j)
						sb.append(')');
					if (diff > 0 && i + 1 < d.length)
						sb.append(' ');
				}
				System.out.println(((Cell)Cell.parse("(+ " + sb.toString() + ")")).eval());
			}
		} catch (java.io.IOException e) { }
	}

	private static class Cell {
		
		public final Object car;
		public final Cell cdr;
		
		public Cell(Object car, Cell cdr) {
			this.car = car;
			this.cdr = cdr;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			this.toString(sb);
			return sb.toString();
		}
		
		public Object eval() {
			java.util.List<Object> args = new java.util.LinkedList<Object>();
			for (Cell it = this.cdr; it != null; it = it.cdr) {
				if (it.car instanceof Cell) {
					args.add(((Cell)it.car).eval());
				} else {
					args.add(it.car);
				}
			}
			
			if (car.equals("+")) {
				int res = 0;
				for (java.util.Iterator<Object> it = args.iterator(); it.hasNext(); ) {
					res += ((Integer)it.next()).intValue();
				}
				return res;
			}
			if (car.equals("*")) {
				int res = 1;
				for (java.util.Iterator<Object> it = args.iterator(); it.hasNext(); ) {
					res *= ((Integer)it.next()).intValue();
				}
				return res;
			}
			
			return null;
		}
		
		public void toString(StringBuilder sb) {
			sb.append('(');
			sb.append(this.car.toString());
			for (Cell it = this.cdr; it != null; it = it.cdr) {
				sb.append(' ');
				sb.append(it.car.toString());
			}
			sb.append(')');
		}
		
		public static Object parse(String s) {
			return (new LispParser(s)).parse();
		}
		
		public static Cell toList(java.util.List<Object> lis) {
			Cell res = null;
			for (java.util.ListIterator<Object> it = lis.listIterator(lis.size()); it.hasPrevious(); ) {
				res = new Cell(it.previous(), res);
			}
			return (res);
		}
		
		private static class LispParser {
			
			private final char[] s;
			private int p;
			
			public LispParser(String s) {
				this.s = s.toCharArray();
				this.p = 0;
			}
			
			public Object parse() {
				skipWS();
				if (s[p] == '(')
					return parseList();
				if (Character.isDigit(s[p]))
					return parseInteger();
				return parseAtom();
			}
			
			private Object parseList() {
				final java.util.List<Object> lis = new java.util.LinkedList<Object>();
				if (s[p] == '(') ++p;
				skipWS();
				while (s[p] != ')') {
					lis.add(parse());
					skipWS();
				}
				++p;
				return Cell.toList(lis);
			}
			
			private Object parseInteger() {
				int res = 0;
				while (Character.isDigit(s[p])) {
					res = res * 10 + s[p++] - '0';
				}
				return new Integer(res);
			}
			
			private Object parseAtom() {
				StringBuilder sb = new StringBuilder();
				while (!Character.isWhitespace(s[p])) {
					sb.append(s[p++]);
				}
				return sb.toString();
			}
			
			private void skipWS() {
				while (Character.isWhitespace(s[p])) {
					++p;
				}
			}
			
		}
		
	}
	
}