import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] matrix_A = new int[n][m];
		int[] matrix_B = new int[m];
		int[] matrix_C = new int[n];
		for(int i = 0; i<n; i++){
			for(int j = 0;j<m;j++){
				int matrix_element = scan.nextInt();
				matrix_A[i][j] = matrix_element;
			}
		}

		for(int i=0;i<m;i++){
			int matrix_element2 = scan.nextInt();
			matrix_B[i] = matrix_element2;
		}

		for(int i = 0;i<n; i++){
			for(int j = 0; j<m; j++){
				matrix_C[i] = matrix_C[i]+matrix_A[i][j] * matrix_B[j];
			}
		}

		for(int i = 0; i<matrix_C.length; i++){
			System.out.println(matrix_C[i]);
		}  
	}
}