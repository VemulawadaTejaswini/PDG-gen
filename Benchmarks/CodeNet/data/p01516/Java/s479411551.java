
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	class Star {
		int[] radian = {90, 234, 18, 162, 306};
		Point2D.Double[] points = new Point2D.Double[5];
		Line2D.Double[] lines = new Line2D.Double[5];
		
		Star(int x, int y, int a, int r) {
			for (int i = 0; i < points.length; i++) {
				points[i] = new Point2D.Double(r * Math.cos((radian[i] + a) / 360.0 * 2 * Math.PI) + x, r * Math.sin((radian[i] + a) / 360.0 * 2 * Math.PI) + y);
			}
			for (int i = 0; i < lines.length; i++) {
				lines[i] = new Line2D.Double(points[i], points[(i+1) % 5]);
			}
		}
		
		public String toString() {
			String s = "";
			for (int i = 0; i < points.length; i++) {
				s += "(" + points[i].x + " " + points[i].y + ")\n";
			}
			return s;
		}
	}
	
	double culcDist(Star s1, Star s2) {
		double res = Double.MAX_VALUE;
		for (Line2D.Double line1 : s1.lines) {
			for (Line2D.Double line2 : s2.lines) {
				if (line1.intersectsLine(line2)) return 0;
			}
		}
		
		for (Line2D.Double line1 : s1.lines) {
			for (Point2D.Double point2 : s2.points) {
				res = Math.min(res, line1.ptSegDist(point2));
			}
		}
		
		
		for (Line2D.Double line2 : s2.lines) {
			for (Point2D.Double point1 : s1.points) {
				res = Math.min(res, line2.ptSegDist(point1));
			}
		}
		
		for (Point2D.Double point2 : s2.points) {
			for (Point2D.Double point1 : s1.points) {
				//System.out.println(point2.distance(point1));
				res = Math.min(res, point2.distance(point1));
			}
		}
		return res;
	}
	
	/* -----------Dijkstra---------- */
	public class Dijkstra {
		final static int INF = 1000000000;
		
		class State implements Comparable<State> {
			int n;
			
			State(int n) {
				this.n = n;
			}

			public int compareTo(State s) {
				double c1 = res.minCost[n], c2 = res.minCost[s.n];
				if (c1 < c2) return -1;
				else if (c1 > c2) return 1;
				else return 0;
			}
		}
		
		DijkstraResult res;
		double[][] edge;
		
		Dijkstra(double[][] edge) {
			this.edge = edge;
		}
		
		DijkstraResult doit(int start) {
			int n = edge.length;
			res = new DijkstraResult(n);
			Arrays.fill(res.minCost, Dijkstra.INF);
			
			PriorityQueue<State> pq = new PriorityQueue<State>();
			pq.add(new State(start));
			res.minCost[start] = 0;
			res.path[start] = start;
			
			while (!pq.isEmpty()) {
				State s = pq.poll();
				for (int i = 0; i < n; i++) {
					if (res.minCost[i] > res.minCost[s.n] + edge[s.n][i]) {
						res.minCost[i] = res.minCost[s.n] + edge[s.n][i];
						res.path[i] = s.n;
						pq.add(new State(i));
					}
				}
			}
			
			return res;
		}
	}

	/**
	 * it contains minCost and path from start node to each nodes.
	 * @author hiro116s
	 *
	 */
	class DijkstraResult {
		double[] minCost;
		int[] path;
		
		DijkstraResult(int n) {
			minCost = new double[n];
			path = new int[n];
		}
	}
	
	/*-------------end--------------*/
	
	public void run() {
		while (true) {
			int n = in.nextInt(), m = in.nextInt(), l = in.nextInt();
			if (n == 0) break;
			Star[] stars = new Star[n];
			for (int i = 0; i < n; i++) {
				int x = in.nextInt(), y = in.nextInt(), a = in.nextInt(), r = in.nextInt();
				stars[i] = new Star(x, y, a, r);
			}
			
			double[][] edge = new double[n][n];
			for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
				if (i == j) continue;
				edge[i][j] = culcDist(stars[i], stars[j]);
			}
			
			for (int i = 0; i < edge.length; i++) {
				//System.out.println(stars[i].toString());
				//System.out.println(Arrays.toString(edge[i]));
			}
			
			System.out.println(new Dijkstra(edge).doit(m-1).minCost[l-1]);
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