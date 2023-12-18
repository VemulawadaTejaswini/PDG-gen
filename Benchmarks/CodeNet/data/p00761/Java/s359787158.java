
import java.io.*;
import java.util.*;
 
public class Main{
	
	public void solve(){
		while(true){
			int A = nextInt();
			int L = nextInt();
			if(L == 0) return;
			
			int[] a0 = new int[L];
			int a = A;
			int[] memo = new int[20];
			memo[0] = a;
			LOOP:
			for(int cnt = 1; cnt < 20; cnt++){
				for(int i = 0; i < L; i++){
					a0[i] = a % 10;
					a = a / 10;
				}
				Arrays.sort(a0);
				int amax = 0;
				int amin = 0;
				for(int i = 0; i < L; i++){
					amin = amin * 10 + a0[i];
					amax = amax * 10 + a0[L - 1 - i];
				}
				a = amax - amin;
				for(int i = 0; i < cnt; i++){
					if(memo[i] == a){
						out.println(i + " " + memo[i] + " " + (cnt - i));
						break LOOP;
					}
				}
				memo[cnt] = a;
			}
		}
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