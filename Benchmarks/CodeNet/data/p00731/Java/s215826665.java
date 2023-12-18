import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
//        new aoj2585().doIt();
    	new aoj1150().doIt();
    }
    class aoj1150{
    	char map[][] = new char [61][31];
    	int cost_map[][][] = new int [61][31][2];
    	int mlx[] = {-1,-1,-1,-1,-1,-2,-2,-2,-3};
    	int mly[] = {2,1,0,-1,-2,1,0,-1,0};
    	int mrx[] = {1,1,1,1,1,2,2,2,3};
    	int mry[] = {2,1,0,-1,-2,1,0,-1,0};
    	PriorityQueue<Par_Par> pos = new PriorityQueue<Par_Par>();
    	void clear(int W,int H){
    		pos.clear();
    		for(int i = 0;i < H;i++){
    			for(int j = 0;j < W;j++){
    				cost_map[i][j][0] = 10000000;
                    cost_map[i][j][1] = 10000000;
    			}
    		}
    	}
    	void set(int W,int H){
    		for(int i = 0;i < H;i++){
    			for(int j = 0;j < W;j++){
    				map[i][j] = sc.next().charAt(0);
    				if(map[i][j] == 'S'){
    					pos.add(new Par_Par(j, i, 0, 0));
    					pos.add(new Par_Par(j, i, 0, 1));
    				}
    			}
    		}
    	}
    	int bfs(int W,int H){
    		while(pos.size() > 0){
    			Par_Par pp = pos.poll();
//    			System.out.println(pp.x+" "+pp.y+" "+pp.cost+" "+"ok");
                if(map[pp.y][pp.x] =='T')return pp.cost;
                else if(map[pp.y][pp.x]=='X')continue;
                else if(map[pp.y][pp.x]=='S')pp.cost += 0;
                else pp.cost += Integer.parseInt(""+map[pp.y][pp.x]);
                
                if(cost_map[pp.y][pp.x][pp.left_right]<=pp.cost){
                	continue;
                }
                cost_map[pp.y][pp.x][pp.left_right] = pp.cost;
                if(pp.left_right==0){
                	for(int i = 0;i < 9;i++){
                		int x = pp.x + mrx[i];
                		int y = pp.y + mry[i];
                		if(x >= W || y < 0 || y >= H)continue; 
                        pos.add(new Par_Par(x, y, pp.cost, 1));
                	}
                }else if(pp.left_right==1){
                	for(int i = 0;i < 9;i++){
                		int x = pp.x + mlx[i];
                		int y = pp.y + mly[i];
                		if(x < 0 || y < 0 || y >= H)continue;
                        pos.add(new Par_Par(x, y, pp.cost, 0));
                    }
                }
    		}
    		return -1;
    	}
    	void doIt(){
    		while(true){
    			int W = sc.nextInt();
    			int H = sc.nextInt();
    			if(W+H == 0)break;
    			clear(W,H);
    			set(W,H);
    			System.out.println(bfs(W,H));
    		}
    	}
    	class Par_Par implements Comparable<Par_Par>{
    		int x,y,cost,left_right;
            public Par_Par(int x,int y,int cost,int left_right) {
                this.x = x;
                this.y = y;
                this.cost = cost;
                this.left_right = left_right;
            }
            public int compareTo(Par_Par o) {
                return this.cost - o.cost;
            }
    	}
    }
    class aoj2585{
    	int W,H;
    	int map[][] = new int[21][21];
    	boolean stay[][] = new boolean[21][21];
    	int mx[] = {0,1,0,-1};
    	int my[] = {1,0,-1,0};
    	int result = 0;
    	class Par{
    		int y,x;
    		public Par(int y,int x){
    			this.y = y;
    			this.x = x;
    		}
    	}
    	void dfs(int W,int H,Par end,Par start,int cnt){
    		if(start.x == end.x && start.y == end.y){
    			result = Math.min(result,cnt);
    		}
    		if(cnt < 10){
    			for(int i = 0;i < 4;i++){
    				if(start.x + mx[i] < 0 || start.x + mx[i] >= W
    						|| start.y + my[i] < 0 || start.y + my[i] >= H)continue;
    				else if(map[start.y + my[i]][start.x + mx[i]] == 1)continue;
    				
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			Par end,start;
    			W = sc.nextInt();
    			H = sc.nextInt();
    			if(W + H == 0)break;
    			for(int i = 0;i < H;i++){
    				for(int j = 0;j < W;j++){
    					map[i][j] = sc.nextInt();
    					if(map[i][j] == 2){
    						stay[i][j] = true;
    						start = new Par(i,j);
    					}
    					else if(map[i][j] == 3)end = new Par(i,j);
    				}
    			}
    			System.out.println(result);
    		}
    	}
    }
}