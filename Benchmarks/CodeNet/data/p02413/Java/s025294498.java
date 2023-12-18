import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r+1][c+1];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][c] += a[i][j];
			}
		}
		for(int j=0; j<=c; j++) {
			for(int i=0; i<r; i++) {
				a[r][j] += a[i][j];
			}
		}

		for(int i=0; i<= r; i++) {
			for(int j=0; j<=c; j++) {
				if(j==0)	System.out.printf("%d", a[i][j]);
				else		System.out.printf(" %d",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
