import java.util.*;
import static java.lang.Math.*;
public class Main{
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1182();
	}
	
	class AOJ1182{
		AOJ1182(){
			while(sc.hasNext()){
				n=sc.nextInt();
				m=sc.nextInt();
				c=sc.nextInt();
				s=sc.nextInt();
				g=sc.nextInt();
				if(n==0)	break;
				--s; --g;
				solve();
			}
		}
		int n,m,c,s,g;
		final int INF = 1<<29;
		int[] p;
		int[][] q,r;
		int[][][] map;
		void solve(){
			map=new int[n][n][c];
			for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)for(int k=0; k<c; ++k)	map[i][j][k]=INF;
			for(int i=0; i<m; ++i){
				int x=sc.nextInt(),y=sc.nextInt(),d=sc.nextInt(),c=sc.nextInt();
				--x; --y; --c;
				map[x][y][c]=min(map[x][y][c], d);
				map[y][x][c]=min(map[y][x][c], d);
			}
			p=new int[c];
			for(int i=0; i<c; ++i)p[i]=sc.nextInt();
			
			q=new int[c][];
			r=new int[c][];
			for(int i=0; i<c; ++i){
				q[i]=new int[p[i]];
				r[i]=new int[p[i]];
				for(int j=0; j<p[i]-1; ++j)	q[i][j]=sc.nextInt();
				q[i][p[i]-1]=INF;
				for(int j=0; j<p[i]; ++j)	r[i][j]=sc.nextInt();
			}
			
			for(int l=0; l<c; ++l)for(int j=0; j<n; ++j)for(int i=0; i<n; ++i)for(int k=0; k<n; ++k)	map[i][k][l]=min(map[i][k][l], map[i][j][l]+map[j][k][l]);
			
			int[][] closed=new int[n][c];
			for(int i=0; i<n; ++i)for(int j=0; j<c; ++j)	closed[i][j]=INF;
			
			PriorityQueue<State> open = new PriorityQueue<State>();
			open.add(new State(s,s,-1,0));
			
			int ans=INF;
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.p==g){
					ans=now.cost;
					break;
				}
				for(int i=0; i<n; ++i)for(int j=0; j<c; ++j){
					if(map[now.p][i][j]>=INF)	continue;
					if(now.c==j)	continue;
					int next = getCost(now.p, i, j);
					if(closed[i][j] <= now.cost+next)	continue;
					
					open.add(new State(i, now.p, j, now.cost+next));
					closed[i][j]=now.cost+next;
					
				}
			}
			System.out.println((ans>=INF? -1: ans));
		}
		int getCost(int from,int to,int c){
			int d=map[from][to][c],
				ret=0,
				idx=0;
			for(int i=1; i<=d; ++i){
				if(q[c][idx]<i)	++idx;
				if(idx>=p[c]-1){
					ret+=r[c][idx]*(idx>0?(d-q[c][idx-1]) :d);
					break;
				}else	ret+=r[c][idx];
			}
			return ret;
		}
		class State implements Comparable<State>{
			int p,b,c,cost;
			State(int p,int b,int c,int cost){
				this.p=p;
				this.b=b;
				this.c=c;
				this.cost=cost;
			}
			@Override public int compareTo(State o){
				return this.cost-o.cost;
			}
		}
	}
}