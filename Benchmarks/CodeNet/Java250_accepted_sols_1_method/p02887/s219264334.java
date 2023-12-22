

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		char before = '1';

		for (char c : s.toCharArray()) {
			if (before == c)
				n--;
			before = c;
		}

		System.out.println(n);
	}

}
