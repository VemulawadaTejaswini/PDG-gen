

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		scanner.close();
		
		String ans = a.substring(0, 1) + b.substring(1, 2) + c.substring(2, 3);
		System.out.println(ans);

	}

}
