import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		boolean f = false;
		if (c[0] != 'A' ||Character.isUpperCase(s.charAt(s.length()-1)) || Character.isUpperCase(s.charAt(1))) {
			System.out.println("WA");
			return;
		}
		int U = 0;
		for (int i = 2; i < s.length()-1; i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				U++;
			}
			if (c[i] == 'C') f = true;
		}
		if (U == 1 && f == true) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}
