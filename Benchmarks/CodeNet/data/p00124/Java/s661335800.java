import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	class T{
		String name;
		int score;
		int index;

		T(String name, int score, int index){
			this.name=name;
			this.score=score;
			this.index=index;
		}
	}

	void run(){
		sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)
				break;
			T[] ts=new T[n];
			for(int i=0; i<n; i++){
				String name=sc.next();
				int win=sc.nextInt();
				int lose=sc.nextInt();
				int draw=sc.nextInt();
				int score=win*3+draw*1;
				ts[i]=new T(name, score, i);
			}
			sort(ts, new Comparator<T>(){
				@Override
				public int compare(T t1, T t2){
					if(t1.score!=t2.score)
						return t2.score-t1.score;
					return t1.index-t2.index;
				}
			});
			for(T t : ts)
				println(t.name+","+t.score);
			println("");
		}
		sc.close();
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