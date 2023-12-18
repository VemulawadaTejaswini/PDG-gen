
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int tmp = a + b;

			if (tmp % 2 != 0) {
				System.out.println("IMPOSSIBLE");
			} else {
				System.out.println(tmp / 2);
			}
		}
	}
}
