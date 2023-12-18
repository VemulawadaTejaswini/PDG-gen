import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		
		long[] a = new long[N];
		long[] b = new long[M];
		
		a[0] = sc.nextLong();
		for (int i = 1; i < N; i++) {
			a[i] = a[i - 1] + sc.nextLong();
		}
		
		b[0] = sc.nextLong();
		for (int i = 1; i < M; i++) {
			b[i] = b[i - 1] + sc.nextLong();
		}
		
		// 結果の出力
		int max = 0;
		int bIndex = M - 1;
		for (int i = 0; i < N; i++) {
			if (a[i] > K) {
				break;
			}
			for (int j = bIndex; j >= 0; j--) {
				if (K - a[i] - b[j] >= 0) {
					bIndex = j;
					max = Math.max(max, (i + 1) + (j + 1));
					break;
				}
			}
		}
		System.out.println(max);
		
		sc.close();
	}
}
