import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Integral Rectangles
// 2013/08/13
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int h, w;

	void run(){
		for(;;){
			h=sc.nextInt();
			w=sc.nextInt();
			if((h|w)==0){
				break;
			}
			solve();
		}
	}

	void solve(){
		int ww=200, hh=200;
		for(int i=1; i<200; i++){
			for(int j=1; j<i; j++){
				if(comp(i, j, w, h)>0&&comp(i, j, ww, hh)<0){
					ww=i;
					hh=j;
				}
			}
		}
		println(hh+" "+ww);
	}

	int comp(int w1, int h1, int w2, int h2){
		if(w1*w1+h1*h1!=w2*w2+h2*h2){
			return (w1*w1+h1*h1)-(w2*w2+h2*h2);
		}else{
			return h1-h2;
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
		new Main().run();
	}
}