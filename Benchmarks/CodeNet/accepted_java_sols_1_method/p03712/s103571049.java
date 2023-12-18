import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] grid = new char[H][W];
		for (int i=0; i<H; i++) {
			char[] t = sc.next().toCharArray();
			grid[i] = t;
		}
		for (int i=-1; i<=H; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j=-1; j<=W; j++) {
				if (i==-1) sb.append("#");
				else if (j==-1) sb.append("#");
				else if (i==H) sb.append("#");
				else if (j==W) sb.append("#");
				else sb.append(grid[i][j]);
			}
			System.out.println(sb.toString());
		}
	}
}
