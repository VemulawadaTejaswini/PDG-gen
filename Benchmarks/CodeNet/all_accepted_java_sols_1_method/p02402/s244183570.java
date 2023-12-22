import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt(), minimum = 0, maximum = 0;
		long total = 0;

		for (int i = 0; i < length; i++) {
			int number = scanner.nextInt();

			if (i == 0) {
				minimum = number;
				maximum = number;
			}

			total += number;

			if (number < minimum)
				minimum = number;
			if (number > maximum)
				maximum = number;
		}

		System.out.println(minimum + " " + maximum + " " + total);
	}
}