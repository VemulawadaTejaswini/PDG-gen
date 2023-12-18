import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int sum = 1;

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();

		int min = P[0];

		for (int i = 0; i < N - 1; i++) {
			if (min >= P[i + 1]) {
				sum++;
				min = P[i + 1];
			}

		}
		System.out.println(sum);
	}
}