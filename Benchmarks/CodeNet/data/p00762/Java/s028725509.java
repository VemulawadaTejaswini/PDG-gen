import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int[] dx = {0, -1, 0, 1};
		final int[] dy = {1, 0, -1, 0};
		final int sx = 100;
		final int sy = 100;
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			int[] res = new int[6];
			int[][] height = new int[201][201];// 高さマップ
			int[][] map = new int[201][201]; // 上から見える面マップ
			for(int i=0; i<n; i++){
				int t = in.nextInt();
				int f = in.nextInt();
				int x = sx;
				int y = sy;
				Dice dice = new Dice(t, f);
				while(true){
					// 転がりうる方向を求める
					HashSet<Integer> set = new HashSet<Integer>();
					for(int j=0; j<4; j++){
						if(height[y+dy[j]][x+dx[j]] < height[y][x]){
							set.add(j);
						}
					}
					int dirnum = dice.dirNum(set);
					if(dirnum < 4) break;
					int dir = dice.getDir(dirnum);
					dice.rolling(dirnum, dir);
					y += dy[dir];
					x += dx[dir];
				}
				map[y][x] = dice.top;
				height[y][x]++;
			}
			for(int i=0; i<=200; i++){
				for(int j=0; j<=200; j++){
					if(map[i][j] > 0) res[map[i][j]-1]++;
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<6; i++){
				sb.append(res[i]+" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
	
	public static String dump(int[][] map, int hs, int ws, int he, int we){
		StringBuilder sb = new StringBuilder();
		for(int i=hs; i<he; i++){
			for(int j=ws; j<we; j++){
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

class Dice{
	int front;
	int top;
	class Node{
		int num;
		int[] edge;
		public Node(int num){
			this.num = num;
			edge = new int[4];
		}
		
	}
	Node[] state;
	
	public Dice(int top, int front){
		this.top = top;
		this.front = front;
		init();
	}
	
	static final int[][] map = {
		{2, 4, 5, 3},
		{1, 3, 6, 4},
		{1, 5, 6, 2},
		{1, 2, 6, 5},
		{1, 4, 6, 3},
		{2, 3, 5, 4},		
	};
	private void init(){
		state = new Node[6];
		for(int i=1; i<=6; i++){
			state[i-1] = new Node(i);
		}
		for(int i=0; i<6; i++){
			for(int j=0; j<4; j++){
				state[i].edge[j] = map[i][j];
			}
		}
	}
	
	public int dirNum(HashSet<Integer> set){
		int res = 0;
		int fidx = getDirIdx(front);
		for(int i=0; i<4; i++){
			if(!set.contains((4+i-fidx)%4)) continue;
			res = Math.max(state[top-1].edge[i], res);
		}
		return res;
	}
	
	public int getDir(int dirnum){
		int idx = -1;
		int diridx = -1;
		for(int i=0; i<4; i++){
			// find front idx
			if(state[top-1].edge[i] == front){
				idx = i;
			}
			// find dirnum idx
			if(state[top-1].edge[i] == dirnum){
				diridx = i;
			}
		}
		return (4+diridx - idx)%4;
		// number of "front to dirnum"
	}
	
	public int getDirIdx(int dirnum){
		int diridx = -1;
		for(int i=0; i<4; i++){
			if(state[top-1].edge[i] == dirnum){
				diridx = i;
				break;
			}
		}
		return diridx;
	}
	
	public void rolling(int dirnum, int dir){
		int diridx = getDirIdx(dirnum);
		if(dir == 0) front = top;
		else if(dir == 2) front = 7-top;
		top = state[top-1].edge[(diridx+2)%4];
	}
}