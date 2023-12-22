import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int a = s[0] - '0';
		int b = s[1] - '0';
		int c = s[2] - '0';
		int d = s[3] - '0';

		if (a + b + c + d == 7) {
			System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
			return;
		}
		if (a + b + c - d == 7) {
			System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
			return;
		}
		if (a + b - c + d == 7) {
			System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
			return;
		}
		if (a + b - c - d == 7) {
			System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
			return;
		}
		if (a - b + c + d == 7) {
			System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
			return;
		}
		if (a - b + c - d == 7) {
			System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
			return;
		}
		if (a - b - c + d == 7) {
			System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
			return;
		}
		if (a - b - c - d == 7) {
			System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
			return;
		}
	}
}
