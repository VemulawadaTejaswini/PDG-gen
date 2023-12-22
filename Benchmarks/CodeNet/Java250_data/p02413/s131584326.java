import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_sum=0;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] cell=new int[r+1][c+1];
		for(int i=0; i<r; i++) {
			int sum=0;
			for(int j=0; j<c; j++) {
				cell[i][j]=sc.nextInt();
				sum+=cell[i][j];
				cell[r][j]+=cell[i][j];
			}
			cell[i][c]=sum;
			
			total_sum+=sum;
		}
		cell[r][c]=total_sum;
		
		for(int i=0; i<r+1; i++) {
			for(int j=0; j<c; j++) {
				System.out.printf("%d ", cell[i][j]);
			}
			System.out.printf("%d", cell[i][c]);
			System.out.println();
		}
	}
}

