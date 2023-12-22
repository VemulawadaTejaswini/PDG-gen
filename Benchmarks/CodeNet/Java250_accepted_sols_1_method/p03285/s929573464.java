import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 4) {
			System.out.println("No");
			return;
		}
		if (N % 4 == 0 || N % 7 == 0) {
			System.out.println("Yes");
			return;
		}

		for (int i = 7; i <= N; i += 7) {
			for (int j = 4; j <= N; j += 4) {
				if (N - (i + j) == 0) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");

	}

}
