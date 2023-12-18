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
			rec(n, n, "");
		}
		System.out.flush();
	}

	void rec(int max, int n, String s){
		if(n==0){
			println(s.substring(0, s.length()-1));
			return;
		}
		for(int i=min(max, n); i>=1; i--){
			if(n-i>=0){
				rec(min(max, i), n-i, s+i+" ");
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
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}