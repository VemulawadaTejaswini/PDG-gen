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

	int n, w, h;
	int[] ps,ss;
	
	void run() {
		for(;;){
			n=sc.nextInt();
			w=sc.nextInt();
			h=sc.nextInt();
			if((n|w|h)==0){
				break;
			}
			ps=new int[n];
			ss=new int[n];
			for(int i=0;i<n;i++){
				ps[i]=sc.nextInt()-1;
				ss[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve() {
		LinkedList<R> list=new LinkedList<R>();
		list.add(new R(0,0,w,h));
		for(int i=0;i<n;i++){
			R r=list.remove(ps[i]);
			debug(i,r.x,r.y,r.w,r.h);
			int s=ss[i]%(r.w*r.h);
			int x=r.x,y=r.y;
			for(int k=0;k<s;k++){
				if(y==r.y&&x<r.x+r.w){
					x++;
				}else if(x==r.x+r.w&&y<r.y+r.h){
					y++;
				}else if(y==r.y+r.h&&x>r.x){
					x--;
				}else if(x==r.x&&y>r.y){
					y--;
				}else{
					debug("Error!");
				}
				// debug(x,y);
			}
			debug(x,y);
			R r1=null,r2=null;
			if(x==r.x||x==r.x+w){
				r1=new R(r.x,r.y,r.w,y-r.y);
				r2=new R(r.x,r.y+r1.h,r.w,r.h-r1.h);
			}else{
				r1=new R(r.x,r.y,x-r.x,r.h);
				r2=new R(r.x+r1.w,r.y,r.w-r1.w,r.h);
			}
			debug("r1",r1.x,r1.y,r1.w,r1.h);
			debug("r2",r2.x,r2.y,r2.w,r2.h);
			if(r1.w*r1.h<r2.w*r2.h){
				list.add(r1);
				list.add(r2);
			}else{
				list.add(r2);
				list.add(r1);
			}
		}
	}
	
	class R implements Comparable<R>{
		int x,y,w,h;
		R(int x,int y,int w,int h){
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
		}
		@Override
		public int compareTo(R r) {
			return w*h-r.w*r.h;
		}
	}

	void debug(Object... os) {
		// System.err.println(Arrays.deepToString(os));
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