import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		while(true) {
			int n = io.nextInt();
			int m = io.nextInt();
			if (n == 0) {
				break;
			}
			UnionFind p = new UnionFind(n);
			for(int i=0;i<m;i++) {
				char c = io.next().charAt(0);
				if (c == '!') {
					int a = io.nextInt()-1;
					int b = io.nextInt()-1;
					int w = io.nextInt();
					p.union(a, b, w);
				}else{
					int a = io.nextInt()-1;
					int b = io.nextInt()-1;
					if (!p.isConnected(a, b)) {
						io.println("UNKNOWN");
					}else{
						int root = p.root(a);
						long diff = p.data[root].get(b) - p.data[root].get(a);
						io.println(diff);
					}
				}
			}
		}
		io.flush();
	}

}

class UnionFind {
	int[] root;
	HashMap<Integer,Long>[] data;

	@SuppressWarnings("unchecked")
	public UnionFind(int size) {
		root = new int[size];
		Arrays.fill(root, -1);
		data = new HashMap[size];
		for(int i=0;i<size;i++) {
			data[i] = new HashMap<Integer, Long>();
			data[i].put(i, 0L);
		}
	}
	public void union(int a_,int b_,int w) {
		int a = root(a_);
		int b = root(b_);
		if (a!=b) {
			if (root[b] < root[a]) {
				int tmp = b;
				b = a;
				a = tmp;
				w *= -1;
				tmp = b_;
				b_ = a_;
				a_ = tmp;
			}
			root[a] += root[b];
			root[b] = a;
			long w2 = w + data[a].get(a_);
			Set<Entry<Integer, Long>> entrySet = data[b].entrySet();
			for(Entry<Integer, Long> entry: entrySet) {
				data[a].put(entry.getKey(), entry.getValue() + w2);
			}
			data[b] = null;
//			System.out.println("----");
//			for(int i=0;i<data.length;i++) {
//				System.out.println(data[i]);
//			}
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	public int root(int x) {
		return root[x] < 0 ? x : (root[x] = root(root[x]));
	}
	public int size(int x) {
		return -root[root(x)];
	}
	public String toString() {
		return Arrays.toString(root);
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
	public String nextLine() { return hasNextLine() ? bfl : null; }
	public int nextInt() { return Integer.parseInt(next()); }
	public long nextLong() { return Long.parseLong(next()); }
	public double nextDouble() { return Double.parseDouble(next()); };
	public void println(long x) { out.append(x); out.append("\n"); }
	public void println(double x) { out.append(x); out.append("\n"); }
	public void println(String s) { out.append(s); out.append("\n"); }
	public void print(long x) { out.append(x); }
	public void print(double x) { out.append(x); }
	public void print(String s) { out.append(s); }
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