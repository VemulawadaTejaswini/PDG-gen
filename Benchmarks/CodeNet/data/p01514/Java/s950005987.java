
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	class Team implements Comparable<Team> {
		int id, solve, penalty;
		int[] wrong;
		
		Team(int id, int solve, int penalty, int n) {
			this.id = id;
			this.solve = solve;
			this.penalty = penalty;
			wrong = new int[n];
		}
		
		@Override
		public int compareTo(Team t) {
			if (solve > t.solve) return -1;
			else if (solve < t.solve) return 1;
			else {
				if (penalty < t.penalty) return -1;
				else if (penalty > t.penalty) return 1;
				else return 0;
			}
		}
		
		@Override
		public String toString() {
			return (id+1) + " " + solve + " " + penalty;
		}
	}
	
	public void run() {
		while (true) {
			int T = in.nextInt(), P = in.nextInt(), R = in.nextInt();
			if (T == 0) break;
			
			Team[] team = new Team[T];
			for (int i = 0; i < team.length; i++) {
				team[i] = new Team(i, 0, 0, P);
			}

			for (int i = 0; i < R; i++) {
				int tid = in.nextInt();
				int pid = in.nextInt();
				int time = in.nextInt();
				String message = in.next();
				tid--; pid--;
				if (message.matches("WRONG")) {
					team[tid].wrong[pid]++;
				} else {
					team[tid].solve++;
					team[tid].penalty += time + team[tid].wrong[pid] * 1200;
				}
			}
			
			Arrays.sort(team);
			
			for (int i = 0; i < team.length; i++) {
				System.out.println(team[i].toString());
			}
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