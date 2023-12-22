import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		for (int i = s.length()-1; 0 < i; i--) {
			s = s.substring(0, i);
			String s1 = s.substring(0, s.length()/2);
			String s2 = s.substring((s.length()/2));
			if (s1.equals(s2)) {
				System.out.println(s.length());
				return;
			}
		}
		return;
	}
}
