import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int r = sc.nextInt();
		final int c = sc.nextInt();
		
		int[][] matrix = new int[r + 1][c + 1];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < r; i++){
			
			int r_sum = 0;
			for(int j = 0; j < c; j++){
				r_sum += matrix[i][j];
			}
			
			matrix[i][c] = r_sum;
		}
		
		for(int j = 0; j <= c; j++){
			
			int c_sum = 0;
			for(int i = 0; i < r; i++){
				c_sum += matrix[i][j];
			}
			
			matrix[r][j] = c_sum;
		}
		
		for(int i = 0; i <= r; i++){
			for(int j = 0; j <= c; j++){
				if(j != 0){
					System.out.print(" ");
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}