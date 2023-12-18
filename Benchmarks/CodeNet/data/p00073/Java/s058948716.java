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
		for(; sc.hasNext();){
			int x=sc.nextInt();
			int h=sc.nextInt();
			if(x==0&&h==0)
				break;
			double l=sqrt(h*h+x*x/4);
			double s=x*x+2*x*l;
			println(s+"");
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