import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		for(int i = s.length() - t.length() ; i >= 0 ; i--) {
			String temp = s.substring(i, i + t.length());
			boolean ok = true;
			for(int j = 0 ; j < temp.length() ; j++) {
				if(!(temp.charAt(j) == '?' || temp.charAt(j) == t.charAt(j))) {
					ok = false;
				}
			}
			if(ok) {
				String ret = s.substring(0, i) + t + s.substring(i + t.length());
				System.out.println(ret.replaceAll("\\?", "a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}