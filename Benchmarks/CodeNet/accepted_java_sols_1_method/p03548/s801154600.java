
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			int tmp = x - z;
			int result = tmp / (y + z);

			System.out.println(result);
		}
	}
}
