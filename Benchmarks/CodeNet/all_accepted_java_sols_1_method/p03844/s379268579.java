import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		String op = sc.next();
		int B = sc.nextInt();
		int ans = 0;

		if (op.equals("+")) {
			ans = A + B;
		} else if (op.equals("-")) {
			ans = A - B;
		}
		System.out.println( ans );
	}
}