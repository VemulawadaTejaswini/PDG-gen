import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] cell = new int[r+1][c+1];

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				cell[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				cell[i][c] += cell[i][j];
				cell[r][j] += cell[i][j];
				System.out.printf("%d ",cell[i][j]);
			}
			System.out.println(cell[i][c]);
			cell[r][c] += cell[i][c];
		}
		for(int i = 0; i < c; i++) {
			System.out.printf("%d ",cell[r][i]);
//			cell[r][c] += cell[r][i];
		}
		
		System.out.println(cell[r][c]);
		

	}
}

