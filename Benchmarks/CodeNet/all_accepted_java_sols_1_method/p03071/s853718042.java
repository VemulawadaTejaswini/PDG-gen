import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int ans = 0;
		if (A < B) {
			ans = B;
			B -= 1;
		} else {
			ans = A;
			A -= 1;
		}
		ans += Math.max(A, B);
		System.out.println(ans);
		scanner.close();
	}
}