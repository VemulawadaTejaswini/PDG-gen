
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt() % 39;
			System.out.println(String.format("3C%02d", n == 0 ? 39 : n));
		}
	}
}