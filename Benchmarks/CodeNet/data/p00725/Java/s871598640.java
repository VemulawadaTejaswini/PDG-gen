import java.util.*;
import java.awt.Point;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w=sc.nextInt(), h=sc.nextInt();
			if(w==0 && h==0) break;

			int map[][] = new int[h][w];
			Point start = null;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.nextInt();
					if(map[i][j] == 2) start = new Point(j,i);
				}
			}

			Queue<State> open = new LinkedList<State>();
			State st = null;

			open.add(new State(0, new Spec(map, start.x, start.y, false)));

			int ans = Integer.MAX_VALUE;
			while(!open.isEmpty()){
				st = open.poll();
				if(st.obj.goalFlg){
					ans = st.cost;
					break;
				}
				open.addAll(st.nexts());
			}
			if(ans == Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(ans);
		}
	}
}

class State{
	int cost;
	Spec obj;

	public State(int cost, Spec obj){
		this.cost = cost;
		this.obj = obj;
	}

	public List<State> nexts(){
		List<State> sts = new ArrayList<State>();

		for(int i=0;i<4;i++){
			Spec nobj = obj.copy();
			int ncost = cost + 1;
			if(ncost<=10 && nobj.move(i)) sts.add(new State(ncost, nobj));
		}

		return sts;
	}
}

class Spec{
	final int[] dx = {1,-1,0,0};
	final int[] dy = {0,0,1,-1};

	boolean goalFlg;
	int[][] map;
	Point p;

	public Spec(int[][] map, int x, int y, boolean goalFlg){
		int h=map.length, w=map[0].length;
		this.map = new int[h][w];
		for(int i=0;i<h;i++)for(int j=0;j<w;j++) this.map[i][j] = map[i][j];
		this.p = new Point(x, y);
		this.goalFlg = goalFlg;
	}

	public boolean move(int d){
		int h=map.length, w=map[0].length;
		Point np = new Point(p.x+dx[d], p.y+dy[d]);
		if(np.x>=0 && np.x<w && np.y>=0 && np.y<h && map[np.y][np.x]==1)
			return false;

		while(true){
			np = new Point(p.x+dx[d], p.y+dy[d]);

			if(np.x<0 || np.x>=w || np.y<0 || np.y>=h)
				return false;
			else if(map[np.y][np.x] == 1){
				map[np.y][np.x] = 0;
				return true;
			}
			else if(map[np.y][np.x] == 3){
				goalFlg = true;
				p = new Point(np.x, np.y);
				return true;
			}

			p = new Point(np.x, np.y);
		}
	}

	public Spec copy(){
		Spec cp = new Spec(map, p.x, p.y, goalFlg);
		return cp;
	}
}