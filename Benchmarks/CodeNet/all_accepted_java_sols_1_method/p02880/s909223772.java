import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		for (int i = 1; i < 10; i++) {
			if (n % i == 0) {
				if (n / i < 10) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");
		return;
	}
}