
import java.io.*;
import java.util.*;

public class AOJ1176 {

	int H;
	int W;
	int S;
	int[][] map;
	int[][] sum;
	Pair[][][][] dp;
	
	public void solve() {
		while (true) {
			H = nextInt();
			W = nextInt();
			S = nextInt();
			if (H == 0) break;
			
			map = new int[H][W];
			sum = new int[H + 1][W + 1];
			dp = new Pair[H][H + 1][W][W + 1];
			for(int r = 0; r < H; r++){
				for(int c = 0; c < W; c++){
					map[r][c] = nextInt();
					sum[r + 1][c + 1] = sum[r + 1][c] + sum[r][c + 1] - sum[r][c] + map[r][c];
				}
			}
			out.println(recur(0, H, 0, W));
		}
	}
	public Pair recur(int r1, int r2, int c1, int c2){
		int s = sum[r2][c2] - sum[r2][c1] - sum[r1][c2] + sum[r1][c1];
		if(sum[H][W] - s > S) return null;
		if(dp[r1][r2][c1][c2] != null) return dp[r1][r2][c1][c2];
		
		//System.err.printf("%d %d %d %d\n", r1, r2, c1, c2);
		Pair ans = new Pair(1, S - (sum[H][W] - s));
		for(int r = r1 + 1; r < r2; r++){
			Pair a = recur(r1, r, c1, c2);
			Pair b = recur(r, r2, c1, c2);
			if(a != null && b != null){
				ans = ans.max(a.add(b));
			}
		}
		

		for(int c = c1 + 1; c < c2; c++){
			Pair a = recur(r1, r2, c1, c);
			Pair b = recur(r1, r2, c, c2);
			if(a != null && b != null){
				ans = ans.max(a.add(b));
			}
		}
		//System.err.println("---");
		return dp[r1][r2][c1][c2] = ans;
	}
	
	class Pair implements Comparable<Pair>{
		final int group;
		final int yojo;
		public Pair(int group, int yojo){
			this.group = group;
			this.yojo = yojo;
		}
		
		public Pair max(Pair p){
			if(this.compareTo(p) <= 0){
				return this;
			}else{
				return p;
			}
		}
		
		public int compareTo(Pair p){
			if(group == p.group){
				return Integer.compare(p.yojo, yojo);
			}else{
				return Integer.compare(p.group, group);
			}
		}
		public Pair add(Pair p){
			return new Pair(group + p.group, Math.min(yojo, p.yojo));
		}
		public String toString(){
			return group + " " + yojo;
		}
	}
	

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new AOJ1176().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while (!isAlNum(c = read())) {
		}
		StringBuilder build = new StringBuilder();
		build.append((char) c);
		while (isAlNum(c = read())) {
			build.append((char) c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if (bufferLength < 0)
			throw new RuntimeException();
		if (bufferIndex >= bufferLength) {
			try {
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufferLength <= 0)
				return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}