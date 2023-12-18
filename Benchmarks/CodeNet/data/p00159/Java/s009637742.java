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

	int n;
	R[] rs;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			rs=new R[n];
			for(int i=0; i<n; i++){
				int id=sc.nextInt();
				int h=sc.nextInt();
				int w=sc.nextInt();
				rs[i]=new R(id, h, w);
			}
			solve();
		}
	}

	void solve(){
		Arrays.sort(rs);
		println(""+rs[0].id);
	}

	class R implements Comparable<R>{
		int id;
		double error;

		R(int id, int h, int w){
			this.id=id;
			error=Math.abs(22-10000.*w/h/h);
		}

		@Override
		public int compareTo(R r){
			if(error+EPS<r.error){
				return -1;
			}else if(error>r.error+EPS){
				return 1;
			}else{
				return id-r.id;
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