import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int h=sc.nextInt(), w=sc.nextInt();
			if(h==0 && w==0) break;
			char[][] map = new char[h][w];

			int ax=-1, ay=-1, bx=-1, by=-1;
			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j] == 'A'){
						ax = j;
						ay = i;
						map[i][j] = '.';
					}
					if(map[i][j] == 'B'){
						bx = j;
						by = i;
						map[i][j] = '.';
					}
				}
			}

			char[] op = sc.next().toCharArray();
			int x = bx, y = by;
			int ans = -1;

			for(int cost=0;cost<10000;cost++){
				if(map[y][x] == '.'){
					int costAB = getCost(ax,ay,x,y,map);
					if(costAB <= cost){
						ans = cost;
						break;
					}
				}

				switch(op[cost%op.length]){
				case '8': if(y-1>=0) y--; break;
				case '6': if(x+1<w) x++; break;
				case '4': if(x-1>=0) x--; break;
				case '2': if(y+1<h) y++; break;
				}
			}

			if(ans == -1) System.out.println("impossible");
			else System.out.printf("%d %d %d\n",ans,y,x);
		}
	}

	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};

	private static int getCost(int sx,int sy,int gx,int gy,char[][] map){
		Queue<State> open = new LinkedList<State>();
		HashSet<State> closed = new HashSet<State>();

		open.add(new State(sx,sy,0));

		int ans = Integer.MAX_VALUE;
		while(!open.isEmpty()){
			State st = open.poll();
			if(closed.contains(st)) continue;
			closed.add(st);
			if(st.x == gx && st.y == gy){
				ans = st.cost;
				break;
			}

			for(int i=0;i<4;i++){
				int nx = st.x + dx[i];
				int ny = st.y + dy[i];
				if(nx>=0 && nx<map[0].length && ny>=0 && ny<map.length && map[ny][nx]=='.'){
					open.add(new State(nx,ny,st.cost+1));
				}
			}
		}

		return ans;
	}

	public static class State{
		int x,y,cost;

		State(int x,int y,int cost){
			this.x = x;
			this.y = y;
			this.cost = cost;
		}

		public boolean equals(Object o){
			State st = (State)o;
			return this.x == st.x && this.y == st.y;
		}

		public int hashCode(){
			return this.x * 100 + this.y;
		}
	}
}