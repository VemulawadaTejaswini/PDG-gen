
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		String input;
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			input = sc.next();
			if (input.equals("print")) {
				a = sc.nextInt();
				b = sc.nextInt();
				printAtoB(str, a, b);
			} else if (input.equals("reverse")) {
				a = sc.nextInt();
				b = sc.nextInt();
				str = reverseAtoB(str, a, b);
			} else if (input.equals("replace")) {
				a = sc.nextInt();
				b = sc.nextInt();
				String p = sc.next();
				str = replaceAtoBofP(str, a, b, p);
			} else {
				System.out.println("error");
			}
		}
	}

	static void printAtoB(String str, int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	static String reverseAtoB(String str, int a, int b) {
		String newStr = "";
		for (int i = 0; i < a; i++) {
			newStr += str.charAt(i);
		}
		for (int i = b; i >= a; i--) {
			newStr += str.charAt(i);
		}
		for (int i = b + 1; i < str.length(); i++) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

	static String replaceAtoBofP(String str, int a, int b, String p) {
		String newStr = "";

		for (int i = 0; i < a; i++) {
			newStr += str.charAt(i);
		}
		for (int i = 0; i <= (b - a); i++) {
			newStr += p.charAt(i);
		}
		for (int i = b + 1; i < str.length(); i++) {
			newStr += str.charAt(i);
		}
		return newStr;

	}

}