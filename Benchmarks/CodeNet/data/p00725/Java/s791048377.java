import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	class Pair {
		int x, y;
		int d[][];
		Pair() {
			d	= new int[h][w];
		}
		Pair(Pair pair) {
			d	= new int[h][w];
			x = pair.x;
			y = pair.y;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					d[i][j] = pair.d[i][j];
				}
			}
		}
		void print_d() {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (d[i][j] == MAX) System.out.print("_ ");
					else if (d[i][j] == VAL_1) System.out.print("X ");
					else System.out.print(d[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	final int MAX = Integer.MAX_VALUE;
	final int VAL_1 = Integer.MAX_VALUE - 1;
	int w, h;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) break;

			Pair pair = new Pair();
			
			int gy = 0, gx = 0;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String str = scan.next();
					pair.d[i][j] = MAX;
					if (str.charAt(0) == '1') {
						pair.d[i][j] = VAL_1;
					} else if (str.charAt(0) == '2') {
						pair.y = i;
						pair.x = j;
						pair.d[i][j] = 0;
					} else if (str.charAt(0) == '3') {
						gy = i;
						gx = j;
					}
				}
			}
			
			Queue<Pair> que = new ArrayDeque<Pair>();
			que.add(pair);
label:		while (!que.isEmpty()) {
				Pair p = que.poll();
				
				if (p.d[p.y][p.x] == 10) {
					if (que.isEmpty()) {
						System.out.println(-1);
						break;
					}
					continue;
				}
				
				int x, y;

				x = p.x;
				if (x + 1 < w && p.d[p.y][x + 1] != VAL_1) {
					while (x + 1 < w) {
						x++;
						if (x == gx && p.y == gy) {
							System.out.println(p.d[p.y][p.x] + 1);
							break label;
						}
						if (x < w && p.d[p.y][x] == VAL_1) {
							Pair p_copy = new Pair(p);
							p_copy.d[p.y][x] = MAX;
							p_copy.d[p.y][x - 1] = p.d[p.y][p.x] + 1;
							p_copy.y = p.y; p_copy.x = x - 1;
							que.add(p_copy);
							break;
						}
					}
				}
				
				x = p.x;
				if (x - 1 >= 0 && p.d[p.y][x - 1] != VAL_1) {
					while (x - 1 >= 0) {
						x--;
						if (x == gx && p.y == gy) {
							System.out.println(p.d[p.y][p.x] + 1);
							break label;
						}
						if (x >= 0 && p.d[p.y][x] == VAL_1) {
							Pair p_copy = new Pair(p);
							p_copy.d[p.y][x] = MAX;
							p_copy.d[p.y][x + 1] = p.d[p.y][p.x] + 1;
							p_copy.y = p.y; p_copy.x = x + 1;
							que.add(p_copy);
							break;
						}
					}
				}
				
				
				y = p.y;
				if (y + 1 < h && p.d[y + 1][p.x] != VAL_1) {
					while (y + 1 < h) {
						y++;
						if (p.x == gx && y == gy) {
							System.out.println(p.d[p.y][p.x] + 1);
							break label;
						}
						if (y < h && p.d[y][p.x] == VAL_1) {
							Pair p_copy = new Pair(p);
							p_copy.d[y][p.x] = MAX;
							p_copy.d[y - 1][p.x] = p.d[p.y][p.x] + 1;
							p_copy.y = y - 1; p_copy.x = p.x;
							que.add(p_copy);
							break;
						}
					}
				}
				
				y = p.y;
				if (y - 1 >= 0 && p.d[y - 1][p.x] != VAL_1) {
					while (y - 1 >= 0) {
						y--;
						if (p.x == gx && y == gy) {
							System.out.println(p.d[p.y][p.x] + 1);
							break label;
						}
						if (y >= 0 && p.d[y][p.x] == VAL_1) {
							Pair p_copy = new Pair(p);
							p_copy.d[y][p.x] = MAX;
							p_copy.d[y + 1][p.x] = p.d[p.y][p.x] + 1;
							p_copy.y = y + 1; p_copy.x = p.x;
							que.add(p_copy);
							break;
						}
					}
				}
				
				
				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}