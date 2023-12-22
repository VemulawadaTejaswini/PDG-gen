import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a + b;

		switch (c) {
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(2);
			break;
		case 5:
			System.out.println(1);
			break;
		}

	}

}