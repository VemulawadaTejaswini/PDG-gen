import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int[][] map;
    int x, y;
    int t, n;
    int count;
    int z = 100;

    void run(){
	while(sc.hasNext()){
	    map = new int[200][200];
	    t = sc.nextInt();
	    n = sc.nextInt();
	    if(t!=0){
		int i=n;
		while(i>0){
		    i--;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    map[a+z][b+z] = -1;
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
	if(t<0 || map[x+z][y+z]==-1 || map[x+z][y+z]>60) return;
	// 現在地が到達済か？
	if(map[x+z][y+z]!=-1){
	    if(map[x+z][y+z]==0)
		count++;
	    map[x+z][y+z]++;
	}
	// 移動する
	for(int i=0; i<dir.length; i++){
	    move(t-1, x+dir[i][0], y+dir[i][1], dir[i][0], dir[i][1]);
	    solve(t-1, x+dir[i][0], y+dir[i][1]);
	}
    }

    void move(int t, int x, int y, int dx, int dy){
	while(t>0 && map[x+z][y+z]!=-1){
	    t--;
	    if(map[x+z][y+z]!=-1){
		if(map[x+z][y+z]==0)
		    count++;
		map[x+z][y+z]++;
	    }
	    x += dx;
	    y += dy;
	}
    }
}   