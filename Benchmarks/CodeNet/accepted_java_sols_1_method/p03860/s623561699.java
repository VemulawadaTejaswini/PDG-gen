import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			sc.next();// AtCoderは読み捨て
			String s = sc.next();
			sc.next();// Contestは読み捨て

			System.out.println("A" + s.substring(0, 1) + "C");

		} finally {
			sc.close();
		}
	}
}