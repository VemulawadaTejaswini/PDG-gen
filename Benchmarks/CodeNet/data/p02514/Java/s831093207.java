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
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			if((a|b|c|d|e|f)==0){
				break;
			}
			long n1=n1(a+d, b+e, c+f);
			long n2=n2(a+d, b+e, c+f);
			// debug(max(n1, n2), n1, n2);
			println(max(n1, n2)+"");
		}
	}

	long n1(long a, long b, long c){
		long res=0;
		res+=a/3;
		a%=3;
		res+=b/3;
		b%=3;
		res+=c/3;
		c%=3;
		res+=min(a, min(b, c));
		return res;
	}

	long n2(long a, long b, long c){
		long res=0;
		res+=min(a, min(b, c));
		a-=res;
		b-=res;
		c-=res;
		res+=a/3;
		res+=b/3;
		res+=c/3;
		return res;
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