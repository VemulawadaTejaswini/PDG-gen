import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] v = new int[N];
		Arrays.fill(v, -1);

		for (int i = 0; i < M; i++) {
			int s = sc.nextInt() - 1; // 配列に合わせる
			int c = sc.nextInt();

			if (v[s] < 0) {
				v[s] = c; // 入力された値で更新
			} else if (v[s] != c) {
				// 同じ桁で違う値はNG
				System.out.println("-1");
				sc.close();
				return;
			}
		}
		// 2桁以上で1桁目が0はNG
		if (N > 1 && v[0] == 0) {
			System.out.println("-1");
			sc.close();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (v[i] >= 0) {
				System.out.print(v[i]);
			} else {
				if (i == 0) {
					if (N == 1) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}
				} else {
					System.out.print("0");
				}
			}
		}
		System.out.println();
		sc.close();
	}
}
