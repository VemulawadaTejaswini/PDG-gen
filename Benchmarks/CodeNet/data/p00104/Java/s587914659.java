import java.util.*;

public class Main {
	int w,h;
	int[][] map;
	int[][] cost;
	int ansx, ansy;
	
	
	public void loop(int y, int x, int d){
		if(map[y][x]==0){
			System.out.println(x + " " + y);
			return;
		}
		
		cost[y][x] = 1;
		if(d==1){
			if(cost[y-1][x]==1){
				System.out.println("LOOP");
				return;
			}else{
				loop(y-1,x,map[y-1][x]);
			}
		}else if(d==2){
			if(cost[y][x+1]==1){
				System.out.println("LOOP");
				return;
			}else{
				loop(y,x+1,map[y][x+1]);
			}
		}else if(d==3){
			if(cost[y+1][x]==1){
				System.out.println("LOOP");
				return;
			}else{
				loop(y+1,x,map[y+1][x]);
			}
		}else if(d==4){
			if(cost[y][x-1]==1){
				System.out.println("LOOP");
				return;
			}else{
				loop(y,x-1,map[y][x-1]);
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		Main A = new Main();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			A.h = sc.nextInt();
			A.w = sc.nextInt();
			if(A.h==0 && A.w==0)break;
			
			A.map = new int[A.h][A.w];
			A.cost = new int[A.h][A.w];
			
			for(int i=0;i<A.h;i++){
				String s = sc.next();
				for(int j=0;j<A.w;j++){
					String t = s.substring(j,j+1);
					if(t.compareTo("^")==0){
						A.map[i][j] = 1;
					}else if(t.compareTo(">")==0){
						A.map[i][j] = 2;
					}else if(t.compareTo("v")==0){
						A.map[i][j] = 3;
					}else if(t.compareTo("<")==0){
						A.map[i][j] = 4;
					}		
				}
			}
			A.loop(0, 0, A.map[0][0]);

		}
	}	
}