import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A[] = new double[N];
		double answer = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			answer += 1 / A[i];
		}

		System.out.println(1 / answer);
	}
}
