import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		while (k-- > 0) {
			int a = in.nextInt() - 1;
			if (a > n / 2) {
				a = n - (a + 1);
			}
			int b = in.nextInt() - 1;
			if (b > n / 2) {
				b = n - (b + 1);
			}
			System.out.println(Math.min(a, b) % 3 + 1);
		}
	}
}