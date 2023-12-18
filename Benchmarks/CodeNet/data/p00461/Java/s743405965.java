import java.util.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int m, n;
	static String s;
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
	
	public static boolean read() {
		n = sc.nextInt();
		if(n == 0) {
			return false;
		}
		
		m = sc.nextInt();
		s = sc.next();
		return true;
	}
	
	public static void solve() {
		String p = "";
		for(int i = 0; i < 2 * n + 1; i++) {
			p += (i % 2 == 0) ? "I" : "O";
		}
		
		int ret = 0;
		for(int i = 0; i < s.length(); i++) {
			String sub = s.substring(i);
			if(sub.startsWith(p)) {
				ret++;
			}
		}
		
		System.out.println(ret);
	}

}