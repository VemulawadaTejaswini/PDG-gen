import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	class Pair {
		int x, y;
		Pair() {}
		Pair(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
	
	class Map {
		char cell[][];
		Map() {
			cell = new char[h][w];
		}
		
		Map(Map map) {
			cell = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					this.cell[i][j] = map.cell[i][j];
			}
		}
		
		void print_cell() {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					System.out.print(cell[i][j]);
				System.out.println();
			}
		}
	}
	
	class Distance {
		int cell[][];
		Distance() {
			cell = new int[h][w];
		}
		
		Distance(Distance d) {
			cell = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					this.cell[i][j] = d.cell[i][j];
			}
		}
		
		void print_d() {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (cell[i][j] == MAX) System.out.print("I ");
					else System.out.print(cell[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	final int MAX = Integer.MAX_VALUE;
	int w, h;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) break;

			Pair pair = new Pair();
			Map map = new Map();
			Distance dis = new Distance();
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String str = scan.next();
					dis.cell[i][j] = MAX;
					map.cell[i][j] = str.charAt(0);
					if (map.cell[i][j] == '2') {
						pair.y = i;
						pair.x = j;
						dis.cell[i][j] = 0;
					}
				}
			}
			
			Queue<Pair> que = new ArrayDeque<Pair>();
			Queue<Map> que_map = new ArrayDeque<Map>();
			Queue<Distance> que_d = new ArrayDeque<Distance>();
			que.add(pair);
			que_map.add(map);
			que_d.add(dis);
			while (!que.isEmpty()) {
				Pair p = que.poll();
				Map	m = que_map.poll();
				Distance d = que_d.poll();
				
				if (m.cell[p.y][p.x] == '3') {
					System.out.println(d.cell[p.y][p.x]);
					break;
				}
				
				if (d.cell[p.y][p.x] >= 10) {
					if (que.isEmpty()) {
						System.out.println(-1);
						break;
					}
					continue;
				}
				
				int x, y;
				
				x = p.x;
				while (x + 1 < w && m.cell[p.y][x + 1] != '1') x++;
				if (x != p.x && x + 1 < w && m.cell[p.y][x + 1] == '1') {
					Map m_copy = new Map(m);
					m_copy.cell[p.y][x + 1] = '0';
					Distance d_copy = new Distance(d);
					d_copy.cell[p.y][x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
					que_map.add(m_copy);
					que_d.add(d_copy);
				} else if (d.cell[p.y][x] == MAX) {
					Distance d_copy = new Distance(d);
					d_copy.cell[p.y][x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
					que_map.add(new Map(m));
					que_d.add(d_copy);
				}
				
				x = p.x;
				while (x - 1 >= 0 && m.cell[p.y][x - 1] != '1') x--;
				if (x != p.x && x - 1 >= 0 && m.cell[p.y][x - 1] == '1') {
					Map m_copy = new Map(m);
					m_copy.cell[p.y][x - 1] = '0';
					Distance d_copy = new Distance(d);
					d_copy.cell[p.y][x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
					que_map.add(m_copy);
					que_d.add(d_copy);
				} else if (d.cell[p.y][x] == MAX) {
					Distance d_copy = new Distance(d);
					d_copy.cell[p.y][x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
					que_map.add(new Map(m));
					que_d.add(d_copy);
				}

				y = p.y;
				while (y + 1 < h && m.cell[y + 1][p.x] != '1') y++;
				if (y != p.y && y + 1 < h && m.cell[y + 1][p.x] == '1') {
					Map m_copy = new Map(m);
					m_copy.cell[y + 1][p.x] = '0';
					Distance d_copy = new Distance(d);
					d_copy.cell[y][p.x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
					que_map.add(m_copy);
					que_d.add(d_copy);
				} else if (d.cell[y][p.x] == MAX) {
					Distance d_copy = new Distance(d);
					d_copy.cell[y][p.x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
					que_map.add(new Map(m));
					que_d.add(d_copy);
				}
				
				y = p.y;
				while (y - 1 >= 0 && m.cell[y - 1][p.x] != '1') y--;
				if (y != p.y && y - 1 >= 0 && m.cell[y - 1][p.x] == '1') {
					Map m_copy = new Map(m);
					m_copy.cell[y - 1][p.x] = '0';
					Distance d_copy = new Distance(d);
					d_copy.cell[y][p.x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
					que_map.add(m_copy);
					que_d.add(d_copy);
				} else if (d.cell[y][p.x] == MAX) {
					Distance d_copy = new Distance(d);
					d_copy.cell[y][p.x] = d.cell[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
					que_map.add(new Map(m));
					que_d.add(d_copy);
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