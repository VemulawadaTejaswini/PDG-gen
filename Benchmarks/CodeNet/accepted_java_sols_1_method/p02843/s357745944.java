import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int n = x / 99;
		for (int i = 1; i <= n; i++) {
			int a = x - 100 * i;
			if (0 <= a && a <= 5 * i) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}
