import java.util.*;

class Main{

    int h, w;
    char[][] map;
    char[] order;
    int min;
    int INF = Integer.MAX_VALUE;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;

	    int sx = 0, sy = 0;
	    map = new char[h][w];
	    for(int i=0; i<h; i++){
		String line = sc.next();
		for(int j=0; j<w; j++){
		    map[i][j] = line.charAt(j);
		    if(map[i][j]=='#'){
			sx = j; sy = i;
		    }
		}
	    }

	    order = sc.next().toCharArray();
	    Dice d = new Dice('r', 'c', 'g', 'm', 'b', 'y');

	    min = INF;
	    v = new boolean[h][w];
	    vv = new boolean[6][h][w];
	    dfs(sx, sy, d, 0, 0);
	    if(min==INF) System.out.println("unreachable");
	    else System.out.println(min);
	}
    }

    class Dice{
	char[] dice = new char[6];
	Dice(char top, char bottom, char north, char south, char east, char west){
	    dice[0] = top;
	    dice[1] = bottom;
	    dice[2] = north;
	    dice[3] = south;
	    dice[4] = east;
	    dice[5] = west;
	}
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};
    boolean[][] v;
    boolean[][][] vv;
    
    int[][] r = {
	{4, 3, 1, 2, 5, 6},
	{6, 5, 3, 4, 1, 2},
	{3, 4, 2, 1, 5, 6},
	{5, 6, 3, 4, 2, 1}
    };

    void dfs(int sx, int sy, Dice d, int cnt, int cost){
	if(cnt==6){
	    //System.out.println("poyo");
	    min = Math.min(min, cost);
	    return;
	}

	System.out.println(sx+" "+sy+" "+Arrays.toString(d.dice)+" "+cnt);

	for(int i=0; i<4; i++){
	    int nx = sx + dx[i], ny = sy + dy[i];
	    if(nx<0 || nx>=w || ny<0 || ny>=h || v[ny][nx]) continue;
	    Dice dice = new Dice(d.dice[r[i][0]-1] , d.dice[r[i][1]-1], d.dice[r[i][2]-1], d.dice[r[i][3]-1], d.dice[r[i][4]-1], d.dice[r[i][5]-1]);
	    if(map[ny][nx]!='w') v[ny][nx] = true;
	    else vv[cnt][ny][nx] = true;
	    if(map[ny][nx]==order[cnt] && dice.dice[0]==order[cnt]) dfs(nx, ny, dice, cnt+1, cost+1);
	    if(map[ny][nx]=='w' && !vv[cnt+1][ny][nx]) dfs(nx, ny, dice, cnt, cost+1);
	    v[ny][nx] = false;
	    vv[cnt][ny][nx] = false;
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}