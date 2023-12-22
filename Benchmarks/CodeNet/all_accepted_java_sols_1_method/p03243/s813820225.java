
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int i = 1; i <= 9; i++) {
				if (n <= i * 111) {
					System.out.println(i * 111);
					return;
				}
			}
		}
	}
}
