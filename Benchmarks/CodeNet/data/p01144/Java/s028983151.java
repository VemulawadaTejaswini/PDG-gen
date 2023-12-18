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

	int n, m;
	int[] D, P;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			D=new int[n];
			P=new int[n];
			for(int i=0; i<n; i++){
				D[i]=sc.nextInt();
				P[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		class P{
			int d, p;

			P(int d, int p){
				this.d=d;
				this.p=p;
			}
		}
		P[] ps=new P[n];
		for(int i=0; i<n; i++){
			ps[i]=new P(D[i], P[i]);
		}
		sort(ps, new Comparator<P>(){
			public int compare(P p1, P p2){
				return -p1.p+p2.p;
			};
		});
		int sum=0;
		for(P p : ps){
			if(p.d>m){
				p.d-=m;
				m=0;
			}else{
				m-=p.d;
				p.d=0;
			}
			sum+=p.d*p.p;
		}
		println(sum+"");
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