import java.util.*;

public class Main {
	int w, h;
	int[][] map;
	int[][] cost;
	
	public void loop(int y, int x){
		cost[y][x]++;
		if(x!=0 && map[y][x-1]==0 && cost[y][x-1]==0){
			loop(y,x-1);
		}
		if(x!=w-1 && map[y][x+1]==0 && cost[y][x+1]==0){
			loop(y,x+1);
		}
		if(y!=0 && map[y-1][x]==0 && cost[y-1][x]==0){
			loop(y-1,x);
		}
		if(y!=h-1 && map[y+1][x]==0 && cost[y+1][x]==0){
			loop(y+1,x);
		}	
	}
	
	public void check(){
		int count=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(cost[i][j]>0)count++;
			}
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		Main A = new Main();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			A.w = sc.nextInt();
			A.h = sc.nextInt();
			if((A.w|A.h)==0)break;
			
			A.map = new int[A.h][A.w];
			A.cost = new int[A.h][A.w];
			
			String t = "";
			int x = 0;
			int y = 0;
			for(int i=0;i<A.h;i++){
				t = sc.next();
				for(int j=0;j<A.w;j++){
					if(t.codePointAt(j)==35){
						A.map[i][j] = 1;
					}else if(t.codePointAt(j)==64){
						A.map[i][j] = 2;
						x = j;
						y = i;
					}
				}
			}
			A.loop(y, x);
			A.check();
		}
	}
}