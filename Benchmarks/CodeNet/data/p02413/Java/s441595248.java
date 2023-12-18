import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] cell=new int[r+1][c+1];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				cell[i][c]=sc.nextInt();
			}
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.printf("%d ", cell[i][j]);
			}
			System.out.println();
		}
	}
}

