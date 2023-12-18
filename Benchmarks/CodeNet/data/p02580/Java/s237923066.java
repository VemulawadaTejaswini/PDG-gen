import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	class M {
		int h,w;
		
		public M(int h, int w) {
			this.h = h;
			this.w = w;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			M m = (M) o;
			return h == m.h &&
					w == m.w;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(h, w);
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		scanner.nextInt();
		scanner.nextInt();
		int M = scanner.nextInt();
		
		HashSet<M> Ms = new HashSet<>();
		HashMap<Integer, Integer> hCounter = new HashMap<>();
		HashMap<Integer, Integer> wCounter = new HashMap<>();
		HashSet<Integer> hMaxes = new HashSet<>();
		HashSet<Integer> wMaxes = new HashSet<>();
		
		int hNum, wNum;
		int hMax = 0, wMax = 0;
		for (int i = 0; i < M; i++) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			
			Ms.add( new M(h, w) );
			
			hNum = hCounter.getOrDefault(h,0) + 1;
			wNum = wCounter.getOrDefault(w,0) + 1;
			
			if (hMax < hNum) {
				hMaxes.clear();
				hMaxes.add(h);
				hMax = hNum;
			} else if (hMax == hNum) {
				hMaxes.add(h);
			}
			
			if (wMax < wNum) {
				wMaxes.clear();
				wMaxes.add(w);
				wMax = wNum;
			} else if (wMax == wNum) {
				wMaxes.add(w);
			}
			
			hCounter.put(h, hNum);
			wCounter.put(w, wNum);
		}
		
		for (int h : hMaxes) {
			
			for (int w : wMaxes) {
				if ( ! Ms.contains( new M(h,w) ) ){
					System.out.println( hMax + wMax );
					return;
				}
			}
			
		}
		
		System.out.println( hMax + wMax - 1);
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
