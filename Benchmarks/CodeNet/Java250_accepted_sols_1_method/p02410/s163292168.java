import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] b = new int[m];
		int[][] A = new int[n][m];
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			b[i] = scan.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				c[i] += A[i][j] * b[j];
			}
			System.out.printf("%d\n", c[i]);
		}
	}
}