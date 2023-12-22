import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int mat[][] = new int[r + 1][c + 1];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				mat[i][j] = scan.nextInt();
				mat[i][c] += mat[i][j];
				mat[r][j] += mat[i][j];
				mat[r][c] += mat[i][j];
			}
		}
		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				System.out.print(mat[i][j]);
				if(j != c){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}