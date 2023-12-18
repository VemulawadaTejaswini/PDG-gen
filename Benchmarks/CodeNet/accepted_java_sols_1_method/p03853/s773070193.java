import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] grid = new char[H][W];
		
		for (int i=0; i<H; i++) {
			char[] c = sc.next().toCharArray(); 
			for (int j=0; j<W; j++) {
				grid[i][j] = c[j];
			}
		}
		for (int i=0; i<H; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j=0; j<W; j++) {
				sb.append(grid[i][j]);
			}
			System.out.println(sb);
			System.out.println(sb);
		}
	}
}
