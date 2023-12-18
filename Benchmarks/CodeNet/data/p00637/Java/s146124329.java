import java.util.*;

public class Main{

    int h,w;
    int[][] board;
    int sx,sy,gx,gy;
    int[] dx = {0,1,0,-1};
    int[] dy = {-1,0,1,0};

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h==0 && w==0) break;

	    board = new int[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    board[i][j] = sc.nextInt();
		}
	    }

	    sy = sc.nextInt(); sx = sc.nextInt();
	    gy = sc.nextInt(); gx = sc.nextInt();

	    System.out.println(getMin());
	}
    }

    int getMin(){
	//x,y,up,south,east,pena
	PriorityQueue<int[]> 
	    q = new PriorityQueue<int[]>(20,new Comparator<int[]>(){
		    public int compare(int[] a, int[] b){
			return a[5] - b[5];
		    }
		});
	q.add(new int[]{sx,sy,1,2,3,0});
	boolean[][] v = new boolean[h][w];

	while(q.size()>0){
	    int[] qq = q.poll();
	    int x = qq[0], y = qq[1], 
		up = qq[2], south = qq[3], east = qq[4], pena = qq[5];

	    if(v[y][x]) continue;
	    v[y][x] = true;

	    if(x==gx && y==gy) return pena;

	    for(int i=0; i<4; i++){
		int nx = x+dx[i], ny = y+dy[i];
		if(nx>=0 && nx<w && ny>=0 && ny<h){
		    int[] dice = getDice(up,south,east,i);
		    q.add(new int[]{nx,ny,dice[0],dice[1],dice[2],
				    pena+(7-dice[0])*board[ny][nx]});
		}
	    }
	}

	return -1;
    }

    int[] getDice(int up, int south, int east, int direc){
	int newUp = 0, newSouth = 0, newEast = 0;
	if(direc==0){
	    newUp = south;
	    newEast = east;
	    newSouth = 7-up;
	}else if(direc==1){
	    newUp = 7-east;
	    newSouth = south;
	    newEast = up;
	}else if(direc==2){
	    newUp = 7-south;
	    newEast = east;
	    newSouth = up;
	}else{
	    newUp = east;
	    newSouth = south;
	    newEast = 7-up;
	}

	return new int[]{newUp,newSouth,newEast};
    }

    public static void main(String[] args){
	new Main().solve();
    }
}