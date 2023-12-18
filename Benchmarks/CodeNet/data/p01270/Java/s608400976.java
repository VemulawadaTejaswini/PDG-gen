
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			ArrayList<Integer> from = new ArrayList<Integer>();
			ArrayList<Integer> to = new ArrayList<Integer>();
			ArrayList<Integer> idlist = new ArrayList<Integer>();
			
			for (int i = 0; i < n; i++) {
				int id, S;
				char command = in.next().charAt(0);
				switch(command) {
				case 'W':
//					System.out.println("----------Write---------");
					id = in.nextInt(); S = in.nextInt();
					int idx = 0;
					while (S > 0) {
//						System.out.println(idx + " " + S);
						int min = idx + S, cur = -1;
						for (int j = 0; j < from.size(); j++) {
							if (idx < to.get(j) && min > from.get(j)) {
								min = from.get(j);
								cur = j;
							}
						}
						if (cur != -1) {
//							System.out.println("cur = else");
							if (idx < min) {
								from.add(idx);
								to.add(min - 1);
								idlist.add(id);
							}
							S -= min - idx;
							idx = to.get(cur) + 1;
						} else {
//							System.out.println("cur = -1");
							from.add(idx);
							to.add(idx + S - 1);
							idlist.add(id);
							S = 0;
						}
						
					}

//					System.out.println(Arrays.toString(idlist.toArray(new Integer[0])));
//					System.out.println(Arrays.toString(from.toArray(new Integer[0])));
//					System.out.println(Arrays.toString(to.toArray(new Integer[0])));
//					System.out.println();
					
					break;
				case 'D':
//					System.out.println("---------Delete---------");
					id = in.nextInt();
					for (int j = idlist.size() - 1; j >= 0; j--) {
						if (idlist.get(j) == id) {
							from.remove(j);
							to.remove(j);
							idlist.remove(j);
						}
					}
					
//					System.out.println(Arrays.toString(idlist.toArray(new Integer[0])));
//					System.out.println(Arrays.toString(from.toArray(new Integer[0])));
//					System.out.println(Arrays.toString(to.toArray(new Integer[0])));
//					System.out.println();
					break;
				case 'R':
//					System.out.println("--------Read----------");
					id = in.nextInt();
					boolean flag = true;
					for (int j = 0; j < idlist.size(); j++) {
						int f = from.get(j), t = to.get(j);
						if (f <= id && id <= t) {
							System.out.println(idlist.get(j));
							flag = false;
							break;
						}
					}
					if (flag) System.out.println(-1);
					break;
				}
			}
			System.out.println();
			
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