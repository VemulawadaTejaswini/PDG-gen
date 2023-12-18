import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//2352 start
	
	int [] vx = {0,1,0,-1};
	int [] vy = {-1,0,1,0};
	int w,h;
	
	class State {
		int x,y,dir,step;

		public State(int x, int y, int dir, int step) {
			this.x = x;
			this.y = y;
			this.dir = dir;
			this.step = step;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			long l = sc.nextLong();
			if((h|w|l) == 0) break;
			
			boolean [][] isNG = new boolean[h][w];
			int sx = -1, sy = -1, sd = -1;
			for(int i = 0; i < h; i++){
				String s = sc.next();
				for(int j = 0; j < w; j++){
					char c = s.charAt(j);
					if(c == '#'){
						isNG[i][j] = true;
					}
					
					if(Character.isLetter(c)){
						sx = j;
						sy = i;
						if(c == 'N'){
							sd = 0;
						}
						if(c == 'E') sd = 1;
						if(c == 'S') sd = 2;
						if(c == 'W') sd = 3;
						
					}
				}
			}
			LinkedList<State> open = new LinkedList<Main.State>();
			open.add(new State(sx, sy, sd, 0));
			int INF = 1 << 24;
			int [][][] close = new int[h][w][4];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w;j++){
					Arrays.fill(close[i][j], INF);
				}
			}
			close[sx][sy][sd] = 0;
			ArrayList<State> steplist  = new ArrayList<Main.State>();
			steplist.add(new State(sx, sy, sd, 0));
			int c = 1 << 24;
			int offset = 0;
			while(! open.isEmpty()){
				State now = open.removeFirst();
				int xx=-1, yy=-1, nd = -1;
				for(int i = 0; i < 4; i++){
					xx = now.x + vx[(now.dir + i) % 4];
					yy = now.y + vy[(now.dir + i) % 4];
					if(! isOK(xx,yy)) continue;
					if(isNG[yy][xx]) continue;
					nd = (now.dir + i) % 4;
					break;
				}
				
				if(close[yy][xx][nd] != INF){
					c = now.step +1 - close[yy][xx][nd];
					l = l - close[yy][xx][nd];
					offset =  close[yy][xx][nd];
				}
				else if(now.step + 1 == l){
					steplist.add(new State(xx, yy, nd, now.step + 1));
				}
				else{
					open.add(new State(xx, yy, nd, now.step + 1));
					close[yy][xx][nd] = now.step + 1;
					steplist.add(new State(xx, yy, nd, now.step + 1));
				}
				
			}
			int rotate = (int) (l % c);
			State res = steplist.get(rotate + offset);
			int x = res.x + 1;
			int y = res.y + 1;
			char [] table = {'N','E','S','W'};
			char dir = table[res.dir];
			System.out.println(y + " " + x + " " + dir);
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0<= yy && yy < h){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}