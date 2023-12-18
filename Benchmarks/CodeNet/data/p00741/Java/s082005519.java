import java.util.Scanner;

public class Main {
	static int w,h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			if(w==0&&h==0) break;
			int[][] map = new int[h][w];
			int[][] flag = new int[h][w];
			for(int j=0;j<h;++j){
				for(int i=0;i<w;++i){
					map[j][i]=sc.nextInt();
				}
			}
			int count=0;
			for(int j=0;j<h;++j){
				for(int i=0;i<w;++i){
					if(map[j][i]==1&&flag[j][i]==0){
						flag[j][i]=1;
						mapping(map,flag,i,j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void mapping(int[][]map,int[][]flag,int i,int j){
		if(i!=0){
			if(map[j][i-1]==1&&flag[j][i-1]==0){
				flag[j][i-1]=1;
				mapping(map,flag,i-1,j);
			}
		}
		if(j!=0){
			if(map[j-1][i]==1&&flag[j-1][i]==0){
				flag[j-1][i]=1;
				mapping(map,flag,i,j-1);
			}
		}
		if(i!=w-1){
			if(map[j][i+1]==1&&flag[j][i+1]==0){
				flag[j][i+1]=1;
				mapping(map,flag,i+1,j);
			}
		}
		if(j!=h-1){
			if(map[j+1][i]==1&&flag[j+1][i]==0){
				flag[j+1][i]=1;
				mapping(map,flag,i,j+1);
			}
		}
		if(i!=0&&j!=0){
			if(map[j-1][i-1]==1&&flag[j-1][i-1]==0){
				flag[j-1][i-1]=1;
				mapping(map,flag,i-1,j-1);
			}
		}
		if(i!=0&&j!=h-1){
			if(map[j+1][i-1]==1&&flag[j+1][i-1]==0){
				flag[j+1][i-1]=1;
				mapping(map,flag,i-1,j+1);
			}
		}
		if(i!=w-1&&j!=0){
			if(map[j-1][i+1]==1&&flag[j-1][i+1]==0){
				flag[j-1][i+1]=1;
				mapping(map,flag,i+1,j-1);
			}
		}
		if(i!=w-1&&j!=h-1){
			if(map[j+1][i+1]==1&&flag[j+1][i+1]==0){
				flag[j+1][i+1]=1;
				mapping(map,flag,i+1,j+1);
			}
		}
	}
}
