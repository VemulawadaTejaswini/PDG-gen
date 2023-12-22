import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();
		if (U.equals(S)) {
			A = A - 1;

		} else if (U.contentEquals(T)) {
			B = B - 1;

		}
		System.out.print(A + " " + B);
	}
}