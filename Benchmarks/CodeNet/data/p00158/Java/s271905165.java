
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int count = 0;
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = n * 3 + 1;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}