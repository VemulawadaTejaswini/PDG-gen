import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		long A = sc.nextLong();
		long B = sc.nextLong();
		String U = sc.next();
		if (U.equals(S)) {
			A--;
		} else {
			B--;
		}
		System.out.println(A + " " + B);
	}
}
