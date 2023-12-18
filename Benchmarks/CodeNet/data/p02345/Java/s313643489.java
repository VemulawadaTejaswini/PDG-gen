import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class Main {
	public static class SegmentTree {
		int[] tree;
		public SegmentTree(int n) {
			int d = (int)Math.ceil(Math.log((double)n) / Math.log(2.0));
			tree = new int[(int)Math.pow(2, d+1)];
			Arrays.fill(tree, Integer.MAX_VALUE);
		}

		public void update(int i, int x) {
			i += tree.length/2-1;
			tree[i] = x;
			while(i > 0) {
				i = (i - 1) / 2;
				tree[i] = Math.min(tree[i*2+1], tree[i*2+2]);
			}
			// print();
		}

		// usage
		// query(a, b, 0, 0, seg.tree.length/2)
		public int query(int a, int b, int k, int l, int r) {
			// System.out.println(a+" "+b+" "+k+" "+l+" "+r);
			if(r <= a || b < l) return Integer.MAX_VALUE;
			if(a <= l && r-1 <= b) return tree[k];
			else {
				int vl = query(a, b, k*2+1, l, (l+r)/2);
				int vr = query(a, b, k*2+2, (l+r)/2, r);
				return Math.min(vl, vr);
			}
		}

		public void print() {
			for(int i=0; i<tree.length; i++) {
				System.out.print(tree[i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		FS r = new FS();
		int n = r.nextInt();
		int q = r.nextInt();
		SegmentTree seg = new SegmentTree(n);
		for(int i=0; i<q; i++) {
			int c = r.nextInt();
			int x = r.nextInt();
			int y = r.nextInt();
			if(c == 0) {
				seg.update(x, y);
			} else {
				System.out.println(seg.query(x, y, 0, 0, seg.tree.length/2));
			}
		}
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