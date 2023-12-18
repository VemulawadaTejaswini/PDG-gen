import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		
		for(int i=2;i<100;i++){
//			println(i+":"+phi(i));
		}
		
		for(;;){
			int a1=sc.nextInt();
			int m1=sc.nextInt();
			int a2=sc.nextInt();
			int m2=sc.nextInt();
			int a3=sc.nextInt();
			int m3=sc.nextInt();
			if(a1==0&&m1==0&&a2==0&&m2==0&&a3==0&&m3==0)
				break;
			// ans=lcm(Ó(m1),Ó(m2),Ó(m3))
//			println(phi(m1)+"");
//			println(phi(m2)+"");
//			println(phi(m3)+"");
			
			long r;
			long n1,n2,n3;
			for(r=a1,n1=1;r!=1;n1++)
				r=(r*a1)%m1;
			for(r=a2,n2=1;r!=1;n2++)
				r=(r*a2)%m2;
			for(r=a3,n3=1;r!=1;n3++)
				r=(r*a3)%m3;
//			println(n1+"");
//			println(n2+"");
//			println(n3+"");
			
			long lcm1=lcm(n1, n2);
			long lcm2=lcm(lcm1, n3);
//			println("");
//			println(lcm1+"");
			println(lcm2+"");
//			println("");
		}
		sc.close();
	}

	long lcm(long m, long n){
		return m/gcd(m, n)*n;
	}

	long gcd(long m, long n){
		for(; n!=0;){
			long r=m%n;
			m=n;
			n=r;
		}
		return m;
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