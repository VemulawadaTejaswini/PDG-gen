import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] charArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		if (charArray[0] != 65) {
			System.out.println("WA");
		} else if (Character.isUpperCase(charArray[1])) {
			System.out.println("WA");

		} else {
			int count = 0;
			for (int i = 2; i < str.length() - 1; i++) {
				if (charArray[i] == 67) {
					count++;
				}
			}
			if (count == 1) {
				if (charArray[str.length() - 1] != 67 && Character.isLowerCase(charArray[str.length() - 1])) {
					System.out.println("AC");
				} else {
					System.out.println("WA");
				}
			} else {
				System.out.println("WA");
			}

		}

	}
}