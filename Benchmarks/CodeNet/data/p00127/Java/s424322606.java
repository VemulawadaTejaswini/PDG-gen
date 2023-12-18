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
		char[][] table={{'a', 'f', 'k', 'p', 'u', 'z'},
				{'b', 'g', 'l', 'q', 'v', '.'}, {'c', 'h', 'm', 'r', 'w', '?'},
				{'d', 'i', 'n', 's', 'x', '!'}, {'e', 'j', 'o', 't', 'y', ' '},};

		for(; sc.hasNext();){
			String s=sc.next();
			if(s.length()%2==1){
				println("NA");
				continue;
			}
			String ans="";
			for(int i=0; i<s.length()/2; i++){
				int m=s.charAt(i*2)-'0';
				int n=s.charAt(i*2+1)-'0';
				m--;
				n--;
				// println(m+":"+n);
				if(m<0||m>=6||m<0||n>=5||!Character.isDigit(s.charAt(i*2))
						||!Character.isDigit(s.charAt(i*2+1))){
					ans="NA";
					break;
				}
				ans+=table[n][m];
			}
			println(ans);
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