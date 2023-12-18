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

	void run(){

		for(; sc.hasNext();){
			String s=sc.next();
			int[] a=new int[10];
			for(int i=0; i<s.length(); i++){
				a[s.charAt(i)-'0']++;
			}
			solve(a);
		}
	}

	void solve(int[] a){
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=1; i<=9; i++){
			a[i]++;
			if(satisfy(a.clone())){
				list.add(i);
			}
			a[i]--;
		}
		for(int i=0; i<list.size(); i++){
			print(list.get(i)+(i==list.size()-1?"\n":" "));
		}
		if(list.size()==0){
			println("0");
		}
	}

	boolean satisfy(int[] a){
		if(!check(a)){
			return false;
		}
		for(int i=1; i<=9; i++){
			a[i]-=2;
			if(rec(a, 0)){
				return true;
			}
			a[i]+=2;
		}
		return false;
	}

	boolean rec(int[] a, int n){
		if(!check(a)){
			return false;
		}
		if(n==4){
			return true;
		}
		for(int i=1; i<=9; i++){
			a[i]-=3;
			if(rec(a, n+1)){
				return true;
			}
			a[i]+=3;
		}
		for(int i=1; i<=7; i++){
			a[i]--;
			a[i+1]--;
			a[i+2]--;
			if(rec(a, n+1)){
				return true;
			}
			a[i]++;
			a[i+1]++;
			a[i+2]++;
		}
		return false;
	}

	boolean check(int[] a){
		for(int e : a){
			if(e<0||e>4){
				return false;
			}
		}
		return true;
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