import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	class R{
		int r=0;
	}

	void run(){
		sc=new Scanner(System.in);
		HashMap<Integer, R> map=new HashMap<Integer, R>();
		for(; sc.hasNext();){
			int n=sc.nextInt();
//			if(n==0)
//				break;
			if(!map.containsKey(n))
				map.put(n, new R());
			map.get(n).r++;
		}
		int m=0;
		for(Entry<Integer, R> entry : map.entrySet()){
			m=max(m, entry.getValue().r);
		}
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(Entry<Integer, R> entry : map.entrySet()){
			if(entry.getValue().r==m)
				list.add(entry.getKey());
		}
		Integer[] arr=list.toArray(new Integer[0]);
		Arrays.sort(arr);
		for(int a : arr)
			println(a+"");

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