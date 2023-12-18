import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n, m;
	int[][] a;
	int[] dx;
	int[] dy;
	int[] dx1={0, 0, -1, 1};
	int[] dy1={-1, 1, 0, 0};
	int[] dx2={1, 1, 0, -1, -1, -1, 0, 1};
	int[] dy2={0, 1, 1, 1, 0, -1, -1, -1};
	int swap;
	boolean[] wall;

	void run(){
		for(int k=0;; k++){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			if(k>0){
				println("----------");
			}
			sc.nextLine();
			m=0;
			String[] ss=new String[n];
			for(int i=0; i<n; i++){
				ss[i]=sc.nextLine();
				m=max(m, ss[i].length());
			}
			a=new int[n][m];
			for(int j=0; j<n; j++){
				for(int i=0; i<ss[j].length(); i++){
					a[j][i]=ss[j].charAt(i)=='*'?1:0;
				}
			}
			solve();
		}
	}

	void solve(){
		back();
		dx=dx1;
		dy=dy1;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(a[j][i]==1){
					if(true){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}

					debug(i, j);
					int outline=0;
					int d=0;
					int x=i, y=j;
					for(;;){
						outline++;
						a[y][x]=0;
						boolean f=false;
						dx=dx2;
						dy=dy2;
						d=(d+5)%8;
						for(int k=0; k<dx.length; k++, d=(d+1)%8){
							int x2=x+dx[d];
							int y2=y+dy[d];
							if(x2>=0&&x2<m&&y2>=0&&y2<n&&a[y2][x2]==1){
								x=x2;
								y=y2;
								f=true;
								break;
							}
						}
						if(!f){
							break;
						}
					}
					/*
					 * for(d=0; d<8; d++){
					 * int x2=x+dx[d];
					 * int y2=y+dy[d];
					 * if(x2>=0&&x2<m&&y2>=0&&y2<n&&a[y2][x2]==0){
					 * x=x2;
					 * y=y2;
					 * break;
					 * }
					 * }
					 */

					dx=dx1;
					dy=dy1;

					if(true){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}
					if(i==47&&j==2&&false){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}

					debug();

					swap=-1;
					wall=new boolean[]{false, false, true};
					int area=bfs(x, y);
					if(true){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}
					swap=2;
					wall=new boolean[]{false, true, true};
					bfs(x, y);
					debug("outline", outline);
					debug("area", area);

					if(!map.containsKey(area)){
						map.put(area, 0);
					}
					map.put(area, map.get(area)+1);

					if(true){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}

					debug();

					if(i==47&&j==2&&false){
						for(int k=0; k<n; k++){
							debug(a[k]);
						}
					}

				}
			}
		}
		debug(map.entrySet());

		Integer[] is=map.keySet().toArray(new Integer[0]);
		sort(is);

		for(int key : is){
			println(key+" "+map.get(key));
		}

		for(int j=0; j<n; j++){
			debug(a[j]);
		}
	}

	void back(){
		dx=dx1;
		dy=dy1;
		swap=2;
		wall=new boolean[]{false, true, true};
		for(int j=0; j<n; j++){
			if(a[j][0]==0){
				bfs(0, j);
			}
			if(a[j][m-1]==0){
				bfs(m-1, j);
			}
		}
		for(int i=0; i<m; i++){
			if(a[0][i]==0){
				bfs(i, 0);
			}
			if(a[n-1][i]==0){
				bfs(i, n-1);
			}
		}
	}

	int bfs(int x, int y){
		debug(x, y);

		LinkedList<P> que=new LinkedList<P>();
		boolean[][] visited=new boolean[n][m];
		que.add(new P(x, y));
		visited[y][x]=true;
		int res=0;
		for(; !que.isEmpty();){
			P p=que.poll();
			// a[p.y][p.x]=2;
			if(swap>=0){
				a[p.y][p.x]=swap;
			}
			res++;
			for(int i=0; i<dx.length; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
				if(q.x>=0&&q.x<m&&q.y>=0&&q.y<n&&!visited[q.y][q.x]
						&&!wall[a[q.y][q.x]]){
					que.add(q);
					visited[q.y][q.x]=true;
				}
			}
		}
		return res;
	}

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}