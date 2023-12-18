import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			a = sc.nextInt();
			if (i % 2 != 0 && a % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}