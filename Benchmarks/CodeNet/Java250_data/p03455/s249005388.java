import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int m = a * b;

		String result = "Even";
		if (m % 2 > 0) {
			result = "Odd";
		}

		System.out.println(result);
	}

}
