import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int m = s.nextInt();

			if (n == 0 && m == 0)
				break;

			int[] taro = new int[n];
			int[] hana = new int[m];

			for (int i = 0; i < n; i++)
				taro[i] = s.nextInt();

			for (int i = 0; i < m; i++)
				hana[i] = s.nextInt();

			Arrays.sort(taro);
			Arrays.sort(hana);

			int a = -1, b = -1;
			boolean flag = false;

			outer: for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int temp;
					temp = taro[i];
					taro[i] = hana[j];
					hana[j] = temp;

					int sumt = 0;
					int sumh = 0;

					for (int x = 0; x < n; x++)
						sumt += taro[x];

					for (int y = 0; y < m; y++)
						sumh += hana[y];

					if (sumt == sumh) {
						a = hana[j];
						b = taro[i];
						flag = true;
						break outer;
					}

					temp = taro[i];
					taro[i] = hana[j];
					hana[j] = temp;
				}
			}

			System.out.println(flag ? a + " " + b : -1);
		}

		s.close();
	}
}