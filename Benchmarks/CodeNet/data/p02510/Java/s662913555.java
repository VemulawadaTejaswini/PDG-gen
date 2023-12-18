import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[100];
		String rep[][] = new String[100][100];
		String head[][] = new String[100][100];
		String tail[][] = new String[100][100];

		int m, h;
		int n = 0;

		while (true) {
			str[n] = sc.next();
			if (str[n].equals("-"))
				break;

			m = sc.nextInt();

			for (int i = 0; i < m; i++) {
				h = sc.nextInt();

				if (i == 0) {
					head[n][i] = str[n].substring(0, h);
					tail[n][i] = str[n].substring(h, str[n].length());

				} else if (i != 0) {

					head[n][i] = rep[n][i - 1].substring(0, h);
					tail[n][i] = rep[n][i - 1].substring(h, str[n].length());
				}

				rep[n][i] = tail[n][i] + head[n][i];

			}
			System.out.println(rep[n][m - 1]);

			n++;

		}

	}
}