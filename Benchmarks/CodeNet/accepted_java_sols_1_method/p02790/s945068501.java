import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = null;
		c = "";

		if (Integer.parseInt(a) < Integer.parseInt(b)) {
			for (int i = 0; i < Integer.parseInt(b); i++) {

				c = c + a;
			}
			System.out.print(c);
		}
			else if (Integer.parseInt(b) < Integer.parseInt(a)) {
				for (int i = 0; i < Integer.parseInt(a); i++) {

					c = c + b;
				}
				System.out.print(c);
				} else {
					for (int i = 0; i < Integer.parseInt(b); i++) {

						c = c + a;
					}
					System.out.print(c);
				}
		sc.close();
	}
}