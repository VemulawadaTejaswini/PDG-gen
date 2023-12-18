import java.util.*;
public class Main {
	public static HashMap<String,Boolean> map = new HashMap<String,Boolean>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		for(int i = 0; i < m; i++) {
			map = new HashMap<String,Boolean>();
			String in = stdIn.next();
			int ans = sorv1(in);
			System.out.println(ans);
			
		}
	}
	
	public static int sorv1(String a) {
		//--分ける---//
		int ans = 0;
		for(int i = 0; i < a.length(); i++) {
			String tp1 = a.substring(0, i);
			String tp2 = a.substring(i, a.length());
			if(check(tp1 + tp2)) {
				ans++;
			}
			if(check(rev(tp1) + tp2)) {
				ans++;
			}
			if(check(tp1 + rev(tp2))) {
				ans++;
			}
			if(check(rev(tp1) + rev(tp2))) {
				ans++;
			}
			if(check(tp2 + tp1)) {
				ans++;
			}
			if(check(rev(tp2) + tp1)) {
				ans++;
			}
			if(check(tp2 + rev(tp1))) {
				ans++;
			}
			if(check(rev(tp2) + rev(tp1))) {
				ans++;
			}
		}
		return ans;
	}
	
	public static String rev(String a) {
		String ra = "";
		for(int i = a.length()-1; i >= 0; i--) {
			ra += String.valueOf(a.charAt(i));
		}
		return ra;
	}
	
	public static boolean check(String a) {
		if(map.containsKey(a)) {
			return false;
		}
		else {
			map.put(a, true);
			return true;
		}
	}
}