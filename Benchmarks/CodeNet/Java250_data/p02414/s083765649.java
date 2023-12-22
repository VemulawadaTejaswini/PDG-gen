import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int mat1[][] = new int[n][m];
		int mat2[][] = new int[m][l];
		long res;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				mat1[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				mat2[i][j] = scan.nextInt();
			}
		}
		scan.close();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				res = 0;
				for(int k = 0; k < m; k++){
					res += mat1[i][k] * mat2[k][j];
				}
				System.out.print(res);
				if(j != l - 1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}