import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = sc.next();

		int len = s.length();

		loop: for (int i = 0; i < s.length() / 2; i++) {
			len -= 2;
			for (int j = 0; j < len / 2; j++) {
				if (s.charAt(j) != s.charAt(j + len / 2)) {
					continue loop;
				}
			}

			System.out.println(len);
			break;

		}

	}
}