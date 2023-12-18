import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int m,n;
	int[][] a;
	int x0,y0;
	
	void run() {
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			a=new int[n][m];
			for(int j=0;j<n;j++){
				String s=sc.next();
				for(int i=0;i<m;i++){
					if(s.charAt(i)=='@'){
						x0=i;
						y0=j;
					}else if(s.charAt(i)=='#'){
						a[j][i]=1;
					}
				}
			}
			solve();
		}
	}

	void solve() {
		LinkedList<P> que=new LinkedList<P>();
		boolean[][] visited=new boolean[n][m];
		int ans=0;
		
		que.offer(new P(x0,y0));
		visited[y0][x0]=true;
		
		int[] dx={0,0,-1,1};
		int[] dy={-1,1,0,0};
		
		for(;!que.isEmpty();){
			P p=que.poll();
			ans++;
			for(int i=0;i<4;i++){
				P q=new P(p.x+dx[i],p.y+dy[i]);
				if(q.x>=0&&q.x<m&&q.y>=0&&q.y<n&&a[q.y][q.x]==0&&!visited[q.y][q.x]){
					que.offer(q);
					visited[q.y][q.x]=true;
				}
			}
		}
		println(ans+"");
	}
	
	class P{
		int x,y;
		P(int x,int y){
			this.x=x;
			this.y=y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}