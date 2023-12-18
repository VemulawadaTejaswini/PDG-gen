import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Character.getNumericValue(s.charAt(0));
		int b = Character.getNumericValue(s.charAt(1));
		int c = Character.getNumericValue(s.charAt(2));
		int d = Character.getNumericValue(s.charAt(3));

		if (a + b + c + d == 7) {
			System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
		} else if (a - b + c + d == 7) {
			System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
		} else if (a + b - c + d == 7) {
			System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
		} else if (a + b + c - d == 7) {
			System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
		} else if (a - b - c + d == 7) {
			System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
		} else if (a + b - c - d == 7) {
			System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
		} else if (a - b + c - d == 7) {
			System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
		} else if (a - b - c - d == 7) {
			System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
		}

		sc.close();

	}

}