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
			int x=sc.nextInt();
			int y=sc.nextInt();
			if((x|y)==0){
				break;
			}
			if(x<y){
				int t=x;
				x=y;
				y=t;
			}
			for(int i=0;; i++){
				if(y==0){
					println(x+" "+i);
					break;
				}
				x=x%y;
				int t=x;
				x=y;
				y=t;
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