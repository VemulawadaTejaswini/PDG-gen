import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[][] map;
    /*
      [x][y]
      0 : 未到達
      1 : 到達済
      -1 : 障害物があり、通れない
    */
    int x, y;
    int t, n;
    int count;

    void run(){
	while(sc.hasNext()){
	    map = new int[100][100];
	    t = sc.nextInt();
	    n = sc.nextInt();
	    if(t!=0){
		int i=n;
		while(i>0){
		    i--;
		    map[sc.nextInt()+30][sc.nextInt()+30] = -1;
		}
		x = sc.nextInt();
		y = sc.nextInt();
		count = 0;
		solve(t, x, y);
		System.out.println(count);
	    }
	}
    }

    int[][] dir = { {0, 1}, {1, 1}, {1, 0}, 
		    {0, -1}, {-1, -1}, {-1, 0} };
		    
    void solve(int t, int x, int y){
	if(t<0 || map[x+30][y+30]==-1) return;
	// 現在地が到達済か？
	if(map[x+30][y+30]==0){
	    map[x+30][y+30] = 1;
	    count++;
	}
	// 移動する
	for(int i=0; i<dir.length; i++){
	    solve(t-1, x+dir[i][0], y+dir[i][1]);
	}
    }
}   