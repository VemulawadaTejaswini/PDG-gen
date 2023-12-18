import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int[][] map;
	public static int[][] dist;
	public static final int[] dx = {1, 0, -1, 0}; 
	public static final int[] dy = {0, 1, 0, -1}; 
	public static int w, h, n;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			BitSet used = new BitSet(w*h);
			List<Pos> list = new ArrayList<Pos>();
			map = new int[h][w];
			int sx = 0;
			int sy = 0;
			n = 0;
			for(int i=0; i<h; i++){
				char[] s = in.next().toCharArray();
				for(int j=0; j<w; j++){
					switch(s[j]){
					case '.':
						map[i][j] = -1;
						break;
					case 'x':
						map[i][j] = -2;
						break;
					case '*':
						map[i][j] = n;
						list.add(new Pos(n++, i, j));
						break;
					case 'o':
						sx = j;
						sy = i;
						map[i][j] = -1;
						break;
					}
				}
			}
			dist = new int[n][n];
			int[] stod = new int[n];
			for(int i=0; i<n; i++){
				stod[i] = -1;
			}
			for(int i=0; i<n; i++){
				used.clear();
				Queue<Point> qu = new LinkedList<Point>();
				qu.add(list.get(i).p);
				while(!qu.isEmpty()){
					Point p = qu.poll();
					if(used.get(p.id)) continue;
					if(map[p.y][p.x] >= 0){
						dist[i][map[p.y][p.x]] = p.dist;
					}else if(p.y == sy && p.x == sx){
						stod[i] = p.dist;
					}
					used.set(p.id);
					for(int d=0; d<4; d++){
						int ny = p.y+dy[d];
						int nx = p.x+dx[d];
						if(out(ny, nx)) continue;
						if(map[ny][nx] == -2) continue;
						qu.add(new Point(ny, nx, p.dist+1));
					}
				}
			}
			res = 5000;
			for(int i=0; i<n; i++){
				if(stod[i] == -1){
					res = -1;
					break;
				}
				dfs(i, 1<<i, stod[i]);
			}
			System.out.println(res);
		}
	}
	
	public static int res;
	public static void dfs(int id, int state, int sum){
		if(Integer.bitCount(state) == n){
			res = Math.min(res, sum);
			return;
		}
		for(int i=0; i<n; i++){
			if((state&1<<i)>0) continue;
			dfs(i, state|1<<i, sum+dist[id][i]);
		}
	}
	
	public static boolean out(int y, int x){
		return y<0 || y>=h || x<0 || x>=w;
	}
}

class Point{
	int y, x;
	int id;
	int dist;
	public Point(int y, int x, int d){
		this.y = y;
		this.x = x;
		id = y*Main.w+x;
		dist = d;
	}
}

class Pos{
	int id;
	int y, x;
	Point p;
	public Pos(int id, int y, int x){
		this.id = id;
		this.y = y;
		this.x = x;
		this.p = new Point(y, x, 0);
	}
}