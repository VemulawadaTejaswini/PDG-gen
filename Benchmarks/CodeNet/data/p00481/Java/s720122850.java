
import java.util.*;

public class Main {

	public static class Point {
		public int x;
		public int y;
		public int pre;
		public Point(){
			
		}
		public Point(int x1,int y1) {
			x = x1;
			y = y1;
		}
		public Point(int x1,int y1 ,int pre1) {
			x = x1;
			y = y1;
			pre= pre1;
		}
		public void setX(int x1){
			x =x1;
		}
	};
	
	final static int MAXN = 1000;
	private static Point S = new Point() ,G = new Point() ;   //表示起点和?点
	private static int N,W,H;
	private static char[][] graph = new char[MAXN][MAXN];   //存?
	private static int[][] vis = new int[MAXN][MAXN];   //存距?
	private static Point[] aim = new Point[10];  //存目?坐?
	
	private static int dx[] = {1,-1,0,0},dy[]={0,0,-1,1};
	
	public static void main(String[] args) {
		
		Scanner fin = new Scanner(System.in);		
		//?入数据
		H = fin.nextInt();
		W = fin.nextInt();
		N = fin.nextInt();
		fin.nextLine();
		for(int i=0; i<H; i++){
			String line = fin.nextLine().replace(" ", "");
			for(int j=0; j<W; j++){
				graph[i][j] = line.charAt(j);
				if(graph[i][j] == 'S'){
					S.x = i;
					S.y = j;
				}
				if(graph[i][j] >= '1' && graph[i][j] <= '9'){
					int t = graph[i][j] -'0';
					aim[t] = new Point(i,j);
				}
			}
		}
		int step = 0; 
		for(int i=1; i<=N; i++){
			G.x = aim[i].x;
			G.y = aim[i].y;
			step += bfs(S,G);
			S.x = G.x;
			S.y = G.y;
		}		
		System.out.printf("%d\n", step);

	}
	
	private static int bfs(Point S, Point G){
		Queue<Point> sq = new LinkedList<Point>();
		

		//?次遍?前，重置vis中存放的?
		for(int i=0 ;i<MAXN; i++){
			Arrays.fill(vis[i], -1);
		}
		
		sq.add(S);
		vis[S.x][S.y] = 0;
		while(!sq.isEmpty()){
			Point qh = sq.poll();		//返回?列中第一个元素，并?除一个元素						
			if(qh.x == G.x && qh.y == G.y){
				break;
			}
			for(int k =0; k<4; k++){
				//*****因??里??的是引用，所以一定要新?建qe，然后添加到?列中，其?才不会?
				Point qe = new Point(qh.x + dx[k], qh.y + dy[k]);
				
				if(check(qe.x,qe.y) == 1){					
					sq.add(qe);   //入?					
					vis[qe.x][qe.y] = vis[qh.x][qh.y] + 1;					
				}
			}
		}
		return vis[G.x][G.y];
	}
	private static int check(int x, int y){
		int flag=1;
		if(x<0 || x>=H || y<0 || y>=W)
			flag =0;
		else if(graph[x][y] == 'X' || vis[x][y] != -1)
	    	flag =0;		
		return flag;
	}

}