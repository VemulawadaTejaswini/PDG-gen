package p0027;

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
			int m=sc.nextInt();
			int d=sc.nextInt();
			if(m==0&&d==0)
				break;
			Calendar cal=Calendar.getInstance();
			cal.set(2004, m-1, d);
			switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.MONDAY:
				println("Monday");
				break;
			case Calendar.TUESDAY:
				println("Tuesday");
				break;
			case Calendar.WEDNESDAY:
				println("Wednesday");
				break;
			case Calendar.THURSDAY:
				println("Thursday");
				break;
			case Calendar.FRIDAY:
				println("Friday");
				break;
			case Calendar.SATURDAY:
				println("Saturday");
				break;
			case Calendar.SUNDAY:
				println("Sunday");
				break;
			}
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