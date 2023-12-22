
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int result = 1;

			for (int i = 0; i < 3; i++) {
				result *= n;
			}
			System.out.println(result);
		}
	}
}
