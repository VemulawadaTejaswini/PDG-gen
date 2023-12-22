import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		boolean isStepEasy = true;
		List<Character> odd = Arrays.asList('R', 'U', 'D');
		List<Character> even = Arrays.asList('L', 'U', 'D');

		for (int i=1; i<=input.length(); i++) {
			char c = input.charAt(i-1);
			if (i % 2 == 0) {
				if (!even.contains(c)) {
					isStepEasy = false;
					break;
				}
			} else {
				if (!odd.contains(c)) {
					isStepEasy = false;
					break;
				}
			}
		}

		if (isStepEasy) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}