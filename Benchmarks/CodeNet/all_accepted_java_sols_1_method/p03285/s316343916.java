import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = false;
		for (int i = 0; i <= n / 7; i++) {
			if ((n - i * 7) % 4 == 0) {
				ans = true;
			}
		}

		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}