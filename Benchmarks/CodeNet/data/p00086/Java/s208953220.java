import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	HashMap<Integer, Integer> map;

	void run(){
		map=new HashMap<Integer, Integer>();
		for(; sc.hasNext();){
			map.clear();
			for(;;){
				int v=sc.nextInt();
				int u=sc.nextInt();
				if((v|u)==0){
					break;
				}
				if(!map.containsKey(v)){
					map.put(v, 0);
				}
				if(!map.containsKey(u)){
					map.put(u, 0);
				}
				map.put(v, map.get(v)+1);
				map.put(u, map.get(u)+1);
			}
			map.put(1, map.get(1)+1);
			map.put(2, map.get(2)+1);
			boolean even=true;
			for(Entry<Integer, Integer> entry : map.entrySet()){
				// debug(entry.getKey(),entry.getValue());
				even&=entry.getValue()%2==0;
			}
			println(even?"OK":"NG");
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