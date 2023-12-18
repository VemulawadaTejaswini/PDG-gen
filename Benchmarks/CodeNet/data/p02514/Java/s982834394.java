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

	long a0,b0,c0;
	
	void run(){
		for(;;){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			int f=sc.nextInt();
			/*
		int	 a=(int)(Math.random()*5);
		int	 b=(int)(Math.random()*5);
		int c=(int)(Math.random()*5);
		int	 d=(int)(Math.random()*5);
		int	 e=(int)(Math.random()*5);
		int f=(int)(Math.random()*5);
		*/
			if((a|b|c|d|e|f)==0){
				break;
			}
			a0=a+d;
			b0=b+e;
			c0=c+f;
			long n1=n1(a0,b0,c0);
			long n2=n2(a0,b0,c0);
			if(n1==-1&&n2==-1){
				debug(max(n1, n2), n1, n2,a+d,b+e,c+f);
			}
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
		long min=min(a, min(b, c));
		res+=min;
		a-=min;
		b-=min;
		c-=min;
		if(a+b+c>=4){
			debug(a,b,c);
			return -1;
		}
		return res;
	}

	long n2(long a, long b, long c){
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
//			debug(a,b,c);
//			return -1;
		}
		return res;
	}

	void debug(Object... os){
		//System.err.println(Arrays.deepToString(os));
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