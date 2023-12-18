import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	class Node implements Comparable<Node>{
		int left, right;
		
		public Node(int left, int right) {
			this.left  = left;
			this.right = right;
		}
		
		@Override
		public int compareTo(Node o) {
			return right - o.right;
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		
		TreeSet<Node>             nodeSet  = new TreeSet<>();
		TreeMap<Integer, Integer> costMap  = new TreeMap<>();
		
		for (int i = 1; i <= W; i++) {
			nodeSet.add(new Node(i, i));
		}
		costMap.put(0, W);
		
		Node A = new Node(0,0);
		Node B = new Node(0,0);
		for (int h = 1; h <= H; h++) {
			A.right = scanner.nextInt();
			B.right = scanner.nextInt() + 1;
			
			SortedSet<Node> sub = nodeSet.subSet(A, B);
			
			if (!sub.isEmpty()) {
				
				for (Node node : sub){
					int cost = node.right - node.left;
					int num  = costMap.get(cost);
					if (num != 1) {
						costMap.put(cost, num - 1);
					} else {
						costMap.remove(cost);
					}
				}
				
				if (B.right != W+1) {
					Node node = sub.last();
					node.right = B.right;
					int cost = node.right - node.left;
					costMap.put(cost, costMap.getOrDefault(node,0)+1);
					nodeSet.add(node);
				}
				
				sub.clear();
			}
			if (costMap.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(costMap.firstKey() + h);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
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
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
