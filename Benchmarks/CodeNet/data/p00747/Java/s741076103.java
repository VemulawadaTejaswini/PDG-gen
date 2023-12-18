
import java.util.*;

class P{
	int x,y,k;
	P(int x,int y,int k){
		this.x=x;
		this.y=y;
		this.k=k;
	}
}

public class Main {
	int ans;
	int maze[][];
	int n,m;
	int bx[]={1,0,-1,0};
	int by[]={0,1,0,-1};
	int mx[]={2,0,-2,0};
	int my[]={0,2,0,-2};
	Queue<P> q=new LinkedList<P>();

	void dfs(int x,int y,int d){
		int nx,ny;
		if(x==n-1 && y==m-1){
			if(ans==0 || d<ans)
			ans=d+1;
			return;
		}
		maze[y][x]=2;
		for(int i=0;i<4;i++){
			nx=x+mx[i];
			ny=y+my[i];
			if(0<=nx && nx<n && 0<=ny && ny<m && maze[y+by[i]][x+bx[i]]!=1 && maze[ny][nx]!=2){
				System.out.println(nx+" "+ny);
				dfs(nx,ny,d+1);
			}
		}
	}
	void bfs(){
		q.offer(new P(0,0,1));
		while(!q.isEmpty()){
			P np=q.poll();
			if(np.x==n-1 && np.y==m-1){
				ans=np.k;
				return;
			}
			if(np.x+2<n && maze[np.y][np.x+1]!=1){
				q.offer(new P(np.x+2,np.y,np.k+1));
				maze[np.y][np.x+1]=1;
			}
			if(np.y+2<m && maze[np.y+1][np.x]!=1){
				q.offer(new P(np.x,np.y+2,np.k+1));
				maze[np.y+1][np.x]=1;
			}
			if(0<=np.x-2 && maze[np.y][np.x-1]!=1){
				q.offer(new P(np.x-2,np.y,np.k+1));
				maze[np.y][np.x-1]=1;
			}
			if(0<=np.y-2 && maze[np.y-1][np.x]!=1){
				q.offer(new P(np.x,np.y-2,np.k+1));
				maze[np.y-1][np.x]=1;
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
			ans=0;
			//dfs(0,0,0);
			bfs();
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();

	}

}