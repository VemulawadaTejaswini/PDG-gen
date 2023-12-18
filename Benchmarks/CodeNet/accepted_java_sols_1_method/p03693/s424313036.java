

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String d = a + b + c;

		if (Integer.parseInt(d) % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
