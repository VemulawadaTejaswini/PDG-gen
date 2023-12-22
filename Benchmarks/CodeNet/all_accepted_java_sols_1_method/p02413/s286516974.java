import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] cell = new int[r+1][c+1];
		int sum1 = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				cell[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.printf("%d ", cell[i][j]);
				sum1 += cell[i][j];
			}
			System.out.printf("%d\n", sum1);
			sum1 = 0;
		}
		int sum2 = 0;
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				sum1 += cell[j][i];
			}
			sum2 += sum1;
			System.out.printf("%d ", sum1);
			sum1 = 0;
		}
		System.out.printf("%d\n",sum2);
	}
}

