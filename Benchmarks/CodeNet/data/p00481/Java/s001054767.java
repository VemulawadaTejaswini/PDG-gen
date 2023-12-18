import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		
		int ys = io.nextInt();
		int xs = io.nextInt();
		int n = io.nextInt();
		List<Character> numcheck = new ArrayList<Character>();
		for (int i=1; i<=n; i++) numcheck.add(String.valueOf(i).charAt(0));
		List<int[]> l = new ArrayList<int[]>();//?????????????????? ?????????????????????x??§?¨????y??§?¨???????
		char map[][] = new char[xs][ys];
		int dis[][] = new int[xs][ys];//?????????????????§?§?????????????????????¢ ??????????????????????????????????????????
		Deque<int[]> que = new ArrayDeque<int[]>();
		for (int j=0; j<ys; j++) {
			for (int i=0; i<xs; i++) {
				map[i][j] = io.nextChar();
				dis[i][j] = -1;
				if (map[i][j]=='S') {
					que.offer(new int[] {i,j});
					map[i][j] = '.';
					dis[i][j] = 0;
				} else if (numcheck.contains(map[i][j])) {
					l.add(new int[] {Character.getNumericValue(map[i][j]), i, j});
					map[i][j] = '.';
				}
			}
		}
		Collections.sort(l, new Comparator<int[]>() {
			public int compare (int[] a, int[] b) {
				return a[0]-b[0];// ?¬¬1????????§???????????????
			}
		});
		
		int dx[] = {0, 1, 0, -1};
		int dy[] = {1, 0, -1, 0};
		
		int goal[] = {l.get(0)[1], l.get(0)[2]};
		l.remove(0);
		int ans = 0;
		while (!que.isEmpty()) {
			int poll[] = que.pollFirst();
			int x = poll[0];
			int y = poll[1];
			
			if (x==goal[0] && y==goal[1]) {//??´??????????????????
				ans += dis[x][y];
				que.clear();
				if (!l.isEmpty()) {//???????????????????????£????????´???
					goal[0] = l.get(0)[1];
					goal[1] = l.get(0)[2];
					l.remove(0);
					for (int j=0; j<xs; j++) Arrays.fill(dis[j], -1);
					dis[x][y] = 0;
					que.offer(new int[] {x, y});
				}
			}
			
			for (int i=0; i<4; i++) {
				// ?????????????????????????????????????????§?????????????£???§???????????´???????????????
				if (0<=x+dx[i] && x+dx[i]<xs && 0<=y+dy[i] && y+dy[i]<ys
						&& dis[x+dx[i]][y+dy[i]]==-1
						&& map[x+dx[i]][y+dy[i]]=='.') {
					
					dis[x+dx[i]][y+dy[i]] = dis[x][y] + 1;
					que.offer(new int[] {x+dx[i], y+dy[i]});
				}
			}
		}
		
		System.out.println(ans);
		
	}

	static class IO extends PrintWriter {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public IO() { this(System.in);}
		public IO(InputStream source) { super(System.out); this.in = source;}
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
		private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
		private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
		private void skipNewLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++;}
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public boolean hasNextLine() { skipNewLine(); return hasNextByte();}
		public String next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public char[] nextCharArray(int len) {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			char[] s = new char[len];
			int i = 0;
			int b = readByte();
			while(isPrintableChar(b)) {
				if (i == len) {
					throw new InputMismatchException();
				}
				s[i++] = (char) b;
				b = readByte();
			}
			return s;
		}
		public String nextLine() {
			if (!hasNextLine()) {
				throw new NoSuchElementException();
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(!isNewLine(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public long nextLong() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
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
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
				throw new NumberFormatException();
			}
			return (int) nl;
		}
		public char nextChar() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return (char) readByte();
		}
		public double nextDouble() { return Double.parseDouble(next());}
		public int[] arrayInt(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
		public long[] arrayLong(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
		public double[] arrayDouble(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
		public void arrayInt(int[]... a) {for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
		public int[][] matrixInt(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = arrayInt(m); return a;}
		public char[][] charMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
		public void close() {
			super.close();
			try {
				in.close();
			} catch (IOException e) {}
		}
	}
}