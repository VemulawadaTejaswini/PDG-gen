import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int x = 10 * b; x < 10 * (b + 1); x++) {
			if (x * 8 / 100 == a) {
				System.out.println(x);
				return;
			}
		}
		System.out.println(-1);
	}

}
