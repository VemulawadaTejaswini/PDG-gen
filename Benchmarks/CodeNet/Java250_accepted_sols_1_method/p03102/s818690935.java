
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();

		int[] B = new int[M];
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int num = 0;
		long sum = 0;
		int count = 0;
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			sum = 0;
			for(int j = 0; j < M; j++) {
				num = sc.nextInt();
				A[i][j] = B[j] * num;
				sum += A[i][j];
			}
			if(sum + C > 0) {
				count++;
			}
		}

		System.out.println(count);

	}

}
