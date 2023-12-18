import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		for(;;){
			int n=sc.nextInt();
			int s=sc.nextInt();
			if(n==0&&s==0)
				break;
			int ans=0;
			// println("n="+n+",s="+s);
			for(int i=0; i<1<<10; i++){
				if(Integer.bitCount(i)==n){
					int sum=0;
					int b=i;
					println(Integer.toBinaryString(i));
					for(int k=0; k<10; k++){
						if((b&1)==1)
							sum+=k;
						b>>=1;
					}
					if(sum==s)
						ans++;
				}
			}
			// println(ans+"");
		}
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}