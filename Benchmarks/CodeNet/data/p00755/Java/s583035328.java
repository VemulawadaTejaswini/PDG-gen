import java.util.*;

public class Main {
	int h, w, c;
	int[][] cost, costzero;
	int[][][] map;
	ArrayList<Integer> stack = new ArrayList<Integer>();
	int ans=0;
	int sum=0;
		
	public void zero(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				cost[i][j]=0;
			}
		}
	}
	
	public void change(int z, int y, int x, int a){
		int b = map[z-1][0][0];
		map[z][y][x]=a;
		if(y!=0 && map[z][y-1][x]==0 && map[z-1][y-1][x]==b)change(z, y-1, x, a);
		if(x!=0 && map[z][y][x-1]==0 && map[z-1][y][x-1]==b)change(z, y, x-1, a);
		if(y!=h-1 && map[z][y+1][x]==0 && map[z-1][y+1][x]==b)change(z, y+1, x, a);
		if(x!=w-1 && map[z][y][x+1]==0 && map[z-1][y][x+1]==b)change(z, y, x+1, a);
	}
	
	public void check(int y, int x){
		cost[y][x]=1;
		sum++;
		if(y!=0 && map[5][y-1][x]==c && cost[y-1][x]==0)check(y-1, x);
		if(x!=0 && map[5][y][x-1]==c && cost[y][x-1]==0)check(y, x-1);
		if(y!=h-1 && map[5][y+1][x]==c && cost[y+1][x]==0)check(y+1, x);
		if(x!=w-1 && map[5][y][x+1]==c && cost[y][x+1]==0)check(y, x+1);
	}
	
	public void fill(int z, int f){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(f==0)map[z][i][j]=0;
				if(f==1 && map[z][i][j]==0)map[z][i][j]=map[z-1][i][j];
			}
		}
	}
	
	public void func(int s){
		if(s!=5){
			for(int i=1;i<7;i++){
				if(s==4)i=c;
				if(i!=map[s][0][0]){
					stack.add(i);
					change(s+1,0,0,i);
					fill(s+1,1);
					func(s+1);
				}
				if(s==4)i=7;
			}
		}
		if(s==5){
			check(0,0);
			if(sum>ans)ans=sum;
			zero();
			sum=0;
		}
		fill(s,0);
		if(stack.size()!=0)stack.remove(stack.size()-1);
	}
	
	
	public static void main(String[] args) {
		Main C = new Main();
		Scanner sc = new Scanner(System.in);
		int exit=0;
		while(exit==0){
			C.h = sc.nextInt();
			C.w = sc.nextInt();
			C.c = sc.nextInt();
			if(C.h==0 && C.w==0 && C.c==0)exit=1;
			if(exit==0){
				C.map = new int[6][C.h][C.w];
				C.cost = new int[C.h][C.w];				
				for(int i=0;i<C.h;i++){
					for(int j=0;j<C.w;j++){
						C.map[0][i][j]=sc.nextInt();
					}
				}
				C.func(0);
				System.out.println(C.ans);
				C.ans=0;
			}
		}
	}
	
}