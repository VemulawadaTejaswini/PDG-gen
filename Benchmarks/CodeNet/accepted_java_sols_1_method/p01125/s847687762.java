import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			int[][] grid = new int[21][21];
			for(int i = 0; i < n; i++){
				grid[sc.nextInt()][sc.nextInt()]++;
			}
			int cou = 0;
			int m = sc.nextInt();
			int x = 10;
			int y = 10;
			for(int i = 0; i < m; i++){
				String d = sc.next();
				int l = sc.nextInt();
				if(d.equals("N")){
					for(int j = 0; j <= l; j++){
						if(grid[x][y+j]==1){
							cou++;
							grid[x][y+j]=0;
						}
					}
					y+=l;
				}else if(d.equals("S")){
					for(int j = 0; j <= l; j++){
						if(grid[x][y-j]==1){
							cou++;
							grid[x][y-j]=0;
						}
					}
					y-=l;
				}else if(d.equals("E")){
					for(int j = 0; j <= l; j++){
						if(grid[x+j][y]==1){
							cou++;
							grid[x+j][y]=0;
						}
					}
					x+=l;
				}else if(d.equals("W")){
					for(int j = 0; j <= l; j++){
						if(grid[x-j][y]==1){
							cou++;
							grid[x-j][y]=0;
						}
					}
					x-=l;
				}
			}
			System.out.println(cou==n?"Yes":"No");
			n = sc.nextInt();
		}
	}
}

