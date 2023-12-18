
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				if (i + 1 != sc.nextInt()) {
					cnt++;
				}
			}

			if (cnt <= 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
