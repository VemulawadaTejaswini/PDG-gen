import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int m = sc.nextInt();
			int nmin = sc.nextInt();
			int nmax = sc.nextInt();
			if (m == 0 && nmin == 0 && nmax == 0)
				break;

			int[] hito = new int[m];

			int i;
			for (i = 0; i < m; i++) {
				hito[i] = sc.nextInt();
			}

			int count = 0, check = 0, pass = 0;
			for (i = nmin - 1; i < nmax; i++) {
				count = hito[i] - hito[i + 1];
				if (count >= check) {
					check = count;
					pass = i + 1;
				}
			}
			System.out.println(pass);
		}

		sc.close();
	}
}

