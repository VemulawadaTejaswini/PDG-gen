
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int i = 0;
		int j = 0;
		int sa = 0;

		int x = 0;
		int y = 0;

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[m];
		int d[] = new int[m];

		i = 0;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			//System.out.println(a[i]);
			//System.out.println(b[i]);

		}

		for (i = 0; i < m; i++) {
			c[i] = s.nextInt();
			d[i] = s.nextInt();
			//System.out.println(c[i]);
			//System.out.println(d[i]);

		}
		int ary[][] = new int[n][m];

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (a[i] > c[j]) {
					x = a[i] - c[j];
				} else if (a[i] <= c[j]) {
					x = c[j] - a[i];
				}

				if (b[i] > d[j]) {
					y = b[i] - d[j];
				} else if (b[i] <= d[j]) {
					y = d[j] - b[i];
				}

				sa = x + y;

				ary[i][j] = sa;


				//System.out.println(ary[i][j]);

			}

		}
		int ans[] = new int[n];

		for (i = 0; i < n; i++) {
			ans[i] = 1;
			int min = ary[i][0];
			for (j = 1; j < m; j++) {
				if (min > ary[i][j]) {
					min = ary[i][j];
					ans[i]=j+1;
				}
			}

			System.out.println(ans[i]);
		}

	}

}