import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n,m,l;
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		int matrix_a[][] = new int[n][m];
		int matrix_b[][] = new int[m][l];
		int matrix_c[][] = new int[n][l];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				matrix_c[i][j] = 0;
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matrix_a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				matrix_b[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					matrix_c[i][j] += matrix_a[i][k] * matrix_b[k][j];
				}
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				System.out.print(matrix_c[i][j]);
				if(j + 1 != l){
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}