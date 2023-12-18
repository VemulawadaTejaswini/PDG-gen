import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0118
	static class PropertyDistribution {
		int h, w;
		char[][] field;
		int[] dir_y = {-1, 0, 1, 0};
		int[] dir_x = { 0, 1, 0,-1};
		Stack<Point> stack;

		void print_divideNum() {
			for(;;) {
				h = sc.nextInt();
				w = sc.nextInt();
				if(h == 0 || w == 0) break;
				String[] str = new String[h];
				for(int i=0; i<h; i++) {str[i] = sc.next();}

				field = new char[h][w];
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {field[i][j] = str[i].charAt(j);}
				}

				stack = new Stack<Point>();
				int count = 0;
				for(int y=0; y<h; y++) {
					for(int x=0; x<w; x++) {
						if(field[y][x] != 'X') {
							count++;
							searchField(new Point(y, x), field[y][x]);
						}
					}
				}
				System.out.println(count);
			}
		}

		void searchField(Point p, char mark) {
			stack.push(p);
			while(!stack.empty()) {
				Point point = stack.pop();
				for(int i=0; i<4; i++) {
					int ny = point.y + dir_y[i], nx = point.x + dir_x[i];
					if(ny >= 0 && nx >= 0 && ny < h && nx < w) {
						if(field[ny][nx] == mark) {
							stack.push(new Point(ny, nx));
							field[ny][nx] = 'X';
						}
					}
				}
			}
		}

		static class Point {
			public int y, x;
			public Point(int y, int x) {
				this.y = y; this.x = x;
			}
		}
	}

	public static void main(String[] args) {
		PropertyDistribution pd = new PropertyDistribution();
		pd.print_divideNum();
	}
}