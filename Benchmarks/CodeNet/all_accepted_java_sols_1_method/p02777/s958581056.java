import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();
		sc.close();

		if (S.equals(U)) {
			A = A - 1;
		} else {
			B = B - 1;
		}
		System.out.println(A + " " + B);
	}
}
