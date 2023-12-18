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
		int n, ans;
		int rank;

		T(int n, int ans){
			this.n=n;
			this.ans=ans;
		}
	}

	void run(){
		sc=new Scanner(System.in);
		LinkedList<T> list=new LinkedList<T>();

		for(;;){
			String[] s=sc.nextLine().split(",");
			int n=Integer.parseInt(s[0]);
			int ans=Integer.parseInt(s[1]);
			if(n==0&&ans==0)
				break;
			list.add(new T(n, ans));
		}

		// ³ðÉ\[g
		T[] ts=list.toArray(new T[0]);
		sort(ts, new Comparator<T>(){
			@Override
			public int compare(T t1, T t2){
				return t2.ans-t1.ans;
			}
		});

		// ÊvZ
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		ts[0].rank=1;
		for(int i=1; i<ts.length; i++){
			ts[i].rank=ts[i-1].rank;
			if(ts[i].ans!=ts[i-1].ans)
				ts[i].rank+=1;
		}

		for(T t : ts)
			map.put(t.n, t.rank);
		// println(t.n+":"+t.ans+":"+t.rank);

		// ®Ô
		for(; sc.hasNext();){
			int n=sc.nextInt();
			println(map.get(n)+"");
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