import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		long[] a = new long[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			if (a[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		long b = a[0];
		for (int i = 1; i < N; i++) {
			if (a[i] <= 1000000000000000000L / b) {
				b *= a[i];
			} else {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(b);
	}
}