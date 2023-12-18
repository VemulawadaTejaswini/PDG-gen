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
		double x=0, y=0;
		int deg=90;
		for(;;){
			String[] s=sc.nextLine().split(",");
			int r=Integer.parseInt(s[0]);
			int d=Integer.parseInt(s[1]);
			if(r==0&&d==0)
				break;
			x+=r*cos(toRadians(deg));
			y+=r*sin(toRadians(deg));
			deg-=d;
		}
		println((int)x+"");
		println((int)y+"");
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