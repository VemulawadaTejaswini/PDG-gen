import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int answer = 0;
		if (A == B) {
			answer = C;
		} else if (B == C) {
			answer = A;
		} else {
			answer = B;
		}
		System.out.println(answer);
	}

}