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
		for(;sc.hasNext();){
			int n=sc.nextInt();
			if((n&1)!=0)
				print("1");
			for(int i=1;i<32;i++){
				if((n&(1<<i))!=0)
					print(" "+(1<<i));
			}
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