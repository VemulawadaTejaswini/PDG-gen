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
		int sum=0;
		int ave=0;
		int num=0;
		for(; sc.hasNext(); num++){
			String[] s=sc.nextLine().split(",");
			int m=Integer.parseInt(s[0]);
			int n=Integer.parseInt(s[1]);
			sum+=m*n;
			ave+=n;
		}
		println(""+sum);
		println(""+(int)((double)ave/num+0.5));
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