import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long k = scan.nextLong();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		boolean f = true;
		char result = '1';
		for (int i = 0; i < k; i++) {
			if (c[i] != '1') {
				f = false;
				result = c[i];
				break;
			}
		}
		if (f) {
			System.out.println(1);
		} else {
			System.out.println(result);
		}
	}
}
