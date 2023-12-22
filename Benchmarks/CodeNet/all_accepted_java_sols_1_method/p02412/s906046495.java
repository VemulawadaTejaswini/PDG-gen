
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0)
				break;
			int sum = 0;
			for (int i = 1; i <= a - 2; i++) {
				for (int j = i + 1; j <= a - 1; j++) {
					if (i + j > b)
						break;
					for (int k = j + 1; k <= a; k++) {
						if (i + j + k > b)
							break;
						if (i + j + k == b)
							sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}