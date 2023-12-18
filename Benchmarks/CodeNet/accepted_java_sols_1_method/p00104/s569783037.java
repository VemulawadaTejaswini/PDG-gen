import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		for(;;) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(W == 0 && H == 0) break;
			sc.skip("\n");
			String field[] = new String[H];
			for(int i = 0; i < H; i++) {
				field[i] = sc.nextLine();
			}
			// debug

			// System.out.println("before");
			// System.out.println(field[0]);
			// System.out.println("after");

			// end
			String cs = ">^<v.";
			int dx[] = {1, 0, -1, 0};
			int dy[] = {0, -1, 0, 1};

			boolean reach[][] = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					reach[i][j] = false;
				}
			}
			reach[0][0] = false;
			boolean loop = false;

			int x = 0, y = 0;
			for(;;) {
				char c = field[y].charAt(x);
				int idx = cs.indexOf(c);
				if(idx == 4) {
					break;
				}

				int nx = x + dx[idx];
				int ny = y + dy[idx];
				x = nx;
				y = ny;
				if(reach[y][x] == true) {
					loop = true;
					break;
				}
				reach[y][x] = true;
			}
			if(loop == true) System.out.println("LOOP");
			else System.out.printf("%d %d%n", x, y);
		}
	}
}