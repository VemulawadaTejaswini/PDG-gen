import java.util.*;
import java.io.*;
public class Main {
	private static IO io = new IO();
	public static void main(String[] args) {
		
		Map<Integer, Integer> ans = new HashMap<>();
		Deque<int[][]> que = new ArrayDeque<>();
		int init[] = {0,1,2,3,4,5,6,7};
		//0??????????????¶??????1??????????????????2??´?????????????????????3?§?????????°
		que.offer(new int[][] {init,{0},{-1},{0}});
		int dx[] = {-4, 1, 4, -1};
		
		while (!que.isEmpty()) {
			int[][] p = que.pollFirst();
			if (ans.containsKey(conv(p[0]))) continue;
			else ans.put(conv(p[0]), p[3][0]);
			//System.out.println(conv(p[0]));
			for (int i=0; i<4; i++) {
				int go = p[1][0] + dx[i];
				if (go==p[2][0] || go<0 || 7<go || (p[1][0]==3 && go==4) || (p[1][0]==4 && go==3)) continue;
				int next[];
				next = p[0].clone();
				swap(next, p[1][0], go);
				que.offer(new int[][] {next, {go}, {p[1][0]}, {p[3][0]+1}});
			}
		}
				
		while (io.hasNext()) {
			int q = 0;
			for (int i=0; i<=7; i++) {
				q += (io.nextInt()+1) * Math.pow(10, 7-i);
			}
			System.out.println(ans.get(q));
		}
	}
	
	private static void swap(int ar[], int a, int b) {
		int tmp = ar[a];
		ar[a] = ar[b];
		ar[b] = tmp;
	}
	
	private static int conv(int ar[]) {
		int ans = 0;
		for (int i=0; i<=7; i++) {
			ans += (ar[7-i]+1)*Math.pow(10, i);
		}
		return ans;
	}

	static class IO extends PrintWriter {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		IO() { this(System.in);}
		IO(InputStream source) { super(System.out); this.in = source;}
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
		boolean hasNext() { skipUnprintable(); return hasNextByte();}
		long nextLong() {
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
		int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
				throw new NumberFormatException();
			}
			return (int) nl;
		}
		public void close() {
			super.close();
			try {
				in.close();
			} catch (IOException ignored) {}
		}
	}
}