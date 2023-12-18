import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main{
	public static final int[] dx = {1, 0, -1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	public static int w, h;
	public static char[][][] map;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new char[2][h][w];
			int g = 0;
			int s = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<2; j++){
					char[] line = in.next().toCharArray();
					if(j==0) map[j][i] = line;
					else{
						for(int k=0; k<w; k++){
							map[j][i][k] = line[w-1-k];
						}
					}
					for(int k=0; k<w; k++){
						switch(map[j][i][k]){
						case 'R':
							s += i*w+k;
							break;
						case 'L':
							s += (i*w+k)*h*w;
							break;
						case '%':
							g += id(j, i, k);
							break;
						}
					}
				}
			}
			BitSet used = new BitSet(w*w*h*h);
			Queue<Integer> qu = new LinkedList<Integer>();
			qu.add(s);
			used.set(s);
			int hw = h*w;
			int whw = w*h*w;
			boolean flag = false;
			while(!qu.isEmpty()){
				int id = qu.poll();
				if(id == g){
					flag = true;
					break;
				}
				int y0 = id/whw;
				id %= whw;
				int x0 = id/hw;
				id %= hw;
				int y1 = id/w;
				int x1 = id%w;
				for(int i=0; i<4; i++){
					int nid = next(x0, y0, x1, y1, i);
					if(used.get(nid)) continue;
					used.set(nid);
					qu.add(nid);
				}
			}
			System.out.println(flag ? "Yes" : "No");
		}
	}
	
	public static String dump(char[][] map){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				sb.append(map[i][j]+" ");
			}
			sb.append('\n');
		}
		return sb.toString();
	}
	
	public static int next(int x0, int y0, int x1, int y1, int dir){
		int nx0 = x0 + dx[dir];
		int ny0 = y0 + dy[dir];
		if(nx0 < 0 || nx0 >= w || ny0 < 0 || ny0 >= h
				|| map[0][ny0][nx0] == '#'){
			nx0 = x0;
			ny0 = y0;
		}
		int nx1 = x1 + dx[dir];
		int ny1 = y1 + dy[dir];
		if(nx1 < 0 || nx1 >= w || ny1 < 0 || ny1 >= h
				|| map[1][ny1][nx1] == '#'){
			nx1 = x1;
			ny1 = y1;
		}
		return id(0, ny0, nx0) + id(1, ny1, nx1);
	}
	
	public static int id(int room, int y, int x){
		return room==0 ? (y*w+x)*w*h : y*w+x;
	}
}