import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	static int[][] side_wall;
	static int[][] under_wall;
	static int[][] flag;
	static int[][] map;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			w = scan.nextInt();
			h = scan.nextInt();
			if (w==0 && h==0) break;
			side_wall = new int[h][w];
			under_wall = new int[h][w];
			for(int j=0;j<h;++j){
				for(int i=0;i<w-1;++i){
					side_wall[j][i]=scan.nextInt();
				}
				side_wall[j][w-1]=1;
				if(j==h-1){
					for(int i=0;i<w-1;++i){
						under_wall[j][i]=1;
					}
					under_wall[j][w-1]=0;
				} else {
					for(int i=0;i<w;++i){
						under_wall[j][i]=scan.nextInt();
					}
				}
			}
			flag = new int[h][w];
			map = new int[h][w];
			mapping(0,0,1,1);
			System.out.println(map[h-1][w-1]);
		}
	}
	
	public static void mapping(int x, int y, int count, int dir){
		if(map[y][x]==0 || map[y][x]>count) map[y][x]=count;
		if(x+1<w && dir!=-2){
			if(side_wall[y][x]==0 && (map[y][x+1]>count || map[y][x+1]==0)){
				mapping(x+1,y,map[y][x]+1,2);
			}
		}
		if(x-1>=0&&dir!=2){
			if(side_wall[y][x-1]==0&&(map[y][x-1]>count || map[y][x-1]==0)){
				mapping(x-1,y,map[y][x]+1,-2);
			}
		}
		if(y-1>=0&&dir!=1){
			if(under_wall[y-1][x]==0&&(map[y-1][x]>count || map[y-1][x]==0)){
				mapping(x,y-1,map[y][x]+1,-1);
			}
		}
		if(y+1<h && dir!=-1){
			if(under_wall[y][x]==0 &&(map[y+1][x]>count || map[y+1][x]==0)){
				mapping(x,y+1,map[y][x]+1,1);
			}
		}
	}
}

