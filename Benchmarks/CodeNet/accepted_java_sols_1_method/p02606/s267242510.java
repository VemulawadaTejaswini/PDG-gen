

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int a = 0;
		if (l % d == 0)
			a = 1;

		System.out.println(r / d - l / d + a);
	}

}
