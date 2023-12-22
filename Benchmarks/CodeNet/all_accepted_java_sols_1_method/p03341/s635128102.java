import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();

			String str = scanner.nextLine();
			int length = str.length();

			List<Character> charList = new ArrayList<>(length);
			for (int i = 0; i < length; i++) {
				charList.add(str.charAt(i));
			}

			int min = 0;
			for (int i = 1; i < length; i++) {
				if (charList.get(i) == 'E') {
					min++;
				}
			}

			int nowVal = min;
			for (int i = 0; i < length - 1; i++) {
				if (charList.get(i) == 'W') {
					nowVal++;
				}
				if (charList.get(i + 1) == 'E') {
					nowVal--;
				}
				if (nowVal < min) {
					min = nowVal;
				}
			}

			System.out.println(min);
		}
	}
}
