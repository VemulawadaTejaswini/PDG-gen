import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// The Great Summer Contest
// 2012/12/04
public class Main{
	Scanner sc=new Scanner(System.in);

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
			println(max(count1(a0, b0, c0), count2(a0, b0, c0))+"");
		}
	}

	long count1(long a, long b, long c){
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

	long count2(long a, long b, long c){
		long res=0;
		res+=a/3;
		res+=b/3;
		res+=c/3;
		a%=3;
		b%=3;
		c%=3;
		long min=min(a, min(b, c));
		res+=min;
		a-=min;
		b-=min;
		c-=min;
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

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}