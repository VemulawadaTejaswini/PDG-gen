import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][][] ar = new int[4][3][10];
		for ( int i = 0; i < n; i++) {
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			ar[b-1][f-1][r-1] += v;
		}
		for (int b = 0; b < 4; b++) {
			for (int i = 0; i < 3; i++) {
				for(int j = 0; j < 10; j++){
					System.out.print(" " + ar[b][i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");
		}
	}
}