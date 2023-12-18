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
		while(solve());
		io.flush();
	}
	public static boolean solve() {
		int n = io.nextInt();
		int m = io.nextInt();
		int c = io.nextInt();
		if (n == 0) return false;
		Graph g = new Graph(n*(n+1));
		for(int i=0;i<m;i++) {
			int a = io.nextInt() - 1;
			int b = io.nextInt() - 1;
			int d = io.nextInt();
			for(int k=0;k<=n;k++) {
				g.addEdge(n*k+a, n*k+b, d);
			}
			for(int k=0;k<n;k++) {
				g.addEdge(n*k+a, n*(k+1)+b, 0);
			}
		}
		int[] d = g.minDistDijkstra(0);
//		System.err.println(Arrays.toString(d));
		for(int i=0;i<=n;i++) {
			if (d[i*n+n-1] <= c) {
				io.println(i);
				break;
			}
		}
		return true;
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

	public void addBidirectionalEdge(int from,int to,int cost) {
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public int[] minDistDijkstra(int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
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
		int cost;
		public Edge(int to,int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		int dist;
		int id;
		public Node(int dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
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


