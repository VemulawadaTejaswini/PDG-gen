import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		String firstLetter = "";
		String secondLetter = "";

		char[] letters = s.toCharArray();

		for (int i = 0; i < N; i++) {

			if (i < N / 2) {
				firstLetter += letters[i];
			}

			else {
				secondLetter += letters[i];
			}
		}

		if (firstLetter.equals(secondLetter)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
