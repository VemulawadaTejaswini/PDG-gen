import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		in = sc.next();
		return true;
	}
	
	static void solve(){
		StringBuffer sb = new StringBuffer(in);
		System.out.println(sb.reverse());
	}
}