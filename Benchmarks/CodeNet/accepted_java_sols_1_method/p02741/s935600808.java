import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

		if (input > 32 || input < 1) {
			throw new IllegalArgumentException();
		}

		int[] answers = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1,
				4, 1, 51 };
		System.out.println(answers[input - 1]);

	}

}