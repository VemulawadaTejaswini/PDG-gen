import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		long min = Long.MAX_VALUE;

		for (int i = 0; i <= 100000; i++) {
			long amount = 0;
			amount = i * 2 * C + Math.max(0, X-i) * A + Math.max(0, Y-i) * B;
			min = Math.min(min, amount);
		}

		System.out.println(min);

	}
}
