import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable{

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 1024L*1024*64).start();
	}

	@Override
	public void run() {
		IO io = new IO();
		int n = io.nextInt();
		Graph g = new Graph(n);
		for(int i=0;i<n;i++) {
			int k = io.nextInt();
			for(int j=0;j<k;j++) {
				g.addBidirectionalEdge(i, io.nextInt());
			}
		}
		HLDecomposition hl = g.rootedTree(0).hlDecomposition();
		int q = io.nextInt();
		for(int i=0;i<q;i++) {
			io.println(hl.lca(io.nextInt(), io.nextInt()));
		}
		io.flush();
	}

}
//be careful for stack overflow
class Graph {
	int n;
	ArrayList<Integer>[] edge;
	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		edge = new ArrayList[n];
		for(int i=0;i<n;i++) {
			edge[i] = new ArrayList<>();
		}
	}
	public void addBidirectionalEdge(int u,int v) {
		edge[u].add(v);
		edge[v].add(u);
	}
	public RootedTree rootedTree(int root) {
		return new RootedTree(this,root);
	}
}
class RootedTree {
	int n;
	int root;
	ArrayList<Integer>[] child;
	int[] parent;
	int[] in,out;
	int[] subTreeSize;
	@SuppressWarnings("unchecked")
	public RootedTree(Graph g,int root) {
		this.n = g.n;
		this.root = root;
		child = new ArrayList[n];
		for(int i=0;i<n;i++) {
			child[i] = new ArrayList<>();
		}
		parent = new int[n];
		in = new int[n];
		out = new int[n];
		subTreeSize = new int[n];
		k = 0;
		dfs(root,-1,g);
	}
	int k;
	private void dfs(int v,int p,Graph g) {
		in[v] = k++;
		parent[v] = p;
		subTreeSize[v] = 1;
		for(int u:g.edge[v]) {
			if (u == p) {
				continue;
			}
			child[v].add(u);
			dfs(u,v,g);
			subTreeSize[v] += subTreeSize[u];
		}
		out[v] = k++;
	}
	public boolean isAncestor(int parent,int child) {
		return in[parent] <= in[child] && out[child] <= out[parent];
	}
	public HLDecomposition hlDecomposition() {
		return new HLDecomposition(this);
	}
}
class HLDecomposition {
	RootedTree r;
	int[] pathId;
	int[] pathIndex;
	int[] pathRoot;
	int pathnum;
	int[] pathSize;
	public HLDecomposition(RootedTree r) {
		this.r = r;
		int n = r.n;
		pathId = new int[n];
		pathIndex = new int[n];
		pathRoot = new int[n];
		pathSize = new int[n];
		pathnum = 1;
		dfs(r.root,0,0,0);
//		System.out.println(Arrays.toString(pathId));
//		System.out.println(Arrays.toString(pathIndex));
//		System.out.println(Arrays.toString(pathRoot));
//		System.out.println(pathnum);
//		System.out.println(Arrays.toString(pathSize));
	}
	private void dfs(int v,int pid,int pindex,int proot) {
		pathId[v] = pid;
		pathIndex[v] = pindex;
		pathRoot[v] = proot;
		if (r.child[v].size() == 0) {
			pathSize[pid] = pindex + 1;
			return;
		}
		int maxsize = -1;
		int maxu = -1;
		for(int u:r.child[v]) {
			if (r.subTreeSize[u] > maxsize) {
				maxsize = r.subTreeSize[u];
				maxu = u;
			}
		}
		for(int u:r.child[v]) {
			if (u == maxu) {
				dfs(u,pid,pindex+1,proot);
			}else{
				dfs(u,pathnum++,0,u);
			}
		}
	}
//	public ArrayList<Query> query(int first,int last) {
//		ArrayList<Query> head = new ArrayList<>();
//		ArrayList<Query> tail = new ArrayList<>();
//		while(pathId[first] != pathId[last]) {
//			if (r.level[first] >= r.level[last]) {
//				head.add(new Query(pathId[first] , pathIndex[first], 0));
//				first = pathParent[first];
//			}else{
//				tail.add(new Query(pathId[last],0,pathIndex[last]));
//				last = pathParent[last];
//			}
//		}
//		head.add(new Query(pathId[first],pathIndex[first],pathIndex[last]));
//		for(int i=tail.size()-1;i>=0;i--) {
//			head.add(tail.get(i));
//		}
//		return head;
//	}
//	public ArrayList<Query> queryIgnoreDirection(int u,int v) {
//		ArrayList<Query> ans = query(u,v);
//		for(Query p:ans) {
//			if (p.first > p.last) {
//				int temp = p.first;
//				p.first = p.last;
//				p.last = temp;
//			}
//		}
//		return ans;
//	}
	public int lca(int u,int v) {
		while(!r.isAncestor(pathRoot[u], v)) {
			u = r.parent[pathRoot[u]];
		}
		while(!r.isAncestor(pathRoot[v], u)) {
			v = r.parent[pathRoot[v]];
		}
		return r.isAncestor(u, v) ? u : v;
	}
	static class Query {
		int pathId;
		int first,last;
		public Query(int pathId,int first,int last) {
			this.pathId = pathId;
			this.first = first;
			this.last = last;
		}
		public String toString() {
			return pathId + ":[" + first + "," + last + "]";
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