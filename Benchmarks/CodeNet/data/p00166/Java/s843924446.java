import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

// AC
public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			double[] area=new double[2];
			for(int j=0; j<2; j++){
				int m=sc.nextInt();
				if(m==0){
					return;
				}
				int sum=0;
				for(int i=0; i<m-1; i++){
					int deg=sc.nextInt();
					area[j]+=Math.sin(Math.toRadians(deg))/2;
					sum+=deg;
				}
				area[j]+=Math.sin(Math.toRadians(360-sum))/2;
			}
			if(area[0]>area[1]+EPS){
				println("1");
			}else if(area[0]+EPS<area[1]){
				println("2");
			}else{
				println("0");
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