
import java.io.*;
import java.util.*;
 
public class Main{
	class Country{
		int idx;
		int[] c;
		int[] sum;
		int cur;
		public Country(int idx, int m){
			this.idx = idx;
			c = new int[m];
			sum = new int[m + 1];
			cur = m;
		}
		public int cur(){
			return sum[cur];
		}
		public int next(){
			if(cur == 0){
				return -1;
			}
			
			return sum[cur - 1];
		}
	}
	
	int N;
	int D;
	Country[] cou;
	public void solve(){
		while(true){
			N = nextInt();
			D = nextInt();
			if(N == 0 && D == 0) break;
			cou = new Country[N];
			int sum = 0;
			for(int i = 0; i < N; i++){
				int M = nextInt();
				cou[i] = new Country(i, M);
				sum += M;
				for(int j = 0; j < M; j++){
					int C = nextInt();
					cou[i].c[j] = C;
					cou[i].sum[j + 1] = cou[i].sum[j] + cou[i].c[j];
				}
			}
			boolean flg = true;
			for(int i = 0; i < sum; i++){
				Country max = max();
				Country min = min();
				if(max.cur() - min.cur() > D){
					flg = false;
					break;
				}
				Country next = nextmax();
				next.cur--;
				if(next.cur == -1){
					throw new RuntimeException();
				}
			}
			if(flg){
				out.println("Yes");
			}else{
				out.println("No");
			}
			
			
		}
	}
	
	public Country max(){
		int cur = cou[0].cur();
		int idx = 0;
		for(int i = 1; i < N; i++){
			if(cur < cou[i].cur()){
				idx = i;
				cur = cou[i].cur();
			}
		}
		return cou[idx];
	}
	
	public Country min(){
		int cur = cou[0].cur();
		int idx = 0;
		for(int i = 1; i < N; i++){
			if(cur > cou[i].cur()){
				idx = i;
				cur = cou[i].cur();
			}
		}
		return cou[idx];
	}
	

	public Country nextmax(){
		int cur = cou[0].next();
		int idx = 0;
		for(int i = 1; i < N; i++){
			if(cur < cou[i].next()){
				idx = i;
				cur = cou[i].next();
			}
		}
		return cou[idx];
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