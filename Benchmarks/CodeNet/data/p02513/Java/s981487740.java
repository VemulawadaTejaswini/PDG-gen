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
			long n=sc.nextLong();
			int m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			long[] p=new long[m];
			for(int i=0; i<m; i++){
				p[i]=sc.nextLong();
			}
			long sum=0;
			long num=0;
			for(int i=1; i<1<<m; i++){
				int bit=Integer.bitCount(i);
				long lcm=1;
				for(int k=0; k<m; k++){
					if((i>>k&1)==1){
						lcm=lcm/gcd(lcm, p[k])*p[k];
						if(lcm>n){
							break;
						}
					}
				}
				if(bit%2==0){
					num-=n/lcm;
					sum-=lcm*(n/lcm+1)*(n/lcm)/2;
				}else{
					num+=n/lcm;
					sum+=lcm*(n/lcm+1)*(n/lcm)/2;
				}
			}
			long a=n*(n+1)/2-sum;
			long b=n-num;
			if(b==0){
				println("0");
			}else{
				println(String.format("%.10f", (double)a/b));
				debug(""+(double)a/b);
			}

			debug(sum, num);
		}
	}

	long gcd(long m, long n){
		return m==0?n:gcd(n%m, m);
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