import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (A == B && A != C) {
			System.out.println("Yes");
			return;
		}
		if (B == C && B != A) {
			System.out.println("Yes");
			return;
		}
		if (C == A && C != B) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
		scanner.close();
	}

}
