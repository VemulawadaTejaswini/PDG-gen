import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] s = sc.nextLine().split(" ");
			int a = Integer.parseInt(s[0]);
			String op = s[1];
			int b = Integer.parseInt(s[2]);
			if ("?".equals(op)) {
				return;
			}
			if ("+".equals(op)) {
				System.out.println(a + b);
			} else if ("*".equals(op)) {
				System.out.println(a * b);
			} else if ("/".equals(op)) {
				System.out.println(a / b);
			} else if ("-".equals(op)) {
				System.out.println(a - b);
			}
		}
	}
}