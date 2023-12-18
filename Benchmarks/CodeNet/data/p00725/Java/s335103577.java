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
	
	final int MAX = Integer.MAX_VALUE;
	int w, h;
	char[][] map;
	int[][] d;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			Pair pair = new Pair();
			if (w == 0 && h == 0) break;
			
			Map map = new Map();
			d	= new int[h][w];
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String str = scan.next();
					d[i][j] = MAX;
					map.cell[i][j] = str.charAt(0);
					if (map.cell[i][j] == '2') {
						pair.y = i;
						pair.x = j;
						d[i][j] = 0;
					}
				}
			}
			
			Queue<Pair> que = new ArrayDeque<Pair>();
			Queue<Map> que_map = new ArrayDeque<Map>();
			que.add(pair);
			que_map.add(map);
			while (!que.isEmpty()) {
				Pair p = que.poll();
				Map	m = que_map.poll();
				
//				System.out.println("y: " + p.y);
//				System.out.println("x: " + p.x);
				
				if (d[p.y][p.x] == 11) {
					System.out.println(-1);
					break;
				}
				if (m.cell[p.y][p.x] == '3') {
					System.out.println(d[p.y][p.x]);
					break;
				}
				
				int x, y;
				
				x = p.x;
				while (x + 1 < w && m.cell[p.y][x + 1] != '1') {
					x++;
				}
				if (d[p.y][x] == MAX || (x != p.x && x + 1 != w && m.cell[p.y][x + 1] == '1')) {
					if (x + 1 != w && m.cell[p.y][x + 1] == '1') {
						Map m_copy = new Map(m);
						m_copy.cell[p.y][x + 1] = '0';
						que_map.add(m_copy);
					} else {
						que_map.add(new Map(m));
					}
					d[p.y][x] = d[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
					
				}
				
				x = p.x;
				while (x - 1 >= 0 && m.cell[p.y][x - 1] != '1') {
					x--;
				}
				if (d[p.y][x] == MAX || (x != p.x && x != 0 && m.cell[p.y][x + 1] == '1')) {
					if (x != 0 && m.cell[p.y][x - 1] == '1') {
						Map m_copy = new Map(m);
						m_copy.cell[p.y][x - 1] = '0';
						que_map.add(m_copy);
					} else {
						que_map.add(new Map(m));
					}
					d[p.y][x] = d[p.y][p.x] + 1;
					que.add(new Pair(p.y, x));
				}
				
				y = p.y;
				while (y + 1 < h && m.cell[y + 1][p.x] != '1') {
					y++;
				}
				if (d[y][p.x] == MAX || (y != p.y && y + 1 != h && m.cell[y + 1][p.x] == '1')) {
					if (y + 1 != h && m.cell[y + 1][p.x] == '1') {
						Map m_copy = new Map(m);
						m_copy.cell[y + 1][p.x] = '0';
						que_map.add(m_copy);
					} else {
						que_map.add(new Map(m));
					}
					d[y][p.x] = d[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
				}
				
				y = p.y;
				while (y - 1 >= 0 && m.cell[y - 1][p.x] != '1') {
					y--;
				}
				if (d[y][p.x] == MAX || (y != p.y && y != 0 && m.cell[y - 1][p.x] == '1')) {
					if (y != 0 && m.cell[y - 1][p.x] == '1') {
						Map m_copy = new Map(m);
						m_copy.cell[y - 1][p.x] = '0';
						que_map.add(m_copy);
					} else {
						que_map.add(new Map(m));
					}
					d[y][p.x] = d[p.y][p.x] + 1;
					que.add(new Pair(y, p.x));
				}
				
//				for (int i = 0; i < h; i++) {
//					for (int j = 0; j < w; j++) {
//						if (d[i][j] == MAX) System.out.print("I ");
//						else System.out.print(d[i][j] + " ");
//					}
//					System.out.println();
//				}
				
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