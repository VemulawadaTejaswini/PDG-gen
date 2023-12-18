import java.util.BitSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
//	public static int[][][] cost;
	public static int[][] dx = {
		{1, 1, 2, 1, 2, 3, 1, 2, 1},
		{-1, -1, -2, -1, -2, -3, -1, -2, -1},
	};
	public static int[][] dy = {
		{-2, -1, -1, 0, 0, 0, 1, 1, 2},
		{-2, -1, -1, 0, 0, 0, 1, 1, 2}
	};
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int INF = (int)1e8;
		while(true){
			int w = in.nextInt();
			int h = in.nextInt();
			if(w == 0) break;
			char[][] map = new char[h][w];
			Queue<Pos> slist = new LinkedList<Pos>();
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					map[i][j] = in.next().charAt(0);
					if(map[i][j] == 'S'){
						slist.add(new Pos(i*w+j, j, i, 0, 0));
						slist.add(new Pos(i*w+j, j, i, 1, 0));
						// state: 0:left 1:right
					}
				}
			}
//			cost = new int[2][h][w];
			BitSet[] used = new BitSet[2];
			used[0] = new BitSet(h*w);
			used[1] = new BitSet(h*w);
			int res = INF;
			while(!slist.isEmpty()){
				Pos start = slist.poll();
				Queue<Pos> qu = new PriorityQueue<Pos>();
				qu.add(start);
				used[0].clear();
				used[1].clear();
				out: while(!qu.isEmpty()){
					Pos p = qu.poll();
					if(used[p.state].get(p.id)) continue;
					used[p.state].set(p.id);
					for(int i=0; i<9; i++){
						int nx = p.x + dx[p.state][i];
						int ny = p.y + dy[p.state][i];
						if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
						if(map[ny][nx] == 'S' || map[ny][nx] == 'X') continue;
						if(map[ny][nx] == 'T'){
							res = Math.min(res, p.dist);
							break out;
						}
						int d = map[ny][nx] - '0';
						qu.add(new Pos(ny*w+nx, nx, ny, p.state==0?1:0, p.dist+d));
					}
				}
			}
			System.out.println(res==INF?-1:res);
		}
		in.close();
	}
}

class Pos implements Comparable<Pos>{
	int id, x, y, state, dist;
	public Pos(int id, int x, int y, int state, int dist){
		this.x = x;
		this.y = y;
		this.id = id;
		this.dist = dist;
		this.state = state;
	}
	
	@Override
	public int compareTo(Pos o) {
		return dist - o.dist;
//		return Main.cost[state][y][x] - Main.cost[o.state][o.y][o.x];
	}
}