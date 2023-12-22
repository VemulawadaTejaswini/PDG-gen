import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String msg = "Yes";
		String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < s.length(); i++) {

			if (i < a || i > a) {
				if (!(Arrays.asList(num).contains(s.substring(i, i+1)))) {
					msg = "No";
					break;
				}
			}

			if (i == a) {
				if (s.charAt(i) != '-') {
					msg = "No";
					break;
				}
			}

		}

		System.out.println(msg);
	}

}