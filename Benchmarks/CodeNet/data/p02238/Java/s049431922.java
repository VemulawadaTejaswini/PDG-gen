import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	
	int n = 0;
	Graph g = new Graph();
	
	public void input() throws IOException {
		n = in.nextInt();
		g.init(n);
		for(int i=0; i<n; i++) {
			int v = in.nextInt();
			int k = in.nextInt();
			int[] adj = in.nextInt(new int[k]);
			g.addVertice(v, adj, 0, k);
		}
	}

	public void solve() throws IOException {
		int t = 0;
		for(int i=1; i<=n; i++) {
			t = dfs(i,t);
		}
	}
	
	public void output() {
		for(int i=1; i<=n; i++) {
			out.print(i);
			out.print(' ');
			out.print(g.getD(i));
			out.print(' ');
			out.println(g.getF(i));
		}
		out.flush();
	}
	
	private int dfs(int nodeId, int timestamp) {
		if(g.getD(nodeId) == 0) {
			g.setD(nodeId,++timestamp);
			for(int adjNodeId: g.getAdjNode(nodeId)){
				timestamp = dfs(adjNodeId,timestamp);
			}
			g.setF(nodeId, ++timestamp);
		}
		return timestamp;
	}
	
}

class Graph {
	int[][] adj = null;
	int[] d = null;
	int[] f = null;
	
	public Graph() {}
	
	public void init(int nodeMax) {
		adj = new int[nodeMax+1][];
		d = new int[nodeMax+1];
		f = new int[nodeMax+1];
	}
	
	public void addVertice (int nodeId, int[] adjNode, int adjNodeoffset, int adjNodeLen) {
		if(adj == null) throw new IllegalStateException("graph is not initialized.");
		if(adj.length <= nodeId || adjNode == null || adjNode.length < adjNodeoffset+adjNodeLen ) throw new IllegalArgumentException("wrong argument.");
		adj[nodeId] = Arrays.copyOfRange(adjNode, adjNodeoffset, adjNodeLen);
	}
	
	public int[] getAdjNode (int nodeId) {
		if(adj == null) throw new IllegalStateException("graph is not initialized.");
		if(adj.length <= nodeId) throw new IllegalArgumentException("wrong argument.");
		if(adj[nodeId] == null) throw new IllegalStateException("vertice info is not initialized.");
		return adj[nodeId];
	}
	
	public int getD(int nodeId) {
		if(d == null) throw new IllegalStateException("graph is not initialized.");
		if(d.length <= nodeId) throw new IllegalArgumentException("wrong argument.");
		return d[nodeId];
	}

	public int getF(int nodeId) {
		if(f == null) throw new IllegalStateException("graph is not initialized.");
		if(f.length <= nodeId) throw new IllegalArgumentException("wrong argument.");
		return f[nodeId];
	}
	
	public void setD(int nodeId, int timestamp) {
		if(d == null) throw new IllegalStateException("graph is not initialized.");
		if(d.length <= nodeId) throw new IllegalArgumentException("wrong argument.");
		d[nodeId]=timestamp;
	}

	public void setF(int nodeId, int timestamp) {
		if(f == null) throw new IllegalStateException("graph is not initialized.");
		if(f.length <= nodeId) throw new IllegalArgumentException("wrong argument.");
		f[nodeId]=timestamp;
	}
	
}

class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}