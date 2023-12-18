import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    int h, w, n;
    char[][] map;
    int[][] cheese;
    LinkedList<int[]> que;
    int x, y;
    int max = Integer.MAX_VALUE;
    int dis;
    
    void run(){
	while(sc.hasNext()){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    n = sc.nextInt();
	    if(n==0) break;

	    map = new char[h][w];
	    cheese = new int[n][2];

	    for(int i=0; i<h; i++){
		String s = sc.next();
		map[i] = s.toCharArray();
		for(int k=0; k<w; k++)
		    if(map[i][k]=='S'){
			x = k;
			y = i;
		    }
		    else if(map[i][k]!='X' && map[i][k]!='.'){
			int c = map[i][k] - 49;
			cheese[c][0] = k; // x
			cheese[c][1] = i; // y
		    }
	    }

	    dis = 0;
	    que = new LinkedList<int[]>();
	    for(int i=0; i<n; i++){
		//System.out.println("++"+i);
		dis += solve(x, y, i, 0);
		x = cheese[i][0];
		y = cheese[i][1];
	    }
	    System.out.println(dis);
       
	}
    }

    int solve(int nx, int ny, int level, int sum){
	//System.out.println("*"+nx+" "+ny+" "+level);
	boolean[][] visit = new boolean[h][w];
	que.clear();
      	que.add(new int[]{nx, ny, 0});
	visit[ny][nx] = true;
	
	while(!que.isEmpty()){
	    int[] p = que.pollFirst();
	    nx = p[0];
	    ny = p[1];
	    sum = p[2];
	    visit[ny][nx]=true;

	    if(nx==cheese[level][0] && ny==cheese[level][1])
		return sum;
	    
	    else {
		for(int i=0; i<4; i++){
		    int a = nx+dX[i];
		    int b = ny+dY[i];
		    if(a>=0 && a<w && b>=0 && b<h && 
		       map[b][a]!='X' && !visit[b][a]){
			que.add(new int[]{ a, b, sum+1 });		
		    }
		}
	    }
	}
	return max; // 使わない   
    }
    
    int[] dX = {0, 1, -1, 0};
    int[] dY = {1, 0, 0, -1};
}