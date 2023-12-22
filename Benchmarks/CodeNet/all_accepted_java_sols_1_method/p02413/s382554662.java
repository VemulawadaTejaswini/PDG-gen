import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] table = new int[r + 1][c + 1];
		int sum = 0;

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				int n = scan.nextInt();
				table[i][j] = n;
				table[i][c] += n;
				table[r][j] += n;
				sum += n;
			}
		}
		table[r][c] = sum;

		for(int i = 0; i < r + 1; i++){
			for(int j = 0; j < c + 1; j++){
				System.out.printf((j != c) ? "%d " : "%d\n", table[i][j]);
			}
		}
	}
}