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
		boolean[] used=new boolean[11];
		for(; sc.hasNext();){
			Arrays.fill(used, false);
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			used[c1]=used[c2]=used[c3]=true;
			int d=0, n=0;
			for(int j=1; j<=10; j++){
				if(!used[j]){
					used[j]=true;
					for(int i=1; i<=10; i++){
						if(!used[i]){
							d++;
							if(c1+c2+i<=20){
								n++;
							}
						}
					}
					used[j]=false;
				}
			}
			println(n*2>=d?"YES":"NO");
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