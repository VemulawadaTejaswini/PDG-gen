import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) break;
			char [][]cell = new char[H][W];
			for(int i = 0; i < H; i++) {
				String s = sc.next();
				for(int j = 0; j < W; j++) {
					cell[i][j] = s.charAt(j);
				}
			}
			boolean [][]vis = new boolean[H][W];
			int h = 0;
			int r = 0;
			while(true) {
				if(cell[h][r] == '.') {
					System.out.printf("%d %d\n", r, h);
					break;
				}
				if(vis[h][r]) {
					System.out.println("LOOP");
					break;
				}
				vis[h][r] = true;
				if(cell[h][r] == '>') {
					r++;
				}else if(cell[h][r] == '<') {
					r--;
				}else if(cell[h][r] == '^') {
					h--;
				}else if(cell[h][r] == 'v'){
					h++;
				}

			}
		}
		sc.close();
	}
}
