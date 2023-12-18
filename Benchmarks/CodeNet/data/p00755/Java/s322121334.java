
import java.io.*;
import java.util.*;

public class Main {

	int H;
	int W;
	int C;
	int[][] map;
	int[] DR = {1, 0, -1, 0};
	int[] DC = {0, 1,  0, -1};

	public void solve() {
		while (true) {
			H = nextInt();
			W = nextInt();
			C = nextInt();
			if (H == 0) break;
			
			map = new int[H][W];
			for(int r = 0; r < H; r++){
				for(int c = 0; c < W; c++){
					map[r][c] = nextInt();
				}
			}
			out.println(recur(map, 0));
		}
	}
	
	public int recur(int[][] map, int cnt){
		if(cnt == 5){
			return countrecur(map, 0, 0);
		}else{
			int ans = 0;
			int cc = map[0][0];
			int[][] nmap = new int[H][W];
			for(int i = 1; i <= 6; i++){
				if(cc == i) continue;
				for(int r = 0; r < H; r++){
					for(int c = 0; c < W; c++){
						nmap[r][c] = map[r][c];
					}
				}
				flip(nmap, 0, 0, cc, i);
				ans = Math.max(ans, recur(nmap, cnt + 1));
			}
			return ans;
		}
	}
	
	public void flip(int[][] map, int r, int c, int color, int nc){
		if(r < 0 || r >= H || c < 0 || c >= W || map[r][c] != color){
			return;
		}
		map[r][c] = nc;
		for(int i = 0; i < 4; i++){
			flip(map, r + DR[i], c + DC[i], color, nc);
		}
	}
	
	
	public int countrecur(int[][] map, int r, int c){
		if(r < 0 || r >= H || c < 0 || c >= W || map[r][c] != C){
			return 0;
		}else{
			int ans = 1;
			map[r][c] = 0;
			for(int i = 0; i < 4; i++){
				ans += countrecur(map, r + DR[i], c + DC[i]);
			}
			return ans;
		}
	}

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
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