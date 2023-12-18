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
			int m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			int[] a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int sum=0;
			for(int i=1; i<=n; i++){
				if(i%m!=0){
					sum+=a[n-i];
				}
			}
			println(sum+"");
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