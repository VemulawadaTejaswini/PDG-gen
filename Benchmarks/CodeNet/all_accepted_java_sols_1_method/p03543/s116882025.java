

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		if (a.charAt(0) == a.charAt(1) && a.charAt(1) == a.charAt(2) || a.charAt(1) == a.charAt(2) && a.charAt(2) == a.charAt(3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
