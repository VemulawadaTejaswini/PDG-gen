import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		String answer = null;
		if (c >= a) {
			if (c <= b) {
				answer = "Yes";
			} else {
				answer = "No";
			}
		} else {
			answer = "No";
		}

		System.out.println(answer);
		scanner.close();
	}
}
