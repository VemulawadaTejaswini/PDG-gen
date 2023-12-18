import java.util.*;
public class Main {
	static boolean[][] map;
	static HashMap<Integer,Pair> hm = new HashMap<Integer,Pair>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			map = new boolean[1024][1024];
			if(n == 0) break;
			map[500][500] = true;
			hm.put(0, new Pair(500,500));
			int ymax = 500;
			int ymin = 500;
			int xmax = 500;
			int xmin = 500;
			for(int i = 1; i < n; i++) {
				int c = stdIn.nextInt();
				int d = stdIn.nextInt();
				Pair tmp = hm.get(c);
				if(d == 0) {
					map[tmp.y][tmp.x-1] = true;
					hm.put(i, new Pair(tmp.x-1,tmp.y));
					if(xmin > tmp.x-1) xmin = tmp.x-1;
				}
				if(d == 1) {
					map[tmp.y+1][tmp.x] = true;
					hm.put(i, new Pair(tmp.x,tmp.y+1));
					if(ymax < tmp.y+1) ymax = tmp.y+1;
				}
				if(d == 2) {
					map[tmp.y][tmp.x+1] = true;
					hm.put(i, new Pair(tmp.x+1,tmp.y));
					if(xmax < tmp.x+1) xmax = tmp.x+1;
				}
				if(d == 3) {
					map[tmp.y-1][tmp.x] = true;
					hm.put(i, new Pair(tmp.x,tmp.y-1));
					if(ymin > tmp.y-1) ymin = tmp.y-1;
				}
			}
			int xlen = xmax+1 - xmin;
			int ylen = ymax+1 - ymin;
			System.out.println(xlen + " " + ylen);
		}
	}
}

class Pair{
	public int x;
	public int y;
	public Pair(int a, int b) {
		x = a;
		y = b;
	}
}