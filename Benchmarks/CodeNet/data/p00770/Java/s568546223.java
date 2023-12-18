
import java.io.*;
import java.util.*;
 
public class Main{
	private boolean[] prime;
	
	public void setPrime(int m){
		prime = new boolean[m + 1];
		Arrays.fill(prime, true);
		for(int i = 2; i * i <= m; i++){
			if(prime[i]){
				for(int j = i * 2; j <= m; j += i){
					prime[j] = false;
				}
			}
		}
	}
	int[][] map;
	int[][] dp;
	int[][] maxP;
	
	public void setMap(int m){
		map = new int[m][m];
		int[] DC = {1, 0, -1,0};
		int[] DR = {0,-1,  0,1};
		
		int pr = m / 2;
		int pc = (m - 1) / 2;
		int muki = 0;
		int dc = 1;
		int dr = 0;
		map[pr][pc] = 1;
		for(int i = 2; i <= m * m; i++){
			pr += dr;
			pc += dc;
			map[pr][pc] = i;
			int mm = (muki + 1) % 4;
			int nr = DR[mm];
			int nc = DC[mm];
			if(map[pr + nr][pc + nc] == 0){
				dr = nr;
				dc = nc;
				muki = mm;
			}
		}
	}
	
	public void solve(){
		setPrime(1000000);
		setMap(1005);
		dp = new int[1005][1005];
		maxP = new int[1005][1005];
		while(true){
			int M = nextInt();
			int N = nextInt();
			if(M == 0) break;
			for(int i = 0; i < dp.length; i++){
				Arrays.fill(dp[i], -1);
				Arrays.fill(maxP[i], 0);
			}
			int pr = 0;
			int pc = 0;
			for(int i = 0; i < map.length; i++){
				for(int j = 0; j < map[i].length; j++){
					if(map[i][j] == N){
						pr = i;
						pc = j;
						break;
					}
				}
			}
			recur(pr, pc, M);
			out.println(dp[pr][pc] + " " + maxP[pr][pc]);
		}
	}
	
	public int recur(int r, int c, int M){
		if(map[r][c] > M){
			return 0;
		}
		if(dp[r][c] >= 0){
			return dp[r][c];
		}
		int ans = recur(r + 1, c - 1, M);
		maxP[r][c] = maxP[r + 1][c - 1];
		int a2 = recur(r + 1, c, M);
		if(ans < a2){
			ans = a2;
			maxP[r][c] = maxP[r + 1][c];
		}
		int a3 = recur(r + 1, c + 1, M);
		if(ans < a3){
			ans = a3;
			maxP[r][c] = maxP[r + 1][c + 1];
		}
		if(prime[map[r][c]]){
			ans++;
			if(maxP[r][c] == 0){
				maxP[r][c] = map[r][c];
			}
		}
		return dp[r][c] = ans;
	}
	
	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}