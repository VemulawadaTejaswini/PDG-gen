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
			int n=sc.nextInt();
			int d=10000;
			String[] ans=new String[5];
			String[] table={"* = ****", "* =* ***", "* =** **", "* =*** *",
					"* =**** ", " *= ****", " *=* ***", " *=** **", " *=*** *",
					" *=**** ",};
			for(int i=0; i<5; i++){
				int m=(n/d)%10;
				ans[i]=table[m];
				d/=10;
			}
			for(int j=0; j<8; j++){
				for(int i=0; i<5; i++){
					print(ans[i].charAt(j)+"");
				}
				println("");
			}
			if(sc.hasNext())
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