import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat_A = new int[n][m];
		int[] mat_B = new int[m];
		int[] mat_C = new int[n];

		for(int i = 0; i<n; i++){
			for(int j = 0;j<m;j++){
				int mat_element = sc.nextInt();
				mat_A[i][j] = mat_element;
			}
		}

		for(int i=0;i<m;i++){
			int mat_element2 = sc.nextInt();
			mat_B[i] = mat_element2;
		}

		for(int i = 0;i<n; i++){
			for(int j = 0; j<m; j++){
				mat_C[i] += mat_A[i][j] * mat_B[j];
			}
		}

		for(int i = 0; i<mat_C.length; i++){
			System.out.println(mat_C[i]);
		}
	}
}

