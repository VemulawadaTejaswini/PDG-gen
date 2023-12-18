import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	HashMap<Integer, Character> map = new HashMap<Integer, Character>();
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1218().doIt();
	}
	
	class AOJ1218{
		int w,h;
		int[][] map;
		int sx,sy,px,py,gx,gy;
		int[] ax = {1,0,-1,0};
		int[] ay = {0,1,0,-1};
		void doIt(){
			while(in.hasNext()){
				w = in.nextInt();
				h = in.nextInt();
				if(w+h==0)break;
				map = new int[h][w];
				for(int i=0;i<h;i++)for(int s=0;s<w;s++){
					map[i][s] = in.nextInt();
					if(map[i][s]==2){
						sx = s;sy = i;
					}else if(map[i][s]==3) {
						gx = s;gy = i;
					}else if(map[i][s]==4){
						px = s;py = i;
					}
				}
//				System.out.println("Person is = "+px+" "+py);
				solve();
			}
		}
		
		void solve(){
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(sx, sy, 0, px, py));
			int result = -1;
			int[][][] memo = new int[h][w][4];
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)Arrays.fill(memo[i][s], Integer.MAX_VALUE/2);
			while(q.size()>0){
//				System.out.println();
				State now = q.remove();
//				System.out.println("x = "+now.x+" y = "+now.y+" px = "+now.px+" py = "+now.py);
				if(now.x==gx&&now.y==gy){
					result = now.cost;
					break;
				}
				for(int i=0;i<4;i++){
					int nx = ax[i]+now.x;
					int ny = ay[i]+now.y;
//					System.out.println("nx = "+nx+" ny = "+ny);
					if(nx<0||nx>=w||ny<0||ny>=h||map[ny][nx]==1||!canGo(now.px, now.py, now.x, now.y, now.x+ax[(i+2)%4], now.y+ay[(i+2)%4]))continue;
//					System.out.println(memo[ny][nx][i]);
					if(memo[ny][nx][i]>now.cost+1){
//						System.out.println("******");
						memo[ny][nx][i] = now.cost+1;
						q.add(new State(nx, ny, now.cost+1, now.x+ax[(i+2)%4], now.y+ay[(i+2)%4]));
					}
				}
			}
			System.out.println(result);
		}
		
		boolean canGo(int fromx,int fromy,int cx,int cy,int tox,int toy){
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(fromx, fromy,0,0,0));
			int[][] memo = new int[h][w];
			for(int i=0;i<h;i++)Arrays.fill(memo[i], Integer.MAX_VALUE/2);
			while(q.size()>0){
				State now = q.remove();
				if(now.x == tox && now.y == toy)return true;
				for(int i=0;i<4;i++){
					int nx = now.x+ax[i];
					int ny = now.y+ay[i];
					if(nx<0||nx>=w||ny<0||ny>=h||map[ny][nx]==1||(nx==cx&&ny==cy))continue;
					if(memo[ny][nx]<now.cost+1)continue;
					q.add(new State(nx, ny, now.cost+1,0,0));
					memo[ny][nx] = now.cost+1;
				}
			}
//			System.out.println();
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.print(memo[i][s]+" ");
//				System.out.println();
//			}
			return false;
		}
		
		class State implements Comparable<State>{
			int x,y,cost,px,py;
			public State(int x,int y,int cost,int px,int py){
				this.x = x;
				this.y = y;
				this.cost = cost;
				this.px = px;
				this.py = py;
			}
			public int compareTo(State o) {
				return this.cost-o.cost;
			}
		}
	}
}