import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int a = 1;

			for (int i = 1; i <= n; i++) {
				if (a < k) {
					a = a + a;
				} else {
					a = a + k;
				}
			}
			System.out.println(a);
		}
	}
}