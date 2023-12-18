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
		int n=sc.nextInt();
		int[] a=new int[6];
		for(int i=0; i<n; i++){
			double d=sc.nextDouble();
			for(int k=0; k<6; k++){
				if(d+EPS<165+k*5||k==5){
					a[k]++;
					break;
				}
			}
		}
		for(int i=0; i<6; i++){
			print((i+1)+":");
			for(int k=0; k<a[i]; k++){
				print("*");
			}
			println("");
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