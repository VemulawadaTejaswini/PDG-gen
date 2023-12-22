import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];

		// 入力を受け取りながら自分より左側の最大値も記録する
		int l_Max[] = new int[n];
		int pMax = 0;

		for ( int i = 0; i < n; i++ ) {
			l_Max[i] = pMax;
			a[i] = in.nextInt();

			if ( pMax < a[i] ) {
				pMax = a[i];
			}
		}

		// 右側最大値のリストを作る
		int r_Max[] = new int[n];
		pMax = 0;

		for ( int i = n - 1; 0 <= i; i-- ) {
			r_Max[i] = pMax;

			if ( pMax < a[i] ) {
				pMax = a[i];
			}
		}

		for ( int i = 0; i < n; i++ ) {
			int Max = l_Max[i] > r_Max[i] ? l_Max[i] : r_Max[i];
			System.out.println(Max);
		}

		in.close();
	}
}