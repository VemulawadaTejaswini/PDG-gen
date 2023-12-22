import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String c1 = sc.next();
		String c2 = sc.next();

		if (!c1.substring(0, 1).equals(c2.substring(2, 3))) {
			System.out.println("NO");
		} else if (!c1.substring(1, 2).equals(c2.substring(1, 2))) {
			System.out.println("NO");
		} else if (!c1.substring(2, 3).equals(c2.substring(0, 1))) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

		sc.close();
	}
}