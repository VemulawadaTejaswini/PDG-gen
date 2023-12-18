import java.util.*;

public class Main {
	int w, h;
	int[][] map;
	
	public void func(){
		int count = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]==1){
					loop(i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public void loop(int y, int x){
		map[y][x]--;
		
		if(x!=0 && map[y][x-1]==1)loop(y, x-1);
		if(x!=w-1 && map[y][x+1]==1)loop(y, x+1);
		if(y!=0 && map[y-1][x]==1)loop(y-1, x);
		if(y!=h-1 && map[y+1][x]==1)loop(y+1, x);
		
		if(x!=0 && y!=0 && map[y-1][x-1]==1)loop(y-1, x-1);
		if(x!=w-1 && y!=h-1 && map[y+1][x+1]==1)loop(y+1, x+1);
		if(y!=0 && x!=w-1 && map[y-1][x+1]==1)loop(y-1, x+1);
		if(y!=h-1 && x!=0 && map[y+1][x-1]==1)loop(y+1, x-1);		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main A = new Main();
		
		while(true){
			A.w = sc.nextInt();
			A.h = sc.nextInt();
			if(A.w==0 && A.h==0)break;
			A.map = new int[A.h][A.w];
			
			for(int i=0;i<A.h;i++){
				for(int j=0;j<A.w;j++){
					A.map[i][j] = sc.nextInt();
				}
			}
			A.func();
			
		}
	
	}	
}