import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long num = sc.nextLong();

		long min = num;
		long max = num;
		long sum = num;

		for (int i = 1; i < N; i++) {
			num = sc.nextLong();
			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}
			sum += num;
		}

		System.out.println(min + " " + max + " " + sum);

	}
}

