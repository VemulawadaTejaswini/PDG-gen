
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];

		//??????A?????£??\
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		//??????B?????£??\
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				B[i][j] = sc.nextInt();
			}
		}


/*

		//???????¢??????¨ A?????????
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("A[i][j] = "+ A[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("###################################");

		//???????¢??????¨ B?????????
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				System.out.print("B[i][j] = "+ B[i][j]+" ");
			}
			System.out.println("");
		}
*/
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					C[i][j] += (long)A[i][k] * (long)B[k][j];
				}
				if(j+1 == l) {
					System.out.print(C[i][j]);
				}
				else {
					System.out.print(C[i][j]+" ");
				}
			}
			System.out.println("");
		}
	}
}