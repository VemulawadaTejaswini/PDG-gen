

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			sum += n.charAt(i) - '0';
		}
		if ((Integer.parseInt(n) % sum) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
