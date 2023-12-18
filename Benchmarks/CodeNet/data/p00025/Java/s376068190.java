

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNextInt()) {
			int[] a = new int[4];
			int[] b = new int[4];
			for (int i = 0; i < 4; i++)
				a[i] = stdIn.nextInt();
			for (int i = 0; i < 4; i++)
				b[i] = stdIn.nextInt();
			int cou1 = 0;
			int cou2 = 0;
			for (int i = 0; i < 4; i++)
				if (a[i] == b[i])
					cou1++;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (a[i] == b[j]) {
						cou2++;
					}
				}
			}
			if (0 < cou2)
				cou2 = cou2 - cou1;
			System.out.println(cou1 + " " + cou2);
		}
	}
}