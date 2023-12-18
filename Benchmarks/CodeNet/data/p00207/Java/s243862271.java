import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0207
	static class Block{
		int[][] field;
		int w, h;
		int ys, xs, yg, xg;
		int[] dir_y = {0, 1, 0,-1};
		int[] dir_x = {1, 0,-1, 0};
		boolean ans = false;

		void print_answer() {
			for(;;) {
				w = sc.nextInt(); h = sc.nextInt();
				if(w == 0 && h == 0) break;
				// fieldと座標を合わせるための-1
				xs = sc.nextInt()-1; ys = sc.nextInt()-1;
				xg = sc.nextInt()-1; yg = sc.nextInt()-1;
				int n = sc.nextInt();

				field = new int[h][w];

				for(int i=0; i<n; i++) {
					int[] block = new int[4];
					for(int j=0; j<4; j++) {block[j] = sc.nextInt();}
					setBlock(block);
				}

				searchField(ys, xs);

				if(ans) System.out.println("OK");
				else System.out.println("NG");
			}
		}

		// bk = {color, dir, x, y};
		void setBlock(int[] bk) {
			if(bk[1] == 0) {
				for(int i=0; i<2; i++) {
					for(int j=0; j<4; j++) {
						field[bk[3]-1 + i][bk[2]-1 + j] = bk[0];
					}
				}
			}else if(bk[1] == 1) {
				for(int i=0; i<4; i++) {
					for(int j=0; j<2; j++) {
						field[bk[3]-1 + i][bk[2]-1 + j] = bk[0];
					}
				}
			}
		}

		void searchField(int y, int x) {
			if(y == yg && x == xg) ans = true;
			else {
				for(int i=0; i<4; i++) {
					int ny = y + dir_y[i], nx = x + dir_x[i];
					if(ny >= 0 && nx >= 0 && ny < h && nx < w) {
						if(field[ny][nx] == field[ys][xs] && field[ny][nx] != -1) {
							field[ny][nx] = -1;
							searchField(ny, nx);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Block b = new Block();
		b.print_answer();
	}
}