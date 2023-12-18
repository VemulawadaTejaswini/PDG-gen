import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[] A = new int[N], B = new int[N], C = new int[N];
		int[] D = new int[M], E = new int[M], F = new int[M];
		
		//同じ座標を排除するためのTreeMap
		TreeMap<Integer, Integer> X = new TreeMap<>();
		TreeMap<Integer, Integer> Y = new TreeMap<>();
		
		IntStream.range(0, N).forEach(i -> {
			X.put( (A[i] = scanner.nextInt()), null );
			X.put( (B[i] = scanner.nextInt()), null );
			Y.put( (C[i] = scanner.nextInt()), null );
		});
		IntStream.range(0, M).forEach(i -> {
			X.put( (D[i] = scanner.nextInt()), null );
			Y.put( (E[i] = scanner.nextInt()), null );
			Y.put( (F[i] = scanner.nextInt()), null );
		});
		
		//初期位置用
		X.put(0, null);
		Y.put(0, null);
		
		//INFを検出するために最大値最小値を加えておく
		X.put(Integer.MIN_VALUE, null);
		X.put(Integer.MAX_VALUE, null);
		Y.put(Integer.MIN_VALUE, null);
		Y.put(Integer.MAX_VALUE, null);
		
		//座標圧縮
		long[] toX = new long[X.size()];
		long[] toY = new long[Y.size()];
		{
			int i =0;
			for (int key : X.keySet()) {
				toX[i] = key;
				X.put(key, i);
				i++;
			}
			i=0;
			for (int key : Y.keySet()) {
				toY[i] = key;
				Y.put(key, i);
				i++;
			}
		}
		
		//x~x+1の間に壁があるか、どうか0なら無い、1以上なら有る
		int[][] hLines = new int[X.size()][Y.size()];
		//y~y+1の間に壁があるか、どうか0なら無い、1以上なら有る
		int[][] vLines = new int[X.size()][Y.size()];
		
		IntStream.range(0, N).forEach( i -> {
			int AX = X.get(A[i]);
			int BX = X.get(B[i]);
			int CY = Y.get(C[i]);
			
			hLines[AX][CY] += 1;
			hLines[BX][CY] -= 1;
		});
		
		IntStream.range(0, M).forEach( i ->{
			int DX = X.get(D[i]);
			int EY = Y.get(E[i]);
			int FY = Y.get(F[i]);
			
			vLines[DX][EY] += 1;
			vLines[DX][FY] -= 1;
		});
		
		IntStream.range(0, hLines[0].length).forEach( y ->
			IntStream.range(0, hLines.length-1).forEach( x ->
				hLines[x+1][y] += hLines[x][y])
		);
		
		IntStream.range(0, vLines.length).forEach( x->
			IntStream.range(0, vLines[0].length-1).forEach( y->
				vLines[x][y+1] += vLines[x][y])
		);
		
		Queue<Integer> queue = new LinkedList<>();
		boolean[][] isSearched = new boolean[X.size()][Y.size()];
		queue.add( X.get(0)+Y.get(0)*10000 );
		
		long Ans = 0L;
		while ( !queue.isEmpty() ) {
			int node = queue.poll();
			
			int x = node % 10000;
			int y = node / 10000;
			
			if ( isSearched[x][y] ) continue;
			
			if ( (x == 0 || x+1 == toX.length-1) || ( y == 0 || y+1 == toY.length-1) ){
				System.out.println("INF");
				return;
			}
			
			Ans += (toX[x+1]-toX[x]) * (toY[y+1]-toY[y]);
			
			//上に移動
			if ( hLines[x][y+1] == 0 ) {
				queue.add(x+(y+1)*10000);
			}
			//下に移動
			if ( hLines[x][y] == 0 ) {
				queue.add(x+(y-1)*10000);
			}
			//左に移動
			if ( vLines[x][y] == 0 ) {
				queue.add(x-1+y*10000);
			}
			//右に移動
			if ( vLines[x+1][y] == 0 ) {
				queue.add(x+1+y*10000);
			}
			
			isSearched[x][y] = true;
		}
		
		System.out.println(Ans);
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
