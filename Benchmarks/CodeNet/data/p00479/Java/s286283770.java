import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0556().doIt();
	}
	
	class AOJ0556{
		int[][] map;
		int n;
		void dfs(int x,int y,int c){//何回曲がったか
//			System.out.println("-------------");
			if(map[y][x]!=0)return;
			LinkedList<State> q = new LinkedList<State>();
			q.add(new State(x, y, 0,0));
			int sx[] = {0,1,0,-1};
			int sy[] = {-1,0,1,0};
			while(q.size()>0){
				State now = q.remove();
				if(now.r>=4)break;
				map[now.y][now.x]=c;
				int re = now.r;
				int m = now.muki;
				int nx = sx[m]+now.x;
				int ny = sy[m]+now.y;
				if(nx<0||nx>=n||ny<0||ny>=n||map[ny][nx]!=0){
//					if((nx<0||nx>=n||ny<0||ny>=n)==false)System.out.println("re "+nx+" "+ny+" "+map[ny][nx]);
					m=(m+3)%4;
					nx = sx[m]+now.x;
					ny = sy[m]+now.y;
					re++;
				}
				if(nx<0||nx>=n||ny<0||ny>=n||map[ny][nx]!=0)break;
				q.add(new State(nx, ny, m, re));
			}
		}
		
		void print(){
			for(int i=0;i<n;i++){
				for(int s=0;s<n;s++)System.out.print(map[i][s]);
				System.out.println();
			}
		}
		
		void doIt(){
			n = in.nextInt();
			map = new int[n][n];
			int cnt = 0;
			for(int i=n-1;i>=0;i--){
				dfs(i,i,(cnt%3)+1);
				cnt++;
			}
//			print();
			int k = in.nextInt();
			for(int i=0;i<k;i++){
				int x = in.nextInt()-1;
				int y = in.nextInt()-1;
				System.out.println(map[y][x]);
			}
		}
		class State{
			int x,y,muki,r;
			public State(int x,int y,int muki,int r){
				this.x = x;
				this.y = y;
				this.muki = muki;
				this.r = r;
			}
		}
	}
	
}