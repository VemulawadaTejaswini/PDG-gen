import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_E
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long d[] = new long[N];
		long dR[] = new long[N];


		for(int i=0; i<N; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			d[i] = x + y;
			dR[i] = 1000000000 - x + y;
		}

		Arrays.sort(d);
		Arrays.sort(dR);

		if(d[N-1]-d[0] > dR[N-1]-dR[0]) {
			System.out.println(d[N-1]-d[0]);
		} else {
			System.out.println(dR[N-1]-dR[0]);
		}

		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
