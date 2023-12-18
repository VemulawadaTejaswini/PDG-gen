
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String c1 = sc.next();
		String c2 = sc.next();
		String c3 = sc.next();
		sc.close();

		System.out.print(c1.charAt(0));
		System.out.print(c2.charAt(1));
		System.out.print(c3.charAt(2));

	}
}