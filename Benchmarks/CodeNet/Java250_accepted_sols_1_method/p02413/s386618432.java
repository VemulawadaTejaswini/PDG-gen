import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r= stdIn.nextInt();
		int c= stdIn.nextInt();
		int x[][] = new int[r+1][c+1];
		for(int i=0;i<r; i++) {
			for(int j=0;j<c; j++) {
				x[i][j] = stdIn.nextInt();
				x[i][c] +=x[i][j];
				x[r][j] +=x[i][j];
				x[r][c] +=x[i][j];
			}
		}
		stdIn.close();
		for(int i=0;i<r+1; i++) {
			for(int j=0;j<c+1; j++) {
				System.out.print(x[i][j]);
				if (j<c) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

