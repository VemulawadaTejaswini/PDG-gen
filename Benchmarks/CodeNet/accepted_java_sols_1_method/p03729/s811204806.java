import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();

			if (a.endsWith(b.substring(0, 1)) && b.endsWith(c.substring(0, 1))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} finally {
			sc.close();
		}
	}
}