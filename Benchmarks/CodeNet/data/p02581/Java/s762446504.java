import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		LinkedList<Integer> A = new LinkedList<>();
		for (int i = 0, len = 3*N; i < len; i++) {
			A.addLast( scanner.nextInt()-1 );
		}
		
		int[][] DP = new int[N][N];
		int[]  MAX = new int[N];
		
		for (int x = 0; x < N; x++) {
			for (int y = x; y < N; y++) DP[x][y] = Integer.MIN_VALUE;
		}
		Arrays.fill(MAX,Integer.MIN_VALUE);
		
		Collections.sort(A.subList(0, 2));
		int first = A.poll(), second = A.poll();
		DP[first][second] = 0;
		MAX[first] = MAX[second] = 0;
		
		int result = 0, max = 0;
		for (int n = 0; n < N-1; n++) {
			//使いやすいように昇順でソート
			Collections.sort(A.subList(0, 3));
			
			int p = A.poll();
			int q = A.poll();
			int r = A.poll();
			
			//ソートしたので左端と右端が等しければ3つの値はすべて等しい
			if (p == r) {
				result++;
				continue;
			}
			
			HashMap<int[], Integer> T = new HashMap<>();
			
			if (p == q){
				for (int k = 0; k < p; k++) {
					T.put( new int[]{k, r}, DP[k][p]+1);
				}
				for (int k = p; k < r; k++) {
					T.put( new int[]{k, r}, DP[p][k]+1);
				}
				for (int k = r; k < N; k++) {
					T.put( new int[]{r, k}, DP[p][k]+1);
				}
			} else if ( q == r ) {
				for (int k = 0; k < p; k++) {
					T.put( new int[]{k, p}, DP[k][q]+1);
				}
				for (int k = p; k < q; k++) {
					T.put( new int[]{p, k}, DP[k][q]+1);
				}
				for (int k = q; k < N; k++) {
					T.put( new int[]{p, k}, DP[q][k]+1);
				}
			}
			
			add(T, new int[]{q, r}, Math.max(DP[p][p]+1, max));
			add(T, new int[]{p, r}, Math.max(DP[q][q]+1, max));
			add(T, new int[]{p, q}, Math.max(DP[r][r]+1, max));
			
			for (int k = 0; k < p; k++) {
				add(T, new int[]{k, p}, MAX[k]);
			}
			for (int k = p; k < N; k++) {
				add(T, new int[]{p, k}, MAX[k]);
			}
			for (int k = 0; k < q; k++) {
				add(T, new int[]{k, q}, MAX[k]);
			}
			for (int k = q; k < N; k++) {
				add(T, new int[]{q, k}, MAX[k]);
			}
			for (int k = 0; k < r; k++) {
				add(T, new int[]{k, r}, MAX[k]);
			}
			for (int k = r; k < N; k++) {
				add(T, new int[]{r, k}, MAX[k]);
			}
			
			for (int[] key : T.keySet()) {
				int x = key[0];
				int y = key[1];
				int v = T.get(key);
				
				DP[x][y] = Math.max(DP[x][y], v);
				MAX[x] = Math.max(MAX[x], v);
				MAX[y] = Math.max(MAX[y], v);
				max = Math.max(max, v);
			}
		}
		
		int last = A.poll();
		
		if ( DP[last][last] + 1 > max) {
			System.out.println(result + DP[last][last] + 1);
		} else {
			System.out.println(result + max);
		}
	}
	
	void add(HashMap<int[], Integer> HM, int[] key, int v){
		if ( HM.containsKey(key) ) {
			if (v < HM.get(key)) return;
		}
		HM.put(key, v);
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
