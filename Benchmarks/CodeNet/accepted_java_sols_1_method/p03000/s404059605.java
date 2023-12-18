import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = 0, s = 0, k = 1;
		for (int i = 1; i <= n; i++) {
			t = sc.nextInt();
			s += t;
			if (s <= x) {
				k++;
			}

		}
		System.out.println(k);
	}

}