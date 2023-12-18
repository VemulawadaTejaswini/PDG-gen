import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
	public static class Node {
		int n,x,y,d;
		Node l,r;
		public Node(int n, int x, int y) {
			this.n = n;
			this.x = x;
			this.y = y;
			d = -1;
			l = null;
			r = null;
		}

		public void print() {
			if(l != null) l.print();
			System.out.println("("+x+","+y+") d = "+d);
			if(r != null) r.print();
		}
	}

	public static class KdTree {
		static Node root;
		public KdTree(Node[] points) {
			root = createTree(0, points);
		}

		public static Node createTree(int d, Node[] points) {
			if(points.length == 0) return null;
			if(d % 2 == 0) {
				Arrays.sort(points, new Comparator<Node>() {
					public int compare(Node n1, Node n2) {
						return n1.x - n2.x;
					}
				});
			} else {
				Arrays.sort(points, new Comparator<Node>() {
					public int compare(Node n1, Node n2) {
						return n1.y - n2.y;
					}
				});
			}
			Node root = points[points.length/2];
			root.d = d;
			root.l = createTree(d+1, Arrays.copyOfRange(points, 0, points.length/2));
			root.r = createTree(d+1, Arrays.copyOfRange(points, points.length/2+1, points.length));
			return root;
		}

		public static void print() {
			root.print();
		}

		public static ArrayList<Integer> rangeCount(int sx, int tx, int sy, int ty) {
			return count(root, sx, tx, sy, ty);
		}

		public static ArrayList<Integer> count(Node node, int sx, int tx, int sy, int ty) {
			ArrayList<Integer> c = new ArrayList<Integer>();
			if(sx <= node.x && node.x <= tx && sy <= node.y && node.y <= ty) c.add(node.n);
			if(node.d % 2 == 0) {
				if(node.l != null && sx <= node.x) c.addAll(count(node.l, sx, tx, sy, ty));
				if(node.r != null && node.x <= tx) c.addAll(count(node.r, sx, tx, sy, ty));
			} else {
				if(node.l != null && sy <= node.y) c.addAll(count(node.l, sx, tx, sy, ty));
				if(node.r != null && node.y <= ty) c.addAll(count(node.r, sx, tx, sy, ty));
			}
			return c;
		}
	}

	public static void main(String[] args) {
		FS r = new FS();
		int n = r.nextInt();
		Node[] points = new Node[n];
		for(int i=0; i<n; i++) {
			int x = r.nextInt();
			int y = r.nextInt();
			points[i] = new Node(i, x, y);
		}
		KdTree tree = new KdTree(points);
		int q = r.nextInt();
		for(int i=0; i<q; i++) {
			int sx = r.nextInt();
			int tx = r.nextInt();
			int sy = r.nextInt();
			int ty = r.nextInt();
			ArrayList<Integer> list = tree.rangeCount(sx, tx, sy, ty);
			Collections.sort(list);
			for(int j=0; j<list.size(); j++) {
				System.out.println(list.get(j));
			}
			System.out.println();
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