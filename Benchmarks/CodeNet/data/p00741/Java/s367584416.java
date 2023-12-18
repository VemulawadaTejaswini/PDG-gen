import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) break;
			Map m = new Map(w, h);
			
			Point p;
			LinkedList<Point> l = new LinkedList<Point>();
			while (true){
				p = m.searchI();
				if (p.getX() == w+1 && p.getY() == h+1) break;
				l.add(p);
				while (!l.isEmpty()) {
					p = l.pollFirst();
					l.addAll(m.getNearF(p));
				}
			}
			System.out.println(m.getI());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	int[] dx = {-1,0,1,1,1,0,-1,-1};
	int[] dy = {-1,-1,-1,0,1,1,1,0};
	class Map{
		int name = 0;
		int w,h;
		int[][] m;
		
		Map (int w,int h) {
			this.w = w;
			this.h = h;
			m = new int[h+2][w+2];
			for (int i=0;i<h+2;i++) {
				for (int j=0;j<w+2;j++)
					m[i][j] = 0;
			}
			for (int i=1;i<=h;i++) {
				for (int j=1;j<=w;j++) {
					m[i][j] = sc.nextInt();
				}
			}
		}
		
		LinkedList<Point> getNearF(Point p) {
			LinkedList<Point> l = new LinkedList<Point>();
			for (int i=0;i<8;i++) {
				if (m[p.getY()+dy[i]][p.getX()+dx[i]] == 1) {
					l.add(new Point(p.getX()+dx[i],p.getY()+dy[i]));
					m[p.getY()+dy[i]][p.getX()+dx[i]] = 1+name;
					
				}
			}
			
			return l;
		}
		
		Point searchI() {
		//	printMap();
			name ++;
			for (int i=1;i<=h;i++) {
				for (int j=1;j<=w;j++) {
					if (m[i][j] == 1 ) {
						m[i][j] = 1+name;
						return (new Point(j,i));
					}
				}
			}
			return (new Point(w+1,h+1));
		}
		
		void printMap() {
			for (int i=0;i<w+2;i++) {
				for (int j=0;j<h+2;j++)
					System.out.print(m[j][i] + " " );
				System.out.println();
			}
		}
		
		int getI() {
			return name-1;
		}
		
	}
	class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
	}
	
}