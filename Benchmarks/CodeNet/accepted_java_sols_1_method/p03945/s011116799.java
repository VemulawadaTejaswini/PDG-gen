import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int count = 0;

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(0) == 'W') {
				if (S.charAt(i) == 'W' && S.charAt(i - 1) == 'B') count++;
			}
			else {
				if (S.charAt(i) == 'B' && S.charAt(i - 1) == 'W') count++;
			}
		}

		System.out.println(S.charAt(0) == S.charAt(S.length() - 1) ? count * 2 : count * 2 + 1);
 	}
}