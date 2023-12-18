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
		for(;;){
			int m=sc.nextInt();
			if(m==0){
				break;
			}
			HashMap<String, String> map=new HashMap<String, String>();
			for(int i=0; i<m; i++){
				String s=sc.next();
				String t=sc.next();
				map.put(s, t);
			}
			int n=sc.nextInt();
			for(int i=0; i<n; i++){
				String s=sc.next();
				print(map.containsKey(s)?map.get(s):s);
			}
			println("");
		}
		System.out.flush();
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
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}