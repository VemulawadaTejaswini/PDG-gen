import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			for (int i = 1; i <= 1000; i++) {
				if ((i * 8 / 100 == a) && (i / 10 == b)) {
					System.out.println(i);
					return;
				}
			}
			System.out.println(-1);
		}
	}
}
