import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[][] matrix = new int[10][10];
			
			for(int i = 1 ; i <= n ; i++ ) {
				String iStr = String.valueOf(i);
				char first = iStr.charAt(0);
				char last = iStr.charAt(iStr.length()-1);
				
				int x = first - '0';
				int y = last - '0';
				matrix[x][y]++;
			}
			
			long count = 0;
			for(int i = 1 ; i <= 9 ; i++) {
				for(int j = 1; j <= 9 ; j++ ) {
					if ( i == j && matrix[i][j] > 0 ){
						count += Math.pow(matrix[i][j],2); 
					}
					else {
						count += matrix[i][j] * matrix[j][i];
					}
				}
			}
			
			System.out.println(count);
		}
	}
}