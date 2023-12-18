import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		while (x != 0) {
			char map[][] = new char[y][x];
			load(sc, map);
			Queue<Point> que = new LinkedList<Point>();
			for (int i = 0;i < map.length;i ++) {
				for (int j = 0;j < map[i].length;j ++) {
					if (map[i][j] == '@') {
						que.add(new Point(j, i));
					}
				}
			}
			
			int dx[] = {-1, 0, 1, 0};
			int dy[] = {0, 1, 0, -1};
			int count = 0;
			while(!que.isEmpty()) {
				Point p = que.poll();
				if (p.x < 0 || p.x >= x || p.y < 0 || p.y >= y) continue;
				if (map[p.y][p.x] == '#') continue;
				count ++;
				map[p.y][p.x]= '#'; 
				for (int i = 0;i < 4;i ++) {
					que.add(new Point(p.x + dx[i], p.y + dy[i]));
				}
			}
			System.out.println(count);
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
	
	public static char[][] load(Scanner sc, char[][] map) {
		for (int i = 0;i < map.length;i ++) {
			map[i] = sc.next().toCharArray();
		}
		return map;
	}
}

