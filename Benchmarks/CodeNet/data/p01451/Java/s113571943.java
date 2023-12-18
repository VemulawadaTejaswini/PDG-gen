import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		solve();
		io.flush();
	}
	public static boolean solve() {
		int n1 = io.nextInt();
		int n2 = io.nextInt();
		Vector2[] p1 = new Vector2[n1];
		Vector2[] p2 = new Vector2[n2];
		for(int i=0;i<n1;i++) {
			p1[i] = new Vector2(io.nextInt(), io.nextInt());
		}
		for(int i=0;i<n2;i++) {
			p2[i] = new Vector2(io.nextInt(), io.nextInt());
		}
		double ans = Math.min(solveHalf(n1, p1, p2[0], p2[1]), solveHalf(n2, p2, p1[0], p1[1]));
		if (ans >= Double.POSITIVE_INFINITY) {
			io.println(-1);
		}else{
			io.println(String.format("%.9f",ans));
		}
		return true;
	}

	public static double solveHalf(int n, Vector2[] p, Vector2 a1, Vector2 a2) {
		Graph g = new Graph(n);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (Vector2.intersects(p[i], p[j], a1, a2)) {
					continue;
				}
				g.addBidirectionalEdge(i, j, Math.sqrt(p[i].subtract(p[j]).normSquare()));
			}
		}
		return g.minDistDijkstra(0)[1] + Math.sqrt(a1.subtract(a2).normSquare());
	}

}
class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}

	public void addBidirectionalEdge(int from,int to,double d) {
		addEdge(from,to,d);
		addEdge(to,from,d);
	}
	public void addEdge(int from,int to,double cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public double[] minDistDijkstra(int s) {
		double[] dist = new double[n];
		Arrays.fill(dist, Double.POSITIVE_INFINITY);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(0, s));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				continue;
			}
			for(Edge e:graph[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

	class Edge {
		int to;
		double cost;
		public Edge(int to,double cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		double dist;
		int id;
		public Node(double dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
		}
	}
}

class Vector2 {
	int x = 0;
	int y = 0;
	public Vector2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public int cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(this.x+v.x,this.y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(this.x-v.x,this.y-v.y);
	}
	public Vector2 multiply(int k) {
		return new Vector2(k*this.x,k*this.y);
	}
	public long normSquare() {
		return x * x + y * y;
	}
	public long distSquare(Vector2 v) {
		return this.subtract(v).normSquare();
	}
	public static boolean intersects(Vector2 p0,Vector2 p1,Vector2 p2,Vector2 p3) {
		Vector2 v1 = p1.subtract(p0);
		Vector2 v2 = p3.subtract(p2);
		Vector2 v = p2.subtract(p0);
		Vector2 v_ = p2.subtract(p1);
		int a = v1.cross(v2);
		if(a==0) {
			return v.cross(v_) == 0 && (v.dot(v_) <= 0 || p0.subtract(p2).dot(p0.subtract(p3)) <= 0);
		}else{
			int a1 = -v1.cross(v);
			int a2 = -v2.cross(v);
			if (a>0) {
				return (0<=a1&&a1<=a&&0<=a2&&a2<=a);
			}else{
				return (a<=a1&&a1<=0&&a<=a2&&a2<=0);
			}
		}
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}


