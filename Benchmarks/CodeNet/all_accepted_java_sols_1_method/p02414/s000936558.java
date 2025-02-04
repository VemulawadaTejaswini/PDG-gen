import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int A[][] = new int[n][m];
		int B[][] = new int[m][l];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < l ; j++){
				B[i][j] = scan.nextInt();
			}
		}
		long output[][] = new long[n][l];

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				for(int k = 0 ; k < l ; k++){
					output[i][k] += A[i][j]*B[j][k];
				}
			}
		}

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < l-1 ; j++){
				System.out.print(output[i][j]+" ");
			}
			System.out.println(output[i][l-1]);
		}
	}
}