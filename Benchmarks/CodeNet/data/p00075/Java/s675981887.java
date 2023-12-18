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
			String[] s=sc.next().split(",");
			int id=Integer.parseInt(s[0]);
			double w=Double.parseDouble(s[1]);
			double h=Double.parseDouble(s[2]);
			double bmi=w/h/h;
			if(bmi>25-EPS)
				println(id+"");
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