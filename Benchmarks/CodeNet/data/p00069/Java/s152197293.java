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

	int m, n;
	int start, goal;
	int[][] a;

	void run(){
		for(;;){
			m=sc.nextInt();
			if(m==0){
				break;
			}
			start=sc.nextInt()-1;
			goal=sc.nextInt()-1;
			n=sc.nextInt();
			a=new int[n][m-1];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<m-1; i++){
					a[j][i]=s.charAt(i)-'0';
				}
			}
			solve();
		}
	}

	void solve(){
		if(check()){
			println("0");
			return;
		}

		for(int j=0; j<n; j++){
			for(int i=0; i<m-1; i++){
				if(a[j][i]==1){
					continue;
				}
				if(i<m-2&&a[j][i+1]==1){
					continue;
				}
				if(i>0&&a[j][i-1]==1){
					continue;
				}
				a[j][i]=1;
				if(check()){
					println((j+1)+" "+(i+1));
					return;
				}
				a[j][i]=0;
			}
		}
		println("1");
	}

	boolean check(){
		int p=start;
		for(int j=0; j<n; j++){
			if(p<m-1&&a[j][p]==1){
				p++;
			}else if(p>0&&a[j][p-1]==1){
				p--;
			}
		}
		return p==goal;
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