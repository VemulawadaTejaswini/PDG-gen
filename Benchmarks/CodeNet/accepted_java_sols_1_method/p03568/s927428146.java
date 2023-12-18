
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int count = 0;
			int pow = 1;
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				if (a % 2 == 1) {
					count = count + pow * 2;
				} else {
					count = 2 * count + pow;
				}
				pow = pow * 3;
			}
			System.out.println(count);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
