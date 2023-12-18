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
			String[] names=new String[n];
			int[][] g=new int[30][n];
			for(int j=0; j<n; j++){
				names[j]=sc.next();
				int m=sc.nextInt();
				for(int i=0; i<m; i++){
					int d=sc.nextInt();
					g[d][j]=1;
				}
			}
			int[] ps=new int[n];
			for(int j=0; j<30; j++){
				int k=0;
				for(int i=0; i<n; i++){
					k+=g[j][i];
				}
				for(int i=0; i<n; i++){
					ps[i]+=g[j][i]*(n+1-k);
				}
			}
			String name="";
			int min=INF;
			for(int i=0; i<n; i++){
				if(ps[i]<min){
					name=names[i];
					min=ps[i];
				}else if(ps[i]==min){
					if(names[i].compareTo(name)<0){
						name=names[i];
					}
				}
			}
			debug(ps);
			debug(name, min);
			println(min+" "+name);
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
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