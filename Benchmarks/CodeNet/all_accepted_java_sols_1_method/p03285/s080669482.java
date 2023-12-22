import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String ans = "Yes";

		if (n % 4 != 0 && n % 7 != 0 && n % 11 != 0) {
			while (n >= 4) {
				if (n >= 7) {
					n -= 7;
				}
				if (n % 4 == 0 || n % 7 == 0 || n % 11 == 0) {
					n = 0;
				}
				if (n >= 4) {
					n -= 4;
				}
				if (n % 4 == 0 || n % 7 == 0 || n % 11 == 0) {
					n = 0;
				}
			}

			if (n != 0) {
				ans = "No";
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
