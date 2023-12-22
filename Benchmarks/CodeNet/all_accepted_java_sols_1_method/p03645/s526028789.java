import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] flg1 = new boolean[n];
		boolean[] flgN = new boolean[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				flg1[b] = true;
			}
			if (b == n) {
				flgN[a] = true;
			}
		}
		sc.close();

		for (int i = 2; i < n; i++) {
			if (flg1[i] && flgN[i]) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
