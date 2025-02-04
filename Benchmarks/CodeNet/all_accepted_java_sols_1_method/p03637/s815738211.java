import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int num4 = 0;
			int num2 = 0;
			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				if (tmp % 4 == 0) {
					num4++;
				} else if (tmp % 2 == 0) {
					num2++;
				}
			}

			int result = n - num4 * 2;
			result -= num2;
			if (n % 2 == 1) {
				result--;
			}

			if (0 < result) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}