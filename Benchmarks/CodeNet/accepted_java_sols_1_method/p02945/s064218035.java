
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = Integer.MIN_VALUE;

			if (max < a + b) {
				max = a + b;
			}
			if (max < a - b) {
				max = a - b;
			}
			if (max < a * b) {
				max = a * b;
			}
			System.out.println(max);
		}
	}
}
