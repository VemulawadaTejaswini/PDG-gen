

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int total = 0;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int A = 0;
		int Bs[] = new int[M];
		int count = 0;
		for (int i = 0; i < M; i++) {
			Bs[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A = sc.nextInt();
				total += A * Bs[j];

			}
			total += C;
			if (total > 0) {
				count++;
			}
			total = 0;
		}
		
		System.out.println(count);

	}

}
