import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();
		final int l = sc.nextInt();
		
		int[][] mat1 = new int[n][m];
		int[][] mat2 = new int[m][l];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				mat1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				mat2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int k = 0; k < l; k++){
				long sum = 0;
				
				for(int j = 0; j < m; j++){
					sum += mat1[i][j] * mat2[j][k];
				}
				
				System.out.print((k == 0 ? "" : " ") + sum);
			}
			System.out.println();
		}
	}

}