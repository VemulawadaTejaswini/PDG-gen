import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0 ; j < N ; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int sum = A[0][0];
		for (int j = 0 ; j < N ; j++) {
			sum += A[1][j];
		}
		
		int max = sum;
		for (int j = 1 ; j < N ; j++ ) {
			sum += A[0][j];
			sum -= A[1][j - 1];
			if ( max < sum ) {
				max = sum;
			}
		}

		System.out.println(max);
	}
}
