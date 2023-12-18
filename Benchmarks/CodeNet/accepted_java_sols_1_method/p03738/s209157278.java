import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		if (a.length() > b.length()) {
			System.out.println("GREATER");
			return;
		}
		if (a.length() < b.length()) {
			System.out.println("LESS");
			return;
		}
		char[] ac = new char[a.length()];
		char[] bc = new char[b.length()];
		for (int i = 0; i < a.length(); i++) {
			ac[i] = a.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			bc[i] = b.charAt(i);
		}
		for (int i = 0; i < a.length(); i++) {
			if (ac[i]>bc[i]) {
				System.out.println("GREATER");
				return;
			}
			if (ac[i]<bc[i]) {
				System.out.println("LESS");
				return;
			}
		}
		System.out.println("EQUAL");
	}
}
