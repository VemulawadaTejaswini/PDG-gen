import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int mat[][] = new int[n][m];
		int vec[] = new int[m];
		int res;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				mat[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			vec[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < n; i++){
			res = 0;
			for(int j = 0; j < m; j++){
				res += mat[i][j] * vec[j];
			}
			System.out.println(res);
		}
	}
}