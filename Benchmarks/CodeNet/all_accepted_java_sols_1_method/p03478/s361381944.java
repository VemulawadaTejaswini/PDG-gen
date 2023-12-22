import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int totalSum = 0;
		for (int i=1; i<=N; i++) {
			int sum = 0;

			int num = i;
			while (num != 0) {
				int hitoketame = num % 10;
				sum += hitoketame;
				num = num / 10;
			}

			if (sum >= A && sum <= B) {
				totalSum += i;
			}
		}

		System.out.println(totalSum);

	}

}
