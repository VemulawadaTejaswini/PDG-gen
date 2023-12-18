import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		Long min = 1000001L;
		Long max = -1000001L;
		Long sum = 0L;

		for (Integer i = 0; i < n; i++) {
			Long a = sc.nextLong();

			if (a < min) {
				min = a;
			}

			if (a > max) {
				max = a;
			}

			sum += a;

		}

		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
		System.out.print(" ");
		System.out.println(sum);

	}
}
