import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int h = sc.nextInt(); int w = sc.nextInt();
		int[][] ar = new int[h+1][w+1];
		for (int i=0; i<h; i++) {
			int sum = 0;
			for (int j=0; j<w+1; j++) {
				if (j == w) ar[i][w] = sum;
				else {
					ar[i][j] = sc.nextInt();
					sum += ar[i][j];
				}
			}
		}
		
		for (int i=0; i<w+1; i++) {
			int sum = 0;
			for (int j=0; j<h+1; j++) {
				if (j == h) ar[h][i] = sum;
				else sum += ar[j][i];
			}
		}
		
		for (int i=0; i<h+1; i++) {
			for (int j=0; j<w+1; j++) {
				System.out.print((j==0?"":" ")+ar[i][j]);
			}
			System.out.println();
		}
	}
}
