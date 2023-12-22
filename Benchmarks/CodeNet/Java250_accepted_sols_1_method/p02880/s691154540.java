import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		boolean f = false;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}