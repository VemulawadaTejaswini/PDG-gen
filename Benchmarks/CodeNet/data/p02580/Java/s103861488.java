import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int m = in.nextInt();
				
		int[][] count = new int[h][w];
		for (int i = 0; i < m; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			for (int j = 0; j < w; j++) {
				count[r - 1][j]++;
			}
			for (int j = 0; j < h; j++) {
				count[j][c - 1]++;
			}
			count[r - 1][c - 1]--;
		}
		
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				max = Math.max(max, count[i][j]);
			}
		}
		
		System.out.println(max);
		
		in.close();
	}
}
