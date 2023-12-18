
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = a - (2 * b);
			System.out.println(count < 0 ? 0 : count);
		}
	}
}
