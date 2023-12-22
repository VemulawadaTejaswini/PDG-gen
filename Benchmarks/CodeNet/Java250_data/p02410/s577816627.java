import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int sum;
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int matrix_A[][] = new int[n][m];
		int Vector_b[] = new int[m];
		int Vector_c[] = new int[n];
		
		for( int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix_A[i][j] = scan.nextInt();
			}
		}
		
		for( int i = 0; i < m; i++) {
			Vector_b[i] = scan.nextInt();
		}
		
		for( int i = 0; i < n; i++) {
			sum = 0;
			for( int j = 0; j < m; j++) {
				sum += matrix_A[i][j] * Vector_b[j];
			}
			Vector_c[i] = sum;
			System.out.println(Vector_c[i]);
		}
		
	}
}

