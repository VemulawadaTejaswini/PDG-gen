
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		int[] vec = new int[n];
		for(int i = 0; i < m; i++){
			for(int k = 0; k < n; k++){
				mat[i][k] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++){
			vec[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			int c = 0;
			for(int k = 0; k < n; k++){
				c += mat[i][k] * vec[k];
			}
			System.out.println(c);
		}
	}
}

