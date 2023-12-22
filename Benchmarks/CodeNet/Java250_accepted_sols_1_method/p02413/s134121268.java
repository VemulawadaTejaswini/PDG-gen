import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] table = new int[r+1][c+1];
		for(int i=0; i<r+1; i++) {
			int sum_c = 0;
			for(int j=0; j<c+1; j++) {
				if(i != r && j != c) {
					table[i][j] = sc.nextInt();
					sum_c += table[i][j];
					System.out.print(table[i][j] + " ");
				} else if(j == c) {
					table[i][j] = sum_c;
					System.out.println(table[i][j]);
				} else {
					int sum_r = 0;
					for(int k=0; k<r; k++){
						sum_r += table[k][j];
					}
					table[i][j] = sum_r;
					sum_c += table[i][j];
					System.out.print(table[i][j] + " ");
				}
			}
		}
	}

}