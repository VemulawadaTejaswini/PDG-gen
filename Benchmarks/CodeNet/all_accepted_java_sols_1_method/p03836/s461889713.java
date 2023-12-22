import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int tx = scanner.nextInt();
		int ty = scanner.nextInt();
		scanner.close();

		// 1
		for (int i = 0; i < tx - sx; i++) {
			System.out.print("R");
		}
		for (int i = 0; i < ty - sy; i++) {
			System.out.print("U");
		}

		// 2
		for (int i = 0; i < tx - sx; i++) {
			System.out.print("L");
		}
		for (int i = 0; i < ty - sy; i++) {
			System.out.print("D");
		}

		// 3
		System.out.print("D");
		for (int i = 0; i < tx - sx + 1; i++) {
			System.out.print("R");
		}
		for (int i = 0; i < ty - sy + 1; i++) {
			System.out.print("U");
		}
		System.out.print("L");

		// 4
		System.out.print("U");
		for (int i = 0; i < tx - sx + 1; i++) {
			System.out.print("L");
		}
		for (int i = 0; i < ty - sy + 1; i++) {
			System.out.print("D");
		}
		System.out.println("R");

	}

}
