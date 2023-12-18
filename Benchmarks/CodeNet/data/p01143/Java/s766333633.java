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

	int n, m, p;
	int[] x;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			p=sc.nextInt();
			if((n|m|p)==0){
				break;
			}
			m--;
			x=new int[n];
			for(int i=0; i<n; i++){
				x[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int sum=0;
		for(int i : x){
			sum+=i;
		}
		if(x[m]==0){
			println("0");
		}else{
			println(sum*(100-p)/x[m]+"");
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