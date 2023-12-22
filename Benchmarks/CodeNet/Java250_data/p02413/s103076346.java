import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int r ,c;
			r = scan.nextInt();
			c = scan.nextInt();
			int[][] matrix = new int[r + 1][c + 1];
			for(int i = 0; i < r ;i++){
				for(int j = 0 ; j < c;j++){
					matrix[i][j] = scan.nextInt();
				}
			}
			for(int i = 0 ;i < r;i++){
				int sum = 0;
				for(int j = 0; j < c;j++){
					sum += matrix[i][j];
				}
				matrix[i][c] = sum;
			}
			for(int i = 0 ; i <= c;i++){
				int sum = 0;
				for(int j = 0 ; j < r; j++){
					sum += matrix[j][i];
				}
				matrix[r][i] = sum;
			}
			for(int i = 0 ; i < matrix.length;i++){
				System.out.print(matrix[i][0]);
				for(int j = 1 ; j < matrix[i].length;j++){
					System.out.print(" " + matrix[i][j]);
				}
				System.out.println();
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}