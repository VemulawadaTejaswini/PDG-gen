
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner("3 5 4 2 0 0 8 8");
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		while (true) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			for (int i = 0; i < a; i++) {
				lineMaker(b);
				System.out.println("");
			}
			System.out.println("");
		}
	}

	static void lineMaker(int b) {
		for (int i = 0; i < b; i++) {
			System.out.print("#");
		}
	}
}