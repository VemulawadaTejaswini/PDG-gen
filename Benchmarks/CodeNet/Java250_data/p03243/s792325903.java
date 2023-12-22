import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			for (int i = 111; i <= 999; i += 111) {
				if (i >= n) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
