import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		char d = s.charAt(3);
		char[] chars = new char[] { a, b, c, d };

		for (int i = 0; i <= 3; i++) {
			int con = 0;
			for (int n = 0; n <= 3; n++) {
				if (chars[i] == chars[n]) {
					con += 1;
				}
			}
			if (con == 2) {
				if (i == 3) {
					System.out.println("Yes");
					break;
				}
			} else {
				System.out.println("No");
				break;
			}
		}
	}
}