
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Stream;
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static final long INF = Long.MAX_VALUE / 2;
	int len;
	int[][] up;
	int[] tin;
	int[] tout;
	int time;
	private static void solve() {
		PrintWriter pr = new PrintWriter(System.out);
		int n = ni();
		List<Integer>[] tree = Stream.generate(ArrayList::new).limit(n).toArray(List[]::new);
		for(int i=0;i<n;i++){
			int k = ni();
			for(int j=0;j<k;j++){
				int t = ni();
				tree[i].add(t);
				tree[t].add(i);
			}
		}
		Main t = new Main(tree, 0);
		int q = ni();
		while(q-->0){
			pr.println(t.lca(ni(),ni()));
		}
		pr.flush();
	}
	void dfs(List<Integer>[] tree, int u, int p) {
		tin[u] = time++;
		up[0][u] = p;
		for (int i = 1; i < len; i++)
			up[i][u] = up[i - 1][up[i - 1][u]];
		for (int v : tree[u])
			if (v != p)
				dfs(tree, v, u);
		tout[u] = time++;
	}

	public Main(List<Integer>[] tree, int root) {
		int n = tree.length;
		len = 1;
		while ((1 << len) <= n) ++len;
		up = new int[len][n];
		tin = new int[n];
		tout = new int[n];
		dfs(tree, root, root);
	}

	boolean isParent(int parent, int child) {
		return tin[parent] <= tin[child] && tout[child] <= tout[parent];
	}

	public int lca(int a, int b) {
		if (isParent(a, b))
			return a;
		if (isParent(b, a))
			return b;
		for (int i = len - 1; i >= 0; i--)
			if (!isParent(up[i][a], b))
				a = up[i][a];
		return up[0][a];
	}
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}

	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}

	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }

	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}

	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}

	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}