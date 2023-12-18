import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import sun.tools.jar.resources.jar;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int m, n;
	char[][] map0;

	void run(){
		m=sc.nextInt();
		n=sc.nextInt();
		map0=new char[n][];
		sc.nextLine();
		for(int i=0; i<n; i++){
			map0[i]=sc.nextLine().toCharArray();
		}
		solve();
	}

	void solve(){
		// テ・ツ仰陛」ツ?凝」ツ?療」ツ?ヲテ」ツ??」ツ??」ツ?ョテ」ツつ津ヲツアツコテ」ツつ?」ツつ?
		// x0,y0, テ「ツ?妥」ツ?ョテ、ツスツ催ァツスツョテ」ツ?ァテ」ツつケテ」ツつソテ」ツδシテ」ツδ?
		int xs=-1, ys=-1;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(map0[j][i]=='@'){
					xs=i;
					ys=j;
				}
			}
		}
		debug("xs", xs, "ys", ys);
		boolean ok=false;
		for(int y2=0; y2<n; y2++){
			for(int x2=0; x2<m; x2++){
				if(!isMirrorOrCrystal(x2, y2, map0)){
					continue;
				}
				// if(x2==2&&y2==5)
				ok|=hoge(xs, ys, new P[]{new P(x2, y2)});
				for(int y1=0; y1<n; y1++){
					for(int x1=0; x1<m; x1++){
						if(isMirrorOrCrystal(x1, y1, map0)){
							ok|=hoge(xs, ys, new P[]{new P(x1, y1),
									new P(x2, y2)});
						}
					}
				}
			}
		}
		ok|=hoge(xs, ys, new P[]{});
		debug(ok);
		// テ」ツ?ソテ」ツつ嘉」ツδシテ」ツ?古」ツ?イテ」ツ?ィテ」ツ?、テ」ツつづ」ツ?ェテ」ツ??」ツ?ィテ」ツ??
		println(ok?"Yes":"No");
	}

	class State{
		int x, y, x1, y1, x2, y2;

		State(int x, int y, int x1, int y1, int x2, int y2){
			this.x=x;
			this.y=y;
			this.x1=x1;
			this.y1=y1;
			this.x2=x2;
			this.y2=y2;
		}

		public int hashCode(){
			int hash=y*m+x;
			hash=hash*m*n+y1*m+x1;
			hash=hash*m*n+y2*m+x2;
			return hash;
		}

		@Override
		public boolean equals(Object o){
			return hashCode()==o.hashCode();
		}

	}

	boolean hoge(int xs, int ys, P[] ps){
		debug("s", xs, ys);
		int pp=ps.length;
		for(int i=0; i<pp; i++){
			debug("p", i, ps[i].x, ps[i].y);
		}
		char[][] map=new char[n][m];
		char[][] map1=new char[n][m];
		for(int i=0; i<n; i++){
			System.arraycopy(map0[i], 0, map1[i], 0, m);
		}
		char[] cs=new char[pp];
		for(int i=0; i<pp; i++){
			cs[i]=map1[ps[i].y][ps[i].x];
			map1[ps[i].y][ps[i].x]='.';
		}
		map1[ys][xs]='.';

		LinkedList<State> que=new LinkedList<State>();
		HashSet<State> visited=new HashSet<State>();
		State s0=new State(xs, ys, -10, -10, -10, -10);
		if(pp>=1){
			s0.x1=ps[0].x;
			s0.y1=ps[0].y;
		}
		if(pp>=2){
			s0.x2=ps[1].x;
			s0.y2=ps[1].y;
		}
		que.offer(s0);
		visited.add(s0);

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		for(; !que.isEmpty();){
			State s=que.poll();
			debug("p", s.x, s.y, "p1", s.x1, s.y1, "p2", s.x2, s.y2);
			for(int k=0; k<4; k++){
				State t=new State(s.x+dx[k], s.y+dy[k], s.x1, s.y1, s.x2, s.y2);
				if(!isEmpty(t.x, t.y, map1)){
					continue;
				}
				if(t.x==t.x1&&t.y==t.y1){
					t.x1+=dx[k];
					t.y1+=dy[k];
					if(!isEmpty(t.x1, t.y1, map1)||(t.x1==t.x2&&t.y1==t.y2)){
						continue;
					}
				}else if(t.x==t.x2&&t.y==t.y2){
					t.x2+=dx[k];
					t.y2+=dy[k];
					if(!isEmpty(t.x2, t.y2, map1)||(t.x2==t.x1&&t.y2==t.y1)){
						continue;
					}
				}
				if(!visited.contains(t)){
					// テァツ「ツコティツェツ?
					for(int i=0; i<n; i++){
						System.arraycopy(map1[i], 0, map[i], 0, m);
					}
					if(pp>=1){
						map[t.y1][t.x1]=cs[0];
					}
					if(pp>=2){
						map[t.y2][t.x2]=cs[1];
					}
					int res=check(map, t.x, t.y);
					debug("res", res, "p", t.x, t.y, "p1", t.x1, t.y1, "p2",
							t.x2, t.y2);
					for(int i=0; i<n; i++){
						debug(map[i]);
					}
					debug();
					if(res==1){
						que.offer(t);
						visited.add(t);
					}else if(res==2){
						return true;
					}
				}
			}
		}
		debug();
		return false;
	}

	class Laser{
		int x, y, dx, dy;

		Laser(int x, int y, int dx, int dy){
			this.x=x;
			this.y=y;
			this.dx=dx;
			this.dy=dy;
		}
	}

	// 0:テ」ツ??」ツつ?
	// 1:ok
	// 2:clear
	int check(char[][] map, int xs, int ys){
		LinkedList<Laser> que=new LinkedList<Laser>();
		// boolean[][][][] visited=new boolean[n][m][4][4];
		boolean[][] visited=new boolean[n][m];
		int[] dx={0, 1, 1, 1, 0, -1, -1, -1};
		int[] dy={-1, -1, 0, 1, 1, 1, 0, -1};
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(isLaser(i, j, map)){
					if(i==0){
						que.offer(new Laser(i, j, 1, 0));
					}else if(i==m-1){
						que.offer(new Laser(i, j, -1, 0));
					}else if(j==0){
						que.offer(new Laser(i, j, 0, 1));
					}else if(j==n-1){
						que.offer(new Laser(i, j, 0, -1));
					}else{
						new int[]{}[0]=0;
					}
				}
			}
		}
		for(Laser la : que){
			visited[la.y][la.x]=true;
			// la.x+=la.dx;
			// la.y+=la.dy;
		}
		// テヲツ慊?・ツ按敕」ツ?ョテヲツ卍づァツつケテ」ツ?ァテ」ツ?ッテ」ツ??」ツ?、テゥツ?イテ」ツつ?」ツ?ヲテ」ツ?甘」ツ??
		for(; !que.isEmpty();){
			Laser la=que.poll();
			debug(la.x, la.y, la.dx, la.dy);
			visited[la.y][la.x]=true;
			if(visited[ys][xs]){
				return 0;
			}
			// テ」ツ?禿」ツ?禿」ツ?ァテゥツァツ?ァツ崢ョテ」ツ?ェテ」ツつ嘉」ツつ?」ツつ?」ツつ?
			// テァツゥツコテァツ卍ステ・ツ個姪」ツδ淌」ツδゥテ」ツδシテ」ツつッテ」ツδェテ」ツつケテ」ツつソテ」ツ?ェテ」ツつ嘉」ツ?殻
			if(isEmpty(la.x, la.y, map)||isMirrorOrCrystal(la.x, la.y, map)
					||(in(la.x, la.y)&&map[la.y][la.x]=='L')){}else{
				continue;
			}
			la.x+=la.dx;
			la.y+=la.dy;
			// テゥツ?イテ」ツつ禿」ツ?ァテ」ツ?敕」ツ?禿」ツ?ァテヲツ鳴ケテ・ツ青妥」ツつ津」ツ?サテ」ツ?津」ツつ?
			next(la, que, map);
		}
		for(int i=0; i<n; i++){
			debug(visited[i]);
		}
		if(visited[ys][xs]){
			return 0;
		}
		boolean all=true;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				all&=!isStatue(i, j, map)||visited[j][i];
			}
		}
		debug("all", all);
		if(all&&isDoor(xs, ys, map)){
			return 2;
		}else{
			return 1;
		}
	}

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	// char, dy, dx, テヲツャツ。テ」ツ?ョ
	ArrayList<P>[][][] next;

	void add(char c, int dx, int dy, int dx2, int dy2){
		next[c][dy+1][dx+1].add(new P(dx2, dy2));
	}

	void next(Laser la, LinkedList<Laser> que, char[][] map){
		if(!in(la.x, la.y)){
			return;
		}
		if(next==null){
			next=new ArrayList[256][3][3];
			for(int k=0; k<256; k++){
				for(int j=0; j<3; j++){
					for(int i=0; i<3; i++){
						next[k][j][i]=new ArrayList<P>();
					}
				}
			}
			add('/', 1, 0, 0, -1);
			add('/', 0, 1, -1, 0);
			add('/', -1, 0, 0, 1);
			add('/', 0, -1, 1, 0);
			add('/', 1, 1, -1, -1);
			add('/', -1, -1, 1, 1);

			add('\\', 1, 0, 0, 1);
			add('\\', 0, 1, 1, 0);
			add('\\', -1, 0, 0, -1);
			add('\\', 0, -1, -1, 0);
			add('\\', 1, -1, -1, 1);
			add('\\', -1, 1, 1, -1);

			add('-', 1, 1, 1, -1);
			add('-', -1, 1, -1, -1);
			add('-', 1, -1, 1, 1);
			add('-', -1, -1, -1, 1);
			add('-', 0, 1, 0, -1);
			add('-', 0, -1, 0, 1);

			add('|', 1, 1, -1, 1);
			add('|', 1, -1, -1, -1);
			add('|', -1, 1, 1, 1);
			add('|', -1, -1, 1, -1);
			add('|', 1, 0, -1, 0);
			add('|', -1, 0, 1, 0);

			int[] dx={0, 1, 1, 1, 0, -1, -1, -1};
			int[] dy={-1, -1, 0, 1, 1, 1, 0, -1};
			for(int k=0; k<8; k++){
				// add('O', dx[k], dy[k], dx[(k+3)%8], dy[(k+3)%8]);
				// add('O', dx[k], dy[k], dx[(k+5)%8], dy[(k+5)%8]);
				add('O', dx[k], dy[k], dx[(k+1)%8], dy[(k+1)%8]);
				add('O', dx[k], dy[k], dx[(k+7)%8], dy[(k+7)%8]);
			}
		}
		if(isEmpty(la.x, la.y, map)||isStatue(la.x, la.y, map)){
			// テ」ツ?敕」ツ?ョテ」ツ?セテ」ツ?セ
			que.offer(la);
			return;
		}
		if(isMirrorOrCrystal(la.x, la.y, map)){
			for(P p : next[map[la.y][la.x]][la.dy+1][la.dx+1]){
				que.offer(new Laser(la.x, la.y, p.x, p.y));
			}
		}
	}

	// テ」ツ??」ツ?妥」ツつ?
	boolean isEmpty(int x, int y, char[][] map){
		return in(x, y)&&(map[y][x]=='.'||map[y][x]=='D');
	}

	boolean isDoor(int x, int y, char[][] map){
		return in(x, y)&&map[y][x]=='D';
	}

	boolean isStatue(int x, int y, char[][] map){
		return in(x, y)&&map[y][x]=='S';
	}

	boolean isMirrorOrCrystal(int x, int y, char[][] map){
		return in(x, y)
				&&(map[y][x]=='/'||map[y][x]=='\\'||map[y][x]=='-'
						||map[y][x]=='|'||map[y][x]=='O');
	}

	boolean isLaser(int x, int y, char[][] map){
		return in(x, y)&&map[y][x]=='L';
	}

	boolean in(int x, int y){
		return x>=0&&x<m&&y>=0&&y<n;
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}