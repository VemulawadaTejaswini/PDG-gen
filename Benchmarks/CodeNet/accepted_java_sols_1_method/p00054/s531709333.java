import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, n;
		int sum;

		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			a %= b;
			a *= 10;
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a / b;
				a %= b;
				a *= 10;
			}
			System.out.println(sum);
		}
	}
}