import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if((w|h)==0)break;
			
			int[][] m = new int[h][w];
			
			int s_x = sc.nextInt()-1;
			int s_y = sc.nextInt()-1;
			int g_x = sc.nextInt()-1;
			int g_y = sc.nextInt()-1;
			
			int n = sc.nextInt();
			
			while(n--!=0){
				int c = sc.nextInt();
				int d = sc.nextInt();
				int t_x = sc.nextInt()-1;
				int t_y = sc.nextInt()-1;
				if(d==0)for(int i=0;i<2;i++)for(int j=0;j<4;j++)m[t_x+i][t_y+j]=c;
				else for(int i=0;i<4;i++)for(int j=0;j<2;j++)m[t_x+i][t_y+j]=c;
			}
			
			if(m[s_x][s_y]==0||m[g_x][g_y]==0||m[s_x][s_y]!=m[g_x][g_y]){
				System.out.println("NG");
				continue;
			}
			
			int x = m[s_x][s_y];
			
			boolean f = false;
			boolean[][] v = new boolean[h][w];
			v[s_x][s_y] = true;
			
			List<int[]> l = new ArrayList<int[]>();
			l.add(new int[]{s_x,s_y});
			
			while(!l.isEmpty()){
				List<int[]> next = new ArrayList<int[]>();
				for(int a[] : l){
					int i = a[0];
					int j = a[1];
					if(i==g_x&&j==g_y){
						f = true;
						next.clear();
						break;
					}
					for(int k=0;k<4;k++){
						int ni = i+move[k][0];
						int nj = j+move[k][1];
						if(0<=ni&&ni<h&&0<=nj&&nj<w&&!v[ni][nj]&&m[ni][nj]==x){
							v[ni][nj] = true;
							next.add(new int[]{ni,nj});
						}
					}
				}
				l = next;
			}
			System.out.println(f?" OK":"NG");
		}
	}
}