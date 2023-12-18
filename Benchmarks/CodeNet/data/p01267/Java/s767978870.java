import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Luck Manipulator
// 2013/05/12
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, a, b, c, x;
	int[] ys;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			x=sc.nextInt();
			ys=new int[n];
			for(int i=0; i<n; i++){
				ys[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int frame, at;
		for(frame=0, at=0; frame<=10000; frame++){
			if(x==ys[at]){
				at++;
				if(at==n){
					break;
				}
			}
			x=(a*x+b)%c;
		}
		println(at==n?""+frame:"-1");
		// debug(frame, at,at==n);
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