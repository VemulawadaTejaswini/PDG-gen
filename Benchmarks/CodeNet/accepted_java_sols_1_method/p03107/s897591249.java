import java.text.ParseException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int zero = 0;
		int one = 0;

		char[] array = s.toCharArray();

		for (char c : array) {

			if (c == '0') {
				zero++;
			} else if (c == '1') {
				one++;
			}

		}

		System.out.println(Math.min(one, zero) * 2);

		sc.close();
	}

}
