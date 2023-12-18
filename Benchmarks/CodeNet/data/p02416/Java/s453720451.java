import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int total = 0;
			String str = scanner.next();
			if (str.equals("0")) {
				break;
			}
			for (int i = 0; i < str.length(); i++) {
				total = total + Character.getNumericValue(str.charAt(i));
			}
			System.out.println(total);

		}
	}
}

