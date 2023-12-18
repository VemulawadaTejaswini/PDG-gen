import java.util.*;
public class Main {
	int [] vx = {1,0,-1,0};
	int [] vy = {0,-1,0,1};
	
	class C{
		int top,bottom,front,backfront,side,backside;

		public C(int top, int front) {
			this.top = top; this.front = front;
			this.bottom = 7 - top;
			this.backfront = 7 - front;
			
			this.side = getSide(top,front);
			this.backside = 7 - this.side;
		}

		private int getSide(int t, int f) {
			if(t == 1 && f == 2) return 3;
			if(t == 1 && f == 3) return 5;
			if(t == 1 && f == 4) return 2;
			if(t == 1 && f == 5) return 4;
			
			if(t == 2 && f == 1) return 4;
			if(t == 2 && f == 3) return 1;
			if(t == 2 && f == 4) return 6;
			if(t == 2 && f == 6) return 3;
			
			if(t == 3 && f == 1) return 2;
			if(t == 3 && f == 2) return 6;
			if(t == 3 && f == 5) return 1;
			if(t == 3 && f == 6) return 5;
			
			if(t == 4 && f == 1) return 5;
			if(t == 4 && f == 2) return 1;
			if(t == 4 && f == 5) return 6;
			if(t == 4 && f == 6) return 2;
			
			if(t == 5 && f == 1) return 3;
			if(t == 5 && f == 3) return 6;
			if(t == 5 && f == 4) return 1;
			if(t == 5 && f == 6) return 4;
			
			if(t == 6 && f == 2) return 4;
			if(t == 6 && f == 3) return 2;
			if(t == 6 && f == 4) return 5;
			if(t == 6 && f == 5) return 3;
			return -1;
		}
		
		private void turn(int dir){
			int temp;
			switch(dir){
			case 0:
				//right
				temp = top;
				top = backside;
				backside = bottom;
				bottom = side;
				side = temp;
				break;
			case 1:
				//bottom
				temp = top;
				top = backfront;
				backfront = bottom;
				bottom = front;
				front = temp;
				break;
			case 2:
				//left
				temp = top;
				top = side;
				side = bottom;
				bottom = backside;
				backside = temp;
				break;
			case 3:
				//top
				temp = top;
				top = front;
				front = bottom;
				bottom = backfront;
				backfront = temp;
				break;
			}
		}
		
		private int getNum(int dir) {
			int res = -1;
			switch(dir){
			case 0:
				res = this.side;
				break;
			case 1:
				res = this.front;
				break;
			case 2:
				res = this.backside;
				break;
			case 3:
				res = this.backfront;
				break;
			}
			return res;
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			C [][][] map = new C[100][200][200];
			for(int i = 0; i < n ; i++){
				int top = sc.nextInt();
				int front = sc.nextInt();
				C now = new C(top,front);
				int xpos = 100;
				int ypos = 100;
				int nowh = 0;
				//calc a height
				while(map[nowh][ypos][xpos] != null){
					nowh++;
				}

				while(true){
					map[nowh][ypos][xpos] = now;
					//System.out.println("i = " + i + " nowh = " + nowh + " xpos " + xpos + " ypos=  " + ypos );
					// find turn dir
					int max= -1, maxdir = -1;
					for(int j = 0; j < 4;j++){
						int xx = xpos + vx[j];
						int yy = ypos + vy[j];
						if(nowh == 0){
							break;
						}
						boolean cond1 = (map[nowh-1][yy][xx] == null);
						int turnface = now.getNum(j);
						boolean cond2 = turnface > 3;
						if(cond1 && cond2){
							//comp
							if(max < turnface){
								max = turnface;
								maxdir = j;
							}
						}
					}
					
					//is turn
					if(max > -1){
						
						map[nowh][ypos][xpos] = null;
						int nextx = xpos + vx[maxdir];
						int nexty = ypos + vy[maxdir];
						now.turn(maxdir);
						xpos = nextx;
						ypos = nexty;
						nowh--;
					}
					else{
						//not turn;
						break;
					}
				}
				
			}
			
			//print
			printMap(map);
		}
	}

	private void printMap(C[][][] map) {
		int [] count = new int[7];
		for(int i=0; i < map[0].length;i++){
			for(int j = 0; j < map[0][i].length;j++){
				int k = 0;
				while(map[k][i][j] != null){
					k++;
				}
				if(k > 0){
					int ind = map[k-1][i][j].top;
					//System.out.println("d1= " + ind + " i= " + i + " j = " + j + " k= " + k);
					count[ind]++;
				}
				
			}
		}
		
		for(int i=1; i < count.length-1; i++){
			System.out.print(count[i] + " ");
		}
		System.out.println(count[count.length-1]);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}