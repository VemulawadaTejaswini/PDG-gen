import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	static char[] s;
	static int id;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			s = sc.next().toCharArray();
			id = 0;
			System.out.println(exp());
		}
	}
	static int exp(){
		int r = term();
		while(true){
			char c = s[id++];
			if(c=='+')r+=term();
			else if(c=='-')r-=term();
			else break;
		}
		return r;
	}

	static int term(){
		int r = fact();
		while(true){
			char c = s[id++];
			if(c=='*') r*=fact();
			else if(c=='/')r/=fact();
			else break;
		}
		id--;
		return r;
	}

	static int fact(){
		char c = s[id++];
		if(c=='(')return exp();
		if(c=='-'){
			return -fact();
		}
		if(c=='+'){
			return fact();
		}
		int x = c-'0';
		while(true){
			c = s[id++];
			if(Character.isDigit(c)){
				x *= 10;
				x += c-'0';
			}
			else break;
		}
		id--;
		return x;
	}

}
class SC {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;
	public SC(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
	}
	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		return tokenizer.nextToken();
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	public String nextLine() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
