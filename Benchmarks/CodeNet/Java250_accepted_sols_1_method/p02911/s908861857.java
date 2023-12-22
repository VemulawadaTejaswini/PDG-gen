import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// N人の参加者
		int N = scan.nextInt();
		// Kポイント
		int K = scan.nextInt();

		int Q = scan.nextInt();

		int a[] = new int[N];

		for(int i = 0; i < Q; i++) {
			int b = scan.nextInt();
			a[b - 1]++;
		}
		for (int i = 0; i < N; i++) {
			if (K - (Q - a[i]) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}