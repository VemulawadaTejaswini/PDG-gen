import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		int C = reader.nextInt();
		int[] B = new int[M];
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			B[i] = reader.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int result = C;
			for (int j = 0; j < M; j++) {
				 result += B[j] * reader.nextInt();
			}
			if (result > 0) {
				count++;
			}
		}
		System.out.print(count);
	}
}

