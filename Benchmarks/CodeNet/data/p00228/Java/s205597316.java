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
		int[] digits={111111, 110, 1011011, 1001111, 1100110, 1101101,
				1111101, 100111, 1111111, 1101111};
		for(;;){
			int n=sc.nextInt();
			if(n<0){
				break;
			}
			int digit=0;
			for(int k=0;k<n;k++){
				int m=sc.nextInt();
				int d=1000000;
				for(int i=0; i<7; i++){
					// debug(i,(digit/d)%10,(digits[m]/d)%10);
					if((digit/d)%10==(digits[m]/d)%10){
						print("0");
					}else{
						print("1");
					}
					d/=10;
				}
				println("");
				digit=digits[m];
			}
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