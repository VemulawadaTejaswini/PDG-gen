

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int[] c = new int[4];

		for (int i = 0; i < 6; i++) {
			a = sc.nextInt();

			if (a == 1)
				c[0]++;
			if (a == 2)
				c[1]++;
			if (a == 3)
				c[2]++;
			if (a == 4)
				c[3]++;
		}

		if (c[0] == 3 || c[1] == 3 || c[2] == 3 || c[3] == 3)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
