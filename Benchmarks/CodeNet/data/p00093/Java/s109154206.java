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
			int y1=sc.nextInt();
			int y2=sc.nextInt();
			if(y1==0&&y2==0)
				break;
			boolean f=false;
			for(int y=y1; y<=y2; y++){
				if(y%4==0&&(y%100!=0||y%400==0)){
					println(y+"");
					f=true;
				}
			}
			if(!f)
				println("NA");
//			if(sc.hasNext())
				println("");
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