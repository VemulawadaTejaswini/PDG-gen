import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};

		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;

			char[][] map = new char[h][w];
			Point start = null;
			Point end = null;
			HashMap<Point,Boolean> wmap = new HashMap<Point,Boolean>();
			HashMap<Point,Boolean> cmap = new HashMap<Point,Boolean>();
			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j] == 'w'){
						map[i][j] = '.';
						wmap.put(new Point(j,i),true);
					}
					else if(map[i][j] == 'c'){
						map[i][j] = '.';
						cmap.put(new Point(j,i),true);
					}
					else if(map[i][j] == '@'){
						map[i][j] = '.';
						start = new Point(j,i);
					}
					else if(map[i][j] == 'E'){
						map[i][j] = '.';
						end = new Point(j,i);
					}
				}
			}

			PriorityQueue<State> open = new PriorityQueue<State>();
			HashSet<State> closed = new HashSet<State>();
			open.add(new State(start,wmap,cmap,0));
			State ans = null;

			while(!open.isEmpty()){
				State st = open.poll();
				if(closed.contains(st)) continue;
				closed.add(st);

				if(st.p.equals(end) && !st.cmap.containsKey(st.p)){
					ans = st;
					break;
				}

				for(int i=0;i<4;i++){
					int nx = st.p.x + dx[i];
					int ny = st.p.y + dy[i];
					int nnx = st.p.x + 2*dx[i];
					int nny = st.p.y + 2*dy[i];
					Point np = new Point(nx,ny);
					HashMap<Point,Boolean> nwmap = new HashMap<Point,Boolean>(st.wmap);
					HashMap<Point,Boolean> ncmap = new HashMap<Point,Boolean>(st.cmap);

					//Reið·
					if(ncmap.containsKey(np)){
						//2Âæªó¢Ä¢È¢Æ·Ó¡ªÈ¢
						if(map[nny][nnx] != '.' || ncmap.containsKey(new Point(nnx,nny))) continue;

						int tx = nnx;
						int ty = nny;
						while(map[ty][tx]=='.' && !nwmap.containsKey(new Point(tx,ty)) && !ncmap.containsKey(new Point(tx,ty))){
							tx += dx[i];
							ty += dy[i];
						}

						//ReiÌÊuªÚ®·é¾¯
						if(map[ty][tx]=='#' || ncmap.containsKey(new Point(tx,ty))){
							ncmap.remove(np);
							ncmap.put(new Point(tx-dx[i],ty-dy[i]),true);
						}
						//Rei,plªÁÅ·é
						else{
							nwmap.remove(new Point(tx,ty));
							ncmap.remove(np);
						}

						open.add(new State(new Point(st.p.x,st.p.y),nwmap,ncmap,st.cost));
					}
					//êàà­¾¯
					else if(map[ny][nx]=='.' && !nwmap.containsKey(np)){
						open.add(new State(np,nwmap,ncmap,st.cost+1));
					}
				}
			}

			System.out.println(ans==null ? -1 : ans.cost);
		}
	}
}

class State implements Comparable<State>{
	Point p;
	HashMap<Point,Boolean> wmap,cmap;
	int cost;

	State(Point p,HashMap<Point,Boolean> wmap,HashMap<Point,Boolean> cmap,int cost){
		this.p = p;
		this.wmap = wmap;
		this.cmap = cmap;
		this.cost = cost;
	}

	public boolean equals(Object o){
		State st = (State)o;
		return p.equals(st.p) && wmap.equals(st.wmap) && cmap.equals(st.cmap);
	}

	public int hashCode(){
		return p.hashCode() + wmap.hashCode() + cmap.hashCode();
	}

	public int compareTo(State st){
		return cost - st.cost;
	}

	public String toString(){
		return String.format("[%s,%s,%s,%d]",p,wmap,cmap,cost);
	}
}