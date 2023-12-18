import java.util.*;

class Main{
    int w,h,sx,sy;
    char[][] tile;
    ArrayList<Point> p;
    int[][] dist,d,dp;
    int INF = 100000000;

    class Point{
	int x,y;
	public Point(int x, int y){
	    this.x = x;
	    this.y = y;
	}
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0)break;

	    tile = new char[h][w];
	    p = new ArrayList<Point>();
	    for(int i=0; i<h; i++){
		String line = sc.next();
		for(int j=0; j<w; j++){
		    tile[i][j] = line.charAt(j);
		    if(tile[i][j]=='o'){sx = j; sy = i;}
		    if(tile[i][j]=='*')	p.add(new Point(j,i));
		}
	    }
	    p.add(new Point(sx,sy));

	    //距離行列作成
	    d = new int[p.size()][p.size()];
	    for(int i=0; i<p.size(); i++) Arrays.fill(d[i],INF);
	    for(int i=0; i<p.size(); i++){
		dist = new int[h][w];
		for(int j=0; j<h; j++) Arrays.fill(dist[j],INF);
		bfs(i);
		for(int j=0; j<p.size(); j++){
		    d[i][j] = dist[p.get(j).y][p.get(j).x];
		}
	    }

	    //TSP
	    dp = new int[1 << p.size()][p.size()];
	    for(int i=0; i<1<<p.size(); i++)Arrays.fill(dp[i],-1);
	    int ans = tsp(0,p.size()-1);
	    System.out.println(ans==INF ? -1:ans);
	}
    }

    void bfs(int s){
	int[] dx = {0,0,1,-1};
	int[] dy = {1,-1,0,0};

	LinkedList<Point> q = new LinkedList<Point>();
	q.add(new Point(p.get(s).x,p.get(s).y));
	dist[p.get(s).y][p.get(s).x] = 0;

	while(q.size()>0){
	    Point point = q.poll();
	    for(int i=0; i<4; i++){
		int nx = point.x+dx[i];
		int ny = point.y+dy[i];
		if(nx>=0 && nx<w && ny>=0 && ny<h && tile[ny][nx]!='x' && dist[ny][nx]==INF){
		    q.add(new Point(nx,ny));
		    dist[ny][nx] = dist[point.y][point.x]+1;
		}
	    }
	}
    }

    int tsp(int S, int v){
	if(dp[S][v]>=0) return dp[S][v];

	if(S==(1<<p.size())-1) return dp[S][v] = 0;

	int res = INF;
	for(int i=0; i<p.size(); i++){
	    if((S>>i&1)==0){
		res = Math.min(res,tsp(S|1<<i,i)+d[v][i]);
	    }
	}

	return dp[S][v] = res;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}