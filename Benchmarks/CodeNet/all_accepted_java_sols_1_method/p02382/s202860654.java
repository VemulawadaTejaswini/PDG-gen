import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//n次元ベクトル
		int n = sc.nextInt();

		double M = 0;
		double U = 0;
		double ppp = 0;
		double c = 0;

		//ベクトルx,y
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();

		}

		int[] y = new int[n];
		for (int i = 0; i < y.length; i++) {
			y[i] = sc.nextInt();

		}

		double pow = 0;
		for (int i = 0; i < n; i++) {
			//p=1 マンハッタン距離
			pow = Math.abs(x[i] - y[i]);
			M += pow;
		}

		double pow2 = 0;
		for (int i = 0; i < n; i++) {
			//p=2 ユークリッド距離
			int num = Math.abs(x[i] - y[i]);
			num *= num;
			pow2 += num;

		}
		U = Math.sqrt(pow2);

		double pow3 = 0;
		for (int i = 0; i < n; i++) {
			//p=3
			int num = (Math.abs(x[i] - y[i]));
			num *= num * num;
			pow3 += num;
		}

		ppp = Math.cbrt(pow3);

		double pow4 = 0;

		for (int i = 0; i < n; i++) {
			//p=∞ チェビシェフ距離
			pow4 = Math.abs(x[i] - y[i]);
			c = Math.max(pow4, c);

		}

		System.out.println(M);
		System.out.println(U);
		System.out.println(ppp);
		System.out.println(c);

		sc.close();

	}
}

