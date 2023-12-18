import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int nRs;
	R[] rs;
	int[][] map;
	int n=4;

	void run(){
		nRs=sc.nextInt();
		rs=new R[nRs];
		for(int i=0; i<nRs; i++){
			int h=sc.nextInt();
			int w=sc.nextInt();
			rs[i]=new R(w, h);
		}
		map=new int[n][n];
		for(int j=0; j<n; j++){
			String s=sc.next();
			for(int i=0; i<n; i++){
				switch(s.charAt(i)){
				case 'R':
					map[j][i]=1;
					break;
				case 'G':
					map[j][i]=2;
					break;
				case 'B':
					map[j][i]=3;
					break;
				}
			}
		}
		solve();
	}

	void solve(){
		LinkedList<State> que=new LinkedList<State>();
		TreeSet<Long> set=new TreeSet<Long>();

		State s0=new State(0, map);

		que.offer(s0);
		set.add(s0.hash());

		for(; !que.isEmpty();){
			State s=que.poll();

			for(int k=0; k<nRs; k++){
				for(int y=-n+1; y<n; y++){
					for(int x=-n+1; x<n; x++){
						if(canStamp(x, y, rs[k].w, rs[k].h, s.map)){
							
							State t=new State(s.step+1, s.map);
							t.clear(x, y, rs[k].w, rs[k].h);
							if(!set.contains(t.hash())){
								que.offer(t);
								set.add(t.hash());
								if(t.isCleared()){
									println(t.step+"");
									return;
								}
							}
						}
					}
				}
			}
		}
	}

	boolean canStamp(int x, int y, int w, int h, int[][] map){
		boolean same=true;
		int k=0;
		for(int j=y; j<y+h; j++){
			for(int i=x; i<x+w; i++){
				if(i>=0&&i<n&&j>=0&&j<n){
					if(map[j][i]!=0){
						if(k==0){
							k=map[j][i];
						}else{
							same&=k==map[j][i];
						}
					}
				}
			}
		}
		return same&&k!=0;
	}

	class R{
		int w, h;

		R(int w, int h){
			this.w=w;
			this.h=h;
		}
	}

	class State{
		int step;
		int[][] map=new int[n][n];

		State(int step, int[][] m){
			this.step=step;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					map[j][i]=m[j][i];
				}
			}
		}

		void clear(int x, int y, int w, int h){
			for(int j=y; j<y+h; j++){
				for(int i=x; i<x+w; i++){
					if(i>=0&&i<n&&j>=0&&j<n){
						map[j][i]=0;
					}
				}
			}
		}

		boolean isCleared(){
			boolean ret=true;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					ret&=map[j][i]==0;
				}
			}
			return ret;
		}

		public long hash(){
			long hash=0;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					hash=hash*4+map[j][i];
				}
			}
			return hash;
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