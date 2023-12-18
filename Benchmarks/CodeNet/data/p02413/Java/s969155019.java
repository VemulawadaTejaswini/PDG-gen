
import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] cell=new int[r+1][c+1];
		for (int i=0 ;i<r ;i++) {
			for (int j=0; j < c ; j++) {
				cell[i][j]=sc.nextInt();
				cell[i][c]+=cell[i][j];
				cell[r][j]+=cell[i][j];
				cell[r][c]+=cell[i][j];
			}
		}
		for (int i = 0;i<r+1;i++) {
			for(int j=0;j<c+1;j++) {
				System.out.print(cell[i][j]);
				if(j!=c) System.out.print(" ");

			}
			System.out.println();
		}

	}
}
