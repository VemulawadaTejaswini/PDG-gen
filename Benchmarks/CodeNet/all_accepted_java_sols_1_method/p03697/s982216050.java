
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (10 <= a + b) {
				System.out.println("error");
			} else {
				System.out.println(a + b);
			}
		}
	}
}