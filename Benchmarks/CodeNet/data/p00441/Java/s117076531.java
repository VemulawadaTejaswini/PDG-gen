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

	int n, s;
	P[] ps;
	TreeSet<P> set;

	// boolean[][] map;

	void run(){
		for(;;){
			s=5001;
			n=sc.nextInt();
			if(n==0){
				break;
			}
			ps=new P[n];
			// map=new boolean[s][s];
			for(int i=0; i<n; i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				ps[i]=new P(x, y);
				// map[y][x]=true;
			}
			solve();
		}
	}

	void solve(){
		int max=0;
		set=new TreeSet<P>();
		for(P p : ps){
			set.add(p);
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				if(i==j){
					continue;
				}
				P p1=ps[i];
				P p2=ps[j];
				P d=p2.sub(p1);
				P e=new P(d.y, -d.x);
				P p3=p2.add(e);
				P p4=p1.add(e);
				if(c(p3)&&c(p4)){
					max=max(max, d.abs2());
				}
			}
		}
		println(max+"");
	}

	boolean c(P p){
		return p.x>=0&&p.x<s&&p.y>=0&&p.y<s&&set.contains(p);
	}

	class P implements Comparable<P>{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}

		P add(P p){
			return new P(x+p.x, y+p.y);
		}

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		int abs2(){
			return x*x+y*y;
		}

		@Override
		public int compareTo(P p){
			if(y!=p.y){
				return y-p.y;
			}else{
				return x-p.x;
			}
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
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