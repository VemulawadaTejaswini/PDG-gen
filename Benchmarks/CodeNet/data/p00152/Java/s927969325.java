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
	int[][] pin;

	void run(){
		for(;;){
			n=sc.nextInt();
			sc.nextLine();
			rs=new R[n];
			pin=new int[n][22];
			for(int j=0; j<n; j++){
				Scanner s=new Scanner(sc.nextLine());
				rs[j]=new R();
				rs[j].id=s.nextInt();
				for(int i=0; s.hasNext(); i++){
					pin[j][i]=s.nextInt();
				}
			}
			solve();
		}
	}

	void solve(){
		for(int i=0; i<n; i++){
			rs[i].score=score(pin[i]);
		}
		Arrays.sort(rs);
		for(R r : rs){
			// println(r.id+" "+r.score);
			println(String.format("%04d %d", r.id, r.score));
		}
	}

	int score(int[] pin){
		int[] score=new int[10];
		int res=0;
		for(int frame=0, i=0; frame<10; frame++){
			if(frame<9){
				if(pin[i]==10){
					score[frame]=pin[i]+pin[i+1]+pin[i+2];
					i++;
				}else if(pin[i]+pin[i+1]==10){
					score[frame]=pin[i]+pin[i+1]+pin[i+2];
					i+=2;
				}else{
					score[frame]=pin[i]+pin[i+1];
					i+=2;
				}
			}else{
				score[frame]=pin[i]+pin[i+1]+pin[i+2];
			}
			res+=score[frame];
		}
		// debug(score);
		return res;
	}

	class R implements Comparable<R>{
		int id, score;

		@Override
		public int compareTo(R r){
			return r.score-score;
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