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
		int[] a=new int[51];
		Arrays.fill(a, INF);
		for(int k=0; toGramme(0, 0, k)<=50; k++){
			for(int j=0; toGramme(0, j, k)<=50; j++){
				for(int i=0; toGramme(i, j, k)<=50; i++){
					int g=toGramme(i, j, k);
					a[g]=Math.min(a[g], toMoney(i, j, k));
				}
			}
		}
		for(;;){
			int g=sc.nextInt()/100;
			if(g==0){
				break;
			}
			println(a[g]+"");
		}
	}

	int toGramme(int i, int j, int k){
		return i*2+j*3+k*5;
	}

	int toMoney(int i, int j, int k){
		int sum=0;
		sum+=380*(i-i%5)*80/100+380*(i%5);
		sum+=550*(j-j%4)*85/100+550*(j%4);
		sum+=850*(k-k%3)*88/100+850*(k%3);
		return sum;
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