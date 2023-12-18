import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static final int[] dx = {1, 0, -1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	public static int w, h;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			in.nextLine();
			int tw = w*2-1;
			int th = h*2-1;
			int[][] table = new int[th][tw];
			for(int i=0; i<th; i++){
				char[] line = in.nextLine().toCharArray();
				for(int j=0; j<line.length; j++){
					table[i][j] = line[j]==' ' ? 0 : line[j]-'0';
				}
			}
			int[][] map = new int[h][w];
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					for(int d=0; d<4; d++){
						int tx = 2*j + dx[d];
						int ty = 2*i + dy[d];
						if(tx < 0 || tx >= tw || ty < 0 || ty >= th) continue;
						if(table[ty][tx] == 0) map[i][j] |= 1<<d;
					}
				}
			}
			Queue<Pos> qu = new LinkedList<Pos>();
			qu.add(new Pos(0, 0, 1));
			BitSet used = new BitSet(h*w);
			int res = 0;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(used.get(p.id)) continue;
				if(p.id == h*w-1){
					res = p.dist;
					break;
				}
				used.set(p.id);
				for(int i=0; i<4; i++){
					if((map[p.y][p.x] & 1<<i) == 0) continue;
					int nx = p.x + dx[i];
					int ny = p.y + dy[i];
					qu.add(new Pos(nx, ny, p.dist+1));
				}
			}
			System.out.println(res);
		}
	}
	
	public static String dump(int[][] map, int h, int w){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

class Pos{
	int x, y, dist, id;
	public Pos(int x, int y, int d){
		this.x = x;
		this.y = y;
		dist = d;
		id = y*Main.w + x;
	}
}