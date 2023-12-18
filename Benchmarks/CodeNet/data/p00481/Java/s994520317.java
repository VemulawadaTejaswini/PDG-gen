import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static final int[] di = {1,0,-1,0};
	public static final int[] dj = {0,1,0,-1};
	public static final int INF = 1<<29;
	public static void main(String[] args) {
		IO io = new IO();
		int h = io.nextInt();
		int w = io.nextInt();
		int n = io.nextInt();
		char[][] map = new char[h][];
		for(int i=0;i<h;i++) {
			map[i] = io.next().toCharArray();
		}
		int pi=0,pj=0;
		SEARCHS: for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if (map[i][j] == 'S') {
					pi = i;
					pj = j;
					break SEARCHS;
				}
			}
		}
		int ans = 0;
		for(int k=0;k<n;k++) {
			Queue<Pair> q = new ArrayDeque<Pair>();
			int[][] dist = new int[h][w];
			for(int i=0;i<h;i++) {
				Arrays.fill(dist[i], INF);
			}
			dist[pi][pj] = 0;
			q.offer(new Pair(pi,pj));
			while(!q.isEmpty()) {
				Pair p = q.poll();
				//System.out.println(p);
				if (map[p.i][p.j] == (char) ('1' + k)) {
					ans += dist[p.i][p.j];
					pi = p.i;
					pj = p.j;
					break;
				}
				for(int i=0;i<4;i++) {
					int ni = p.i + di[i];
					int nj = p.j + dj[i];
					if (ni < 0 || ni >= h || nj < 0 || nj >= w || map[ni][nj] == 'X') {
						continue;
					}
					if (dist[ni][nj] > dist[p.i][p.j] + 1) {
						dist[ni][nj] = dist[p.i][p.j] + 1;
						q.offer(new Pair(ni,nj));
					}
				}
			}
		}
		System.out.println(ans);
	}
	static class Pair {
		int i,j;
		public Pair(int i,int j) {
			this.i = i;
			this.j = j;
		}
		public String toString() {
			return "(" + i + "," + j + ")";
		}
	}
}
class IO {
	BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder out = new StringBuilder();
	int index = 0;
	String bfl = null;
	String[] bf = new String[0];
	private boolean read() {
		try {
			bfl = bi.readLine();
			if (bfl == null) {
				return false;
			}
			bf = bfl.split("\\s");
			index = 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean hasNext() { return index < bf.length ? true : read(); }
	public boolean hasNextLine() { return read(); }
	public String next() { return hasNext() ? bf[index++] : null; }
	public String nextLine() { if (hasNextLine()) {index = bf.length; return bfl; }else return null; }
	public int nextInt() { return Integer.parseInt(next()); }
	public long nextLong() { return Long.parseLong(next()); }
	public double nextDouble() { return Double.parseDouble(next()); };
	public char nextChar() { return next().charAt(0); }
	public void println(long x) { out.append(x); out.append("\n"); }
	public void println(double x) { out.append(x); out.append("\n"); }
	public void println(String s) { out.append(s); out.append("\n"); }
	public void println() { out.append("\n"); }
	public void print(long x) { out.append(x); }
	public void print(double x) { out.append(x); }
	public void print(String s) { out.append(s); }
	public void print(char c) {out.append(c);}
	public void flush() {System.out.print(out); out = new StringBuilder(); }
	public int[] arrayInt(int n) {
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = nextInt();
		}
		return a;
	}
	public long[] arrayLong(int n) {
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = nextLong();
		}
		return a;
	}
	public double[] arrayDouble(int n) {
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i] = nextDouble();
		}
		return a;
	}
}