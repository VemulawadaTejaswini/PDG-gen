import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		int sum = 0;
		long a = 1;
		long b = 0;
		sc.close();

		while (H > 1) {
			H = H / 2;
			sum++;
		}
		for (int i = 0; i < sum; i++) {
			a = 2 * a;
			b += a;
		}
		System.out.println(b + 1);
	}
}
