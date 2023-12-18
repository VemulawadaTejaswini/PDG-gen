import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double answer = 0;

		for (int i = 1; i <= N; i++) {
			int sum = i;
			int count = 0;
			while (sum <= K - 1) {
				sum *= 2;
				count++;
			}

			answer += (double)1/N * Math.pow((double)1/2, count);

		}

		System.out.println(answer);

	}
}
