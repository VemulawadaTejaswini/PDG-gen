import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String msg = "AC";
		int count = 0;
		int num = 0;

		if (!(s.substring(0, 1).equals("A"))) {
			msg = "WA";
		}

		for (int i = 2; i < s.length() - 1; i++) {
			if (s.substring(i, i + 1).equals("C")) {
				count++;
				if (count > 1) {
					msg = "WA";
					break;
				}
				num = i;
			}
		}
		if (count != 1) {
			msg = "WA";
		}

		for (int i = 1; i < s.length(); i++) {
			if (i == num) {
				continue;
			}
			if (Character.isUpperCase(s.charAt(i))) {
				msg = "WA";
				break;
			}
		}

		System.out.println(msg);

	}
}