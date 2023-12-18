import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		int a = sc.nextInt();
		int mina = 100000;
		int b = sc.nextInt();
		int minb = 100000;
		int m = sc.nextInt();

		int[] cola = new int[a];
		int[] colb = new int[b];

		for (int i = 0; i < a; i++) {
			cola[i] = sc.nextInt();
			if (cola[i] < mina) {
				mina = cola[i];
			}
		}
		for (int i = 0; i < b; i++) {
			colb[i] = sc.nextInt();
			if (colb[i] < minb) {
				minb = colb[i];
			}
		}
		int pri = mina + minb;

		int[] colx = new int[m];
		int[] coly = new int[m];
		int[] colc = new int[m];

		for (int i = 0; i < m; i++) {
			colx[i] = sc.nextInt();
			coly[i] = sc.nextInt();
			colc[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			if (cola[colx[i] - 1] + colb[coly[i] - 1] - colc[i] < pri) {
				pri = cola[colx[i] - 1] + colb[coly[i] - 1] - colc[i];
			}
		}

		System.out.println(pri);

	}
}
