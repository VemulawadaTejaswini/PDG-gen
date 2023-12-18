
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	HashSet<Integer> hash = new HashSet<Integer>();
	HashSet<String> used = new HashSet<String>();
	
	Stack<String> stack = new Stack<String>();
	
	int add(String s1, String s2) {
		int a1 = Integer.valueOf(s1), a2 = Integer.valueOf(s2);
		return a1 + a2;
	}
	
	int sub(String s1, String s2) {
//		System.out.println("sub : " + s1 + " " + s2);
		int a1 = Integer.valueOf(s1), a2 = Integer.valueOf(s2);
		return a1 - a2;
	}
	
	int mul(String s1, String s2) {
		int a1 = Integer.valueOf(s1), a2 = Integer.valueOf(s2);
		return a1 * a2;
	}
	
	int div(String s1, String s2) {
		int a1 = Integer.valueOf(s1), a2 = Integer.valueOf(s2);
		if (a2 == 0) return INF;
		return a1 / a2;
	}
	
	int INF = 1500000000;
	String[] parseString(String s) {
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<Integer> expIdx = new ArrayList<Integer>();
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') continue;
			char c2 = s.charAt(i-1);
			if (c == '-' && (c2 < '0' || c2 > '9')) continue;
			expIdx.add(i);
		}
		
		if (expIdx.size() == 0) res.add(s);
		else {
			for (int i = 0; i < expIdx.size(); i++) {
				int idx = expIdx.get(i);
				String s1 = "";
				int ii = idx;
				while (true) {
					ii--;
					if (ii < 0) break;
					char c = s.charAt(ii);
					if ((c >= '0' && c <= '9') || (ii == 0 || (s.charAt(ii-1) < '0' || s.charAt(ii-1) > '9') && c == '-')) {
						s1 = c + s1;
					} else break;
				}
				
				String s2 = "";
				ii = idx;
				while (true) {
					ii++;
					if (ii >= s.length()) break;
					char c = s.charAt(ii);
					if ((c >= '0' && c <= '9') || (ii == idx + 1 && c == '-')) {
						s2 += c;
					} else break;
				}
				
				char exp = s.charAt(idx);
				int cul = 0;
				switch (exp) {
				case '+':
					cul = add(s1, s2);
					break;
				case '-':
					cul = sub(s1, s2);
					break;
				case '*':
					cul = mul(s1, s2);
					break;
				case '/':
					cul = div(s1, s2);
					break;
				}
				if (cul == INF) continue;
				int start = (i == 0) ? -1 : expIdx.get(i-1);
				int end = (i == expIdx.size() - 1) ? s.length() : expIdx.get(i+1);
				String r = s.substring(0, start+1) + cul + s.substring(end);
				res.add(r);
			}
		}
		
		return res.toArray(new String[0]);
	}
	
	void doit(String s) {
//		System.out.println("doit : \"" + s + "\"");
		int start = 0, end = 0;
		String[] parsed = null;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') start = i + 1;
			else if (c == ')') {
				end = i;
				parsed = parseString(s.substring(start, end));
				break;
			}	
		}
		if (start == end) {
			for (String next : parseString(s)) {
				if (used.contains(next)) continue;
				else {
					used.add(next);
					stack.push(next);
					try {
						hash.add(Integer.valueOf(next));
					} catch (NumberFormatException e) {
						
					}
				}
			}
		} else {
			for (String p : parsed) {
				String temp = "";
				try {
					int x = Integer.valueOf(p);
					temp = s.substring(0, start-1) + p + s.substring(end+1);
				} catch (NumberFormatException e) {
					temp = s.substring(0, start) + p + s.substring(end);
				}
				used.add(temp);
				stack.push(temp);
			}
		}
	}
	
	public void run() {
		while (true) {
			String s = in.next();
			if (s.matches("#")) break;
			
			hash.clear();
			used.clear();
			used.add(s);
			stack.push(s);
			while (!stack.isEmpty()) {
				String next = stack.pop();
				doit(next);
			}
//			for (Integer i : hash) System.out.print(i + " ");
//			System.out.println();
			System.out.println(hash.size());
		}
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}