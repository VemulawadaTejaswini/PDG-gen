import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static final int X = 10000;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		int[][] DP = new int[N][N];
		for (int x = 0; x < N; x++) {
			Arrays.fill(DP[x], x, N, Integer.MIN_VALUE);
		}
		
		int[]  MAX = new int[N];
		Arrays.fill(MAX,Integer.MIN_VALUE);
		
		int S = scanner.nextInt()-1;
		int T = scanner.nextInt()-1;
		if (S < T) {
			DP[S][T] = 0;
		} else {
			DP[T][S] = 0;
		}
		MAX[S] = MAX[T] = 0;
		
		int result = 0, max = 0;
		int[] A = new int[3];
		for (int n = 0; n < N-1; n++) {
			A[0] = scanner.nextInt()-1;
			A[1] = scanner.nextInt()-1;
			A[2] = scanner.nextInt()-1;
			
			//使いやすいように昇順でソート
			Arrays.sort(A);
			
			//ソートしたので左端と右端が等しければ3つの値はすべて等しい
			if (A[0] == A[2]) {
				result++;
				continue;
			}
			
			HashMap<Integer, Integer> tmp = new HashMap<>();
			
			if (A[0] == A[1]){
				for (int k = 0; k < A[0]; k++) {
					tmp.put( k*X+A[2], DP[k][A[0]]+1);
				}
				for (int k = A[0]; k < A[2]; k++) {
					tmp.put( k*X+A[2], DP[A[0]][k]+1);
				}
				for (int k = A[2]; k < N; k++) {
					tmp.put( A[2]*X+k, DP[A[0]][k]+1);
				}
			} else if ( A[1] == A[2] ) {
				for (int k = 0; k < A[0]; k++) {
					tmp.put( k*X+A[0], DP[k][A[1]]+1);
				}
				for (int k = A[0]; k < A[1]; k++) {
					tmp.put( A[0]*X+k, DP[k][A[1]]+1);
				}
				for (int k = A[1]; k < N; k++) {
					tmp.put( A[0]*X+k, DP[A[1]][k]+1);
				}
			}
			
			put(tmp,A[1]*X+A[2], Math.max(DP[A[0]][A[0]]+1, max));
			put(tmp,A[0]*X+A[2], Math.max(DP[A[1]][A[1]]+1, max));
			put(tmp,A[0]*X+A[1], Math.max(DP[A[2]][A[2]]+1, max));
			
			for (int i = 0; i < 3; i++) {
				for (int k = 0; k < A[i]; k++) {
					put(tmp,k*X+A[i], MAX[k]);
				}
				for (int k = A[i]; k < N; k++) {
					put(tmp,A[i]*X+k, MAX[k]);
				}
			}
			
			for (int key : tmp.keySet()) {
				int x = key/X;
				int y = key%X;
				int v = tmp.get(key);
				
				DP[x][y] = Math.max(DP[x][y], v);
				MAX[x]   = Math.max(MAX[x], v);
				MAX[y]   = Math.max(MAX[y], v);
				max = Math.max(max, v);
			}
		}
		
		int last = scanner.nextInt()-1;
		
		if ( DP[last][last] + 1 > max) {
			System.out.println(result + DP[last][last] + 1);
		} else {
			System.out.println(result + max);
		}
	}
	
	void put(HashMap<Integer, Integer> HM, int key, int v){
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
