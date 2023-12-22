import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean playFlag = true;
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String person = a;
		String personNext = person.substring(0, 1);
		a = person.substring(1);

		while (playFlag) {

			if ("a".equals(personNext)) {
				if (0 == a.length()) {
					System.out.println("A");
					break;
				}
				person = a;
				personNext = a.substring(0, 1);
				a = a.substring(1);
			} else if ("b".equals(personNext)) {
				if (0 == b.length()) {
					System.out.println("B");
					break;
				}
				personNext = b.substring(0, 1);
				b = b.substring(1);
				person = b;
			} else {
				if (0 == c.length()) {
					System.out.println("C");
					break;
				}
				personNext = c.substring(0, 1);
				c = c.substring(1);
				person = c;
			}
		}
		sc.close();
	}
}
