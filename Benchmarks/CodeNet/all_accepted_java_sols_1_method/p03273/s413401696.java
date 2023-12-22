import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		boolean[] row = new boolean[H]; Arrays.fill(row, false);
		boolean[] col = new boolean[W]; Arrays.fill(col, false);
		char[][] a = new char[H][W];
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) a[i][j] = s.charAt(j);
		}
		/* look at i-th row */
		for(int i = 0; i < H; i++) {
			boolean check = true;
			for(int j = 0; j < W; j++) if(a[i][j] == '#') check = false;
			row[i] = check;
		}
		/* look at j-th col */
		for(int j = 0; j < W; j++) {
			boolean check = true;
			for(int i = 0; i < H; i++) if(a[i][j] == '#') check = false;
			col[j] = check;
		}
		for(int i = 0; i < H; i++) {
			if(row[i]) continue;
			for(int j = 0; j < W; j++) {
				if(col[j]) continue;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}