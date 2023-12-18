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
			int w=sc.nextInt();
			if(w==-1){
				break;
			}
			int sum=0;
			if(w>30){
				sum+=160*(w-30);
				w=30;
			}
			if(w>20){
				sum+=140*(w-20);
				w=20;
			}
			if(w>10){
				sum+=125*(w-10);
				w=10;
			}
			sum+=1150;
			println(""+(4280-sum));
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