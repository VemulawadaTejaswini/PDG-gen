import java.util.*;
import java.io.*;
import java.math.*;

import javax.xml.crypto.Data;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	static int[][] mm;
	static char[][] map;
	static int[] vy = new int[] {1,0,-1,0};
	static int[] vx = new int[] {0,1,0,-1};
	static int INF = 2 << 29;
	static ArrayDeque<Data> stack = new ArrayDeque<Data>();
	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		map = new char[h][w];
		int sx = 0;
		int sy = 0;
		int[] gx = new int[n];
		int[] gy = new int[n];
		for(int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
			for(int j = 0; j < w; j++) {
				if(map[i][j] == 'S') {
					sx = j;
					sy = i;
				}
				else if(map[i][j] != '.' && map[i][j] != 'X') {
					gx[map[i][j] - '0' - 1] = j;
					gy[map[i][j] - '0' - 1] = i;
				}
			}
		}
		int nx = sx;
		int ny = sy;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			mm = new int[h][w];
			int tgx = gx[i];
			int tgy = gy[i];
			sum += solv(ny,nx,tgy,tgx);

			nx = tgx;
			ny = tgy;
		}
		out.println(sum);
		out.flush();
	}
	static long solv(int a, int b, int c, int d) {
		stack.clear();
		for(int i = 0; i < mm.length; i++) {
			for(int j = 0; j < mm[i].length; j++) {
				mm[i][j] = INF;
			}
		}
		stack.addLast(new Data(a,b,0));
		while(!stack.isEmpty()) {
			Data tmp = stack.pollFirst();
			dfs(tmp.a, tmp.b, tmp.c);
		}
		return mm[c][d];
	}
	static void dfs(int a, int b, int c) {

		mm[a][b] = c;
		for(int i = 0; i < 4; i++) {
			if(!rCheck(vy[i] + a,vx[i] + b) || map[vy[i] + a][vx[i] + b] == 'X' || mm[vy[i] + a][vx[i] + b] <= c+1) continue;
			stack.addLast(new Data(vy[i] + a, vx[i] + b, c+1));
		}
	}
	static boolean rCheck(int a, int b) {
		if(a < 0 || a >= mm.length || b < 0 || b >= mm[a].length) return false;
		return true;
	}
	
	static class Data {
		int a;
		int b;
		int c;
		Data(int d, int e, int f) {
			a = d;
			b = e;
			c = f;
		}
		
	}
}

//-----------------Template------------------//
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}


}