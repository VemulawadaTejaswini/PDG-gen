import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int m;
	String s;

	void run(){
		m=sc.nextInt();
		for(int i=0; i<m; i++){
			s=sc.next();
			solve();
		}
	}

	void solve(){
		int n=s.length();
		// StringBuffer sb=new StringBuffer(s);
		TreeSet<String> set=new TreeSet<String>();
		for(int i=1; i<n; i++){
			StringBuffer sb1=new StringBuffer(s.substring(0, i));
			StringBuffer sb2=new StringBuffer(s.substring(i, n));
			String s1=sb1.toString()+sb2.toString();
			String s2=sb2.toString()+sb1.toString();
			sb2.reverse();
			String s3=sb1.toString()+sb2.toString();
			String s4=sb2.toString()+sb1.toString();
			sb1.reverse();
			String s5=sb1.toString()+sb2.toString();
			String s6=sb2.toString()+sb1.toString();
			sb2.reverse();
			String s7=sb1.toString()+sb2.toString();
			String s8=sb2.toString()+sb1.toString();
			set.add(s1);
			set.add(s2);
			set.add(s3);
			set.add(s4);
			set.add(s5);
			set.add(s6);
			set.add(s7);
			set.add(s8);
		}
		println(set.size()+"");
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}