import java.io.*;
import java.util.*;
 
public class Main{
	public void solve(){
		String exp = next();
		int m = nextInt();
		
		int a = calc2(exp);
		int b = calc1(exp);
		if(a == m && b == m){
			out.println("U");
		}else if(a == m){
			out.println("M");
		}else if(b == m){
			out.println("L");
		}else{
			out.println("I");
		}
	}
	public int calc1(String exp){
		int ans = exp.charAt(0) - '0';
		for(int i = 1; i < exp.length() - 1; i+=2){
			if(exp.charAt(i) == '+'){
				ans += (exp.charAt(i + 1) - '0');
			}else{
				ans *= (exp.charAt(i + 1) - '0');
			}
		}
		return ans;
	}
	String ss;
	int idx;
	public int calc2(String exp){
		this.ss = exp;
		this.idx = 0;
		return e();
	}
	
	public int e(){
		int val = t();
		while(idx < ss.length() && ss.charAt(idx) == '+'){
			idx++;
			val += t();
		}
		return val;
	}
	public int t(){
		int val = f();
		while(idx < ss.length() && ss.charAt(idx) == '*'){
			idx++;
			val *= f();
		}
		return val;
	}
	
	public int f(){
		int val = ss.charAt(idx++) - '0';
		return val;
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