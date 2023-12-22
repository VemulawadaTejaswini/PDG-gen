import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = reader.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = reader.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j <= i; j++) {
				tmp += A[j];
			}
			for (int j = i; j < N; j++) {
				tmp += B[j];
			}
			ans = Math.max(ans, tmp);
		}


		System.out.print(ans);
		reader.close();
	}
}



