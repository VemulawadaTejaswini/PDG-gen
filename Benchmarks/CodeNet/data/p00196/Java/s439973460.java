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
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			R[] rs=new R[n];
			for(int j=0; j<n; j++){
				rs[j]=new R();
				rs[j].name=sc.next();
				for(int i=0; i<n-1; i++){
					switch(sc.nextInt()){
					case 0:
						rs[j].win--;
						break;
					case 1:
						rs[j].lose++;
						break;
					}
				}
			}
			Arrays.sort(rs);
			for(R r : rs){
				println(r.name);
			}
		}
	}

	class R implements Comparable<R>{
		int win, lose;
		String name;

		@Override
		public int compareTo(R r){
			if(win!=r.win){
				return win-r.win;
			}else{
				return lose-r.lose;
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