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

	void run(){
		R[][] rss=new R[3][8];
		for(int i=0; i<24; i++){
			R r=new R();
			r.id=sc.nextInt();
			r.time=(int)(sc.nextDouble()*100);
			rss[i/8][i%8]=r;
		}
		Arrays.sort(rss[0]);
		Arrays.sort(rss[1]);
		Arrays.sort(rss[2]);
		LinkedList<R> list=new LinkedList<R>();
		for(int i=2; i<8; i++){
			list.add(rss[0][i]);
			list.add(rss[1][i]);
			list.add(rss[2][i]);
		}
		R[] rs=list.toArray(new R[0]);
		Arrays.sort(rs);

		for(int j=0; j<3; j++){
			for(int i=0; i<2; i++){
				println(String.format("%d %.2f", rss[j][i].id,
						rss[j][i].time/100.));
			}
		}
		println(String.format("%d %.2f", rs[0].id, rs[0].time/100.));
		println(String.format("%d %.2f", rs[1].id, rs[1].time/100.));
	}

	class R implements Comparable<R>{
		int id;
		int time;

		@Override
		public int compareTo(R r){
			return time-r.time;
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