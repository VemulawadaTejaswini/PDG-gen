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
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			String s=sc.next();
			for(int j=0; j<n; j++){
				String t="";
				int c=0;
				for(int i=0; i<s.length(); i++){
					c++;
					if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
						t+=c+""+s.charAt(i);
						c=0;
					}
				}
				s=t;
			}
			println(s);
		}
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