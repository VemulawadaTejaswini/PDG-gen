import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, a, b, c, d;

	void run(){
		n=sc.nextInt();
		a=sc.nextInt()-1;
		b=sc.nextInt()-1;
		c=sc.nextInt()-1;
		d=sc.nextInt()-1;
		solve();
	}

	void solve(){
		int min=INF;
		for(int w=1; w<=n; w++){
			min=min(min, abs(a%w-b%w)+abs(a/w-b/w)+abs(c%w-d%w)+abs(c/w-d/w));
		}
		println(min+"");
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