import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		if(s.length() < t.length()) {
			System.out.println("UNRESTORABLE");
			return;
		}
		String ans = "";
		for(int i = s.length() - t.length() ; i >= 0 ; i--) {
			String temp = s.substring(i, i + t.length());
			boolean ok = true;
			for(int j = 0 ; j < temp.length() ; j++) {
				if(temp.charAt(j) != t.charAt(j) && temp.charAt(j) != '?') ok = false;
			}
			if(ok) {
				ans += s.substring(0, i) + t + s.substring(i + t.length());
				break;
			}
		}
		if(ans.equals("")) {
			System.out.println("UNRESTORABLE");
		}
		System.out.println(ans.replaceAll("\\?", "a"));
	}
}