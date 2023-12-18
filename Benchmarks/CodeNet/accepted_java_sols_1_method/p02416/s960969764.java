import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String num = sc.next();
			int length = num.length();
			int sum = 0;

			if (num.contentEquals("0")) {
				break;
			} else {
				for (int i = 0; i < length; i++) {
					sum += Character.getNumericValue(num.charAt(i));
				}
				System.out.println(sum);
			}
		}
	}
}

