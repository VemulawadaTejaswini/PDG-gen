import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		boolean f = true;
		if (c[a] == '-') {
			for (int i = 0; i < a; i++) {
				if (c[i] == '-') {
					f = false;
				}
			}
			for (int i = a+1; i <= a+b; i++) {
				if (c[i] == '-') {
					f = false;
				}
			}
		}
		else {
			f = false;
		}
		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
