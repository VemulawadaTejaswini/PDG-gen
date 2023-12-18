import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k;
		int sum;

		k = sc.nextInt();
		while (k != 0) {
			sum = 0;
			for (int i = 0; i < k * (k - 1) / 2; i++) {
				sum += sc.nextInt();
			}
			if (1 < k) {
				sum /= (k - 1);
			}

			System.out.println(sum);
			k = sc.nextInt();
		}
	}
}