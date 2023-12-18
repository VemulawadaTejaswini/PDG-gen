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
		for(;;){
			if(!sc.hasNext())
				break;
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double d=sc.nextDouble();
			double e=sc.nextDouble();
			double f=sc.nextDouble();
			double det=a*e-b*d;
			double x=(e*c-b*f)/det;
			double y=(-d*c+a*f)/det;
			println(x+" "+y);
		}
		sc.close();
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