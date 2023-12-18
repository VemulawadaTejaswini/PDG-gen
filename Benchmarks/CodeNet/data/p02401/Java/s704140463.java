import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if ("?".equals(op)) {
				break;
			}
			if ("+".equals(op)) {
				System.out.println(a + b);
			} else if ("-".equals(op)) {
				System.out.println(a - b);
			} else if ("*".equals(op)) {
				System.out.println(a * b);
			} else {
				System.out.println(a / b);
			}
		}
	}
}

