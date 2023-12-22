import java.util.Scanner;

public class Main {
	static int chocoAmount;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int price = 700;
		String str = s.next();
		int strLen = str.length();
		char[] c = new char[strLen];

		for (int i = 0; i < strLen; i++) {
			c[i] = str.charAt(i);
			if (c[i] == 'o') {
				price += 100;
			}
		}
		System.out.println(price);
	}
}