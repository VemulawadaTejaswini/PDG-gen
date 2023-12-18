import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String s = sc.next();
		int B = sc.nextInt();
		if (s.equals("+")) {
			System.out.println(A+B);
		} else {
			System.out.println(A-B);
		}
	}
}