import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){
		new Solution().solve();
	}
}

class Solution{
	
	private static final int PUDDLE = 0;
	private static final int NONE = 1;
	private static final int ANT = 2;
	private static final int HOLE = 3;
	private static final int FOOD = 4;
	private static final int INF = (1<<20);
	
	private int[][] grid;
	private Scanner scan;
	private int x,y,sx,sy,gx,gy;
	
	void solve(){
		scan = new Scanner(System.in);
		while(input()) System.out.println(dijkstra());
	}

	private boolean input(){
		x = scan.nextInt();
		y = scan.nextInt();
		grid = new int[x][y];
		
		for(int j = 0; j < y; j++){
			for(int i = 0; i < x; i++){	
				grid[i][j] = scan.nextInt();
				if(grid[i][j] == ANT){
					sx = i;
					sy = j;
				}
				if(grid[i][j] == HOLE){
					gx = i;
					gy = j;
				}
			}
		}
		return x!=0||y!=0;	
	}
	
	private int dijkstra(){
		PriorityQueue<State> Q = new PriorityQueue<State>();
		int T[][][] = new int[7][x][y];
		for(int i = 0; i < 7; i++)
			for(int j = 0; j < x; j++)
				for(int k = 0; k < y; k++) T[i][j][k] = INF;
		
		T[6][sx][sy] = 0;
		Q.add(new State(6,sx,sy,0));
		
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		
		while(!Q.isEmpty()){
			final State now = Q.poll();
		
			if(T[now.HP][now.x][now.y] < now.cost) continue;
		
			for(int i = 0; i < 4; i++){
				State nex = (State)now.clone();
				
				nex.x += dx[i];
				nex.y += dy[i];
				nex.HP--;
				nex.cost++;
				
				if(nex.HP <= 0) continue;
				if(nex.x < 0 || nex.x >= x) continue;
				if(nex.y < 0 || nex.y >= y) continue;
				if(grid[nex.x][nex.y] == PUDDLE) continue;
				if(grid[nex.x][nex.y] == FOOD) nex.HP = 6;
				
				if(T[nex.HP][nex.x][nex.y] > nex.cost){
					T[nex.HP][nex.x][nex.y] = nex.cost;
					Q.add(nex);
				}
				
			}
		}
		int res = INF;
		for(int i = 1; i < 7; i++) res = Math.min(res, T[i][gx][gy]);
		if(res == INF) res = -1;
		return res;
	}
}

class State implements Comparable, Cloneable{
	public int HP,x,y,cost;
	State(int HP, int x, int y, int cost){
		this.HP = HP;
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Object o) {
		return new Integer(((State)o).cost).compareTo(new Integer(this.cost));
	}
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString(){
		return HP + " " + x + " " + y + " " + cost;
	}
}