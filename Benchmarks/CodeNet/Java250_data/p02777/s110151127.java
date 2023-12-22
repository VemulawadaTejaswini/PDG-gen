import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();

		if (S.equals(U)) {
			int A2 = A - 1;
			A = A2;
		} else if (T.equals(U)) {
			int B2 = B - 1;
			B = B2;
		}

		System.out.printf("%d %d", A, B);
		sc.close();
	}
}
