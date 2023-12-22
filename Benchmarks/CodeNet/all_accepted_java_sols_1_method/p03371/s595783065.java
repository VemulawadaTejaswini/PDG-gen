import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int result = Integer.MAX_VALUE;
		for (int i = 0; i <= x; i++) {
			int sum = 0;
			sum += i * a;
			int rx = x - i;
			if (rx > y) {
				sum += c * 2 * rx;
			} else {
				int diff = y - rx;
				sum += Math.min(c * 2 * rx + diff * b, c * 2 * y);
			}
			result = Math.min(sum, result);
		}
		System.out.println(result);
		sc.close();
	}
}