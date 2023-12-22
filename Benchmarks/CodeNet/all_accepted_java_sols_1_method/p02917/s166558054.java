import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int B[] = new int[N - 1];
		int sum = 0;
		
		for (int i  = 0; i < N - 1; i++) {
			B[i] = scanner.nextInt();
		}
		/*
		System.out.println(N);
		for (int k = 0; k < N - 1; k++) {
			System.out.println(B[k]);
		}*/
		sum += B[0];
		sum += B[0];
		for (int j = 1; j < N - 1; j++) {
			sum += B[j];
			if (B[j - 1] > B[j]) {
				sum -= B[j - 1];
				sum += B[j];
			}
		}
		System.out.println(sum);
	}
}
