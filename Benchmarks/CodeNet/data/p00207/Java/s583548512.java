import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0207
	static class Block{
		void print_answer() {
			for(;;) {
				int w = sc.nextInt(), h = sc.nextInt();
				if(w == 0 && h == 0) break;
				// fieldと座標を合わせるための-1
				int xs = sc.nextInt()-1, ys = sc.nextInt()-1,
					xg = sc.nextInt()-1, yg = sc.nextInt()-1;
				int n = sc.nextInt();

				int[][] field = new int[h][w];
				for(int i=0; i<n; i++) {
					int[] block = new int[4];
					for(int j=0; j<4; j++) {block[j] = sc.nextInt();}
					if(block[1] == 0) {
						for(int j=0; j<2; j++) {
							for(int k=0; k<4; k++) {
								field[block[3]-1 + j][block[2]-1 + k] = block[0];
							}
						}
					}else if(block[1] == 1) {
						for(int j=0; j<4; j++) {
							for(int k=0; k<2; k++) {
								field[block[3]-1 + j][block[2]-1 + k] = block[0];
							}
						}
					}
				}

				Queue<Point> que = new LinkedList<Point>();
				Point start = new Point(ys, xs);
				Point goal = new Point(yg, xg);
				que.offer(start);

				int[] dir_y = {-1, 0, 1, 0};
				int[] dir_x = { 0, 1, 0,-1};
				boolean ans = false;
				int mark = field[start.y][start.x];
				while(!que.isEmpty()) {
					Point point = que.poll();
					if(point.y == goal.y && point.x == goal.x) {
						ans = true;
						break;
					}
					for(int i=0; i<4; i++) {
						int ny = point.y + dir_y[i], nx = point.x + dir_x[i];
						if(ny >= 0 && nx >= 0 && ny < h && nx < w) {
							if(field[ny][nx] == mark && field[ny][nx] != 0) {
								que.offer(new Point(ny, nx));
								field[ny][nx] = -1;
							}
						}
					}
				}
				if(ans) System.out.println("OK");
				else System.out.println("NG");
			}
		}
	}

	static class Point {
		public int y, x;
		public Point(int y, int x) {
			this.y = y; this.x = x;
		}
	}

	public static void main(String[] args) {
		Block b = new Block();
		b.print_answer();
	}
}