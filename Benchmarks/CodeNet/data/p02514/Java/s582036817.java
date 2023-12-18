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

	long a0, b0, c0;

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
			a0=a+d;
			b0=b+e;
			c0=c+f;
			println(count(a0, b0, c0)+"");
		}
	}

	long count(long a, long b, long c){
		long res=0;
		long min=min(a, min(b, c));
		res+=min;
		a-=min;
		b-=min;
		c-=min;
		res+=a/3;
		res+=b/3;
		res+=c/3;
		a%=3;
		b%=3;
		c%=3;
		if(a+b+c>=4){
			if(a==0){
				if(a0>=3){
					res++;
				}
			}else if(b==0){
				if(b0>=3){
					res++;
				}
			}else if(c==0){
				if(c0>=3){
					res++;
				}
			}
		}
		return res;
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