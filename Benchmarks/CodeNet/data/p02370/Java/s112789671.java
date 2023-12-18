import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	static int[] diag;
	static ArrayList<ArrayList<Integer>> vector = new ArrayList<ArrayList<Integer>>();
	public static void topological(int v) {
		Deque<Integer> q = new ArrayDeque<Integer>();
		for(int i=0; i<v; i++) {
			if(diag[i] == 0) {
				q.addLast(i);
			}
		}

		while(!q.isEmpty()) {
			int n = q.removeFirst();
			System.out.println(n);
			ArrayList<Integer> lst = vector.get(n);
			for(int i=0; i<lst.size(); i++) {
				int k = lst.get(i);
				diag[k]--;
				if(diag[k] == 0) q.addLast(k);
			}
		}
	}

	public static void main(String[] args) {
		FS r = new FS();
		int v = r.nextInt();
		int e = r.nextInt();
		diag = new int[v];
		for(int i=0; i<v; i++) {
			vector.add(new ArrayList<Integer>());
		}
		for(int i=0; i<e; i++) {
			int s = r.nextInt();
			int t = r.nextInt();
			vector.get(s).add(t);
			diag[t]++;
		}
		topological(v);
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}