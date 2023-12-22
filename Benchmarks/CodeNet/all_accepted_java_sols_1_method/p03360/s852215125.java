import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 1;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();
			sum += tmp;
			if (tmp > max) {
				max = tmp;
			}
		}
		sum -= max;

		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			max *= 2;
		}

		System.out.println(sum + max);

		sc.close();
	}
}
