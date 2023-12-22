

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int b = 0;
		long ans = 0;

		for (char c : s.toCharArray()) {
			if (c == 'B')
				b++;
			else
				ans+=b;
		}

		System.out.println(ans);

	}

}
