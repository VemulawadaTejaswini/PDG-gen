import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();

		if (N * A < B) {
			System.out.println(N * A);
		} else {
			System.out.println(B);
		}

	}

}
