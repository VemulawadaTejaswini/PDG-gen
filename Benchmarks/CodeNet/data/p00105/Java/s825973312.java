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

	void run(){
		sc=new Scanner(System.in);
		TreeMap<String, LinkedList<Integer>> map=new TreeMap<String, LinkedList<Integer>>();
//		for(; sc.hasNext();){
		for(int i=0;i<8 ;i++){
			String word=sc.next();
			int page=sc.nextInt();
			if(!map.containsKey(word))
				map.put(word, new LinkedList<Integer>());
			map.get(word).add(page);
		}
		for(Entry<String, LinkedList<Integer>> entry : map.entrySet()){
			println(entry.getKey());
			Integer[] pages=entry.getValue().toArray(new Integer[0]);
			sort(pages);
			for(int i=0; i<pages.length; i++){
				print(pages[i]+"");
				if(i!=pages.length-1)
					print(" ");
			}
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