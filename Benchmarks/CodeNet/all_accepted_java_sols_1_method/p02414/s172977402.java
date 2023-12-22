import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				B[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					C[i][j] += (long) A[i][k] * (long) B[k][j];
				}
				if(j != l -1){
					System.out.printf("%d ", C[i][j]);
				} else{
					System.out.printf("%d\n", C[i][j]);
				}
			}
		}
	}
}