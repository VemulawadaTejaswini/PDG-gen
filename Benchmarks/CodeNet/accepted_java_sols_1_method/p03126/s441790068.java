import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int food[] = new int[M + 1];

		for (int i = 0; i < food.length; i++) {
			food[i] = 0;
		}

		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			for (int j = 0; j < K; j++) {
				food[sc.nextInt()] += 1;
			}
		}

		int sum = 0;
		for (int i = 0; i < food.length; i++) {
			if (food[i] == N) {
				sum++;
			}
		}

		System.out.println(sum);
	}
}