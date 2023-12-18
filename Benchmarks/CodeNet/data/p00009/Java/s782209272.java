import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int x = 0;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				int y = i % j;
				if (y == 0) {
					x = x + 1;
					break;
				}
			}
		}
		System.out.println(n-x-1);
	}
}