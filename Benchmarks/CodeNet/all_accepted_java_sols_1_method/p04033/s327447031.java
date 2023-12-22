import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a <= 0) {
			if (0 <= b) {
				System.out.println("Zero");
			} else {
				int c = b - a;
				if (c % 2 == 0) {
					System.out.println("Negative");
				} else {
					System.out.println("Positive");
				}
			}
		} else {
			System.out.println("Positive");
		}
	}
}
