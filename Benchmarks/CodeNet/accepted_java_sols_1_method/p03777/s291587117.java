import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if (A.charAt(0)=='H') {
			System.out.println(B);
		} else if (B.charAt(0)=='H') {
			System.out.println('D');
		} else {
			System.out.println('H');
		}
	}
}