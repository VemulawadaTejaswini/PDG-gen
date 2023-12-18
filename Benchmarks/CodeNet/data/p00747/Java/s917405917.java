
import java.util.Scanner;

public class Main {
	int ans;
	int maze[][];
	int n,m;
	int bx[]={1,0,-1,0};
	int by[]={0,1,0,-1};
	int mx[]={2,0,-2,0};
	int my[]={0,2,0,-2};

	void dfs(int x,int y,int d){
		int nx,ny;
		if(x==n-1 && y==m-1){
			if(ans==0 || d<ans)
			ans=d;
			return;
		}
		maze[y][x]=2;
		for(int i=0;i<4;i++){
			nx=x+mx[i];
			ny=y+my[i];
			if(0<=nx && nx<n && 0<=ny && ny<m && maze[y+by[i]][x+bx[i]]!=1 && maze[ny][nx]!=2){
				//System.out.println(nx+" "+ny);
				dfs(nx,ny,d+1);
			}
		}
	}

	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if((a|b)==0) break;
			n=a*2-1;
			m=b*2-1;
			maze=new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if((i+j)%2==0){
						maze[i][j]=0;
						continue;
					}
					maze[i][j]=sc.nextInt();
				}
			}

//			for(int i=0;i<m;i++){
//				for(int j=0;j<n;j++){
//					System.out.print(maze[i][j]+" ");
//				}
//				System.out.println();
//			}

			ans=0;
			dfs(0,0,1);
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();

	}

}