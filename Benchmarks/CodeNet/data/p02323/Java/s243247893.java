import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int v = sc.nextInt();
		int e = sc.nextInt();
		
		WDGraph g = new WDGraph(v);
		
		for(int i=0;i<e;i++){
			g.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		int ans = travelingSales(g);
		
		if(ans == Integer.MAX_VALUE/2){
			System.out.println(-1);
		}
		else{
			System.out.println(ans);
		}
	}
	
	static int travelingSales(WDGraph g){
		int n = g.vnum();
		int[][] dp = new int[1<<n][n];
		for(int i=0;i<dp.length;i++){
			Arrays.fill(dp[i],Integer.MAX_VALUE/2);
		}
		dp[(1<<n)-1][0] = 0;
		
		for(int S=(1<<n)-2;S>=0;S--){
			for(int v=0;v<n;v++){
				for(WDGraph.WEdge e:g.elist[v]){
					if(!(((S>>e.to)&1) == 1)){ //Sがe.toを含んでいなければ
						dp[S][v] = Math.min(dp[S][v], dp[S|1<<e.to][e.to] + e.w);
					}
				}
			}
		}
		
		return dp[0][0];
	}
	
}

class WDGraph {
	public WEdgeList[] elist;
	
	public WDGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}
	
	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int from, int to, int w){
		elist[from].add(new WEdge(to,w));
	}
	
	//頂点数を返す
	public int vnum(){
		return elist.length;
	}
	
	public class WEdgeList extends ArrayList<WEdge>{
		private static final long serialVersionUID = -3222721656143220018L;
	}
	public class WEdge{
		public int to;
		public int w;
		
		public WEdge(int to, int w){
			this.to = to;
			this.w = w;
		}
	}

}


class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
