import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int[] vector = new int[m];
		for(int i = 0; i < m; i++){
			vector[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			int sum = 0;
			
			for(int j = 0; j < m; j++){
				sum += matrix[i][j] * vector[j];
			}
			
			System.out.println(sum);
		}
		
		
		
		
	}

}