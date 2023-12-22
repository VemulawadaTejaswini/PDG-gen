import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] sheet = new int[r + 1][c + 1];
		int sum = 0;
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				sheet[i][j] = scan.nextInt();
				sum += sheet[i][j];
				sheet[r][j] += sheet[i][j];
				sheet[i][c] += sheet[i][j];
			}
		}
		sheet[r][c] = sum;

		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				if(j != c){
					System.out.printf("%d ", sheet[i][j]);
				} else{
					System.out.printf("%d\n", sheet[i][j]);
				}
			}
		}
	}
}