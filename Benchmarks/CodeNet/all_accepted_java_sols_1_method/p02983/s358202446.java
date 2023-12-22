import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();

		long min = 9999;

		for (long i = l; i < r; i++) {
			for (long j = i + 1; j <= r; j++) {
				long num = (i * j) % 2019;
				if (min > num) {
					min = num;
					if (min == 0) {
						System.out.println(min);
						return;
					}
				}
			}
		}

		System.out.println(min);

	}

}
