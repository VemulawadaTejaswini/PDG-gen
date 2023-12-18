import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Time Complexity
public class Main{
	Scanner sc=new Scanner(System.in);

	long n, T;
	String poly;

	void run(){
		n=sc.nextLong();
		T=sc.nextLong();
		poly=sc.next();
		solve();
	}

	void solve(){
		double fT=0;
		for(char c : poly.toCharArray()){
			if(Character.isDigit(c)){
				double a=1;
				for(int i=0; i<c-'0'; i++){
					a*=n;
				}
				fT+=a*T;
			}
		}
		println(fT>1e9?"TLE":((int)fT+""));
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}