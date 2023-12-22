
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tmp = 0;

			for (int i = 0; i < n; i++) {
				int h = sc.nextInt();
				if (h < tmp && h - 1 < tmp) {
					System.out.println("No");
					return;
				}
				if (tmp <= h - 1) {
					tmp = h - 1;
				} else {
					tmp = h;
				}
			}

			System.out.println("Yes");
		}
	}
}
