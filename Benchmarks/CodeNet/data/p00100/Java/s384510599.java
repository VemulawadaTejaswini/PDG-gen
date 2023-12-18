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

	class W{
		int id;
		int order;
		long m=0;

		W(int id, int order){
			this.id=id;
			this.order=order;
		}
	}

	void run(){
		sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)
				break;
			int order=0;
			HashMap<Integer, W> map=new HashMap<Integer, W>();
			for(int i=0; i<n; i++){
				int id=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(!map.containsKey(id))
					map.put(id, new W(id, order++));
				map.get(id).m+=a*b;
			}
			W[] ws=map.values().toArray(new W[0]);
			sort(ws, new Comparator<W>(){
				@Override
				public int compare(W w1, W w2){
					return w1.order-w2.order;
				}
			});
			boolean f=false;
			for(W w : ws){
				if(w.m>=1000000){
					println(w.id+"");
					f=true;
				}
			}
			if(!f)
				println("NA");
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