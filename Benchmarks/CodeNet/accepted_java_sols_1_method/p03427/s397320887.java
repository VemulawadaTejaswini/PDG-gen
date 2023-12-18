import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int re =0;
		if (s.length()==1) {
			System.out.println(s.charAt(0)-'0');
			return ;
		}
		int nonine=0;
		for (;nonine<s.length();nonine++) {
			if (s.charAt(nonine)!='9') {
				break;
			}
		}
		if (nonine==s.length()) {
			System.out.println(9*s.length());
			return ;
		}
		if (nonine==s.length()-1) {
			System.out.println(9*s.length()-1);
			return ;
		}
		int nextnine = nonine+1;
		for (;nextnine<s.length();nextnine++) {
			if (s.charAt(nextnine)!='9') {
				break;
			}
		}
		if (nextnine==s.length()) {
			System.out.println(9*s.length()-9+s.charAt(nonine)-'0');
			return ;
		}
		if (s.charAt(nonine)=='0') {
			System.out.println(9*s.length()-9+s.charAt(nonine)-'0'-2);
		} else {
			System.out.println(9*s.length()-9+s.charAt(nonine)-'0'-1);
		}


	}
}