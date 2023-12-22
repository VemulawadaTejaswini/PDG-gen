import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 15; j++) {
				if (1 <= (4 * i + 7 * j) && (4 * i + 7 * j) <= 100) {
					if (N % (4 * i + 7 * j) == 0) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}

		System.out.println("No");
	}
}