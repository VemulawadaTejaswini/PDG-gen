import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);

		long p = 1;
		for (int i = 0; i < n; ++i) {
			if (a[i] == 0) {
				System.out.println(0);
				return;
			}

			if (1000000000000000000L / p >= a[i]) {
				p *= a[i];
			} else {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(p);

	}

}
