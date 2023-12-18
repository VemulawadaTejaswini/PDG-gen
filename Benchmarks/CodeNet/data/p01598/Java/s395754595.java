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

	int n, d;
	int[][] w;

	void run(){
		n=sc.nextInt();
		d=sc.nextInt();
		w=new int[d-1][n];
		for(int j=0; j<d-1; j++){
			for(int i=0; i<n; i++){
				w[j][i]=sc.nextInt()-1;
			}
		}
		solve();
	}

	void solve(){
		int[] a=new int[n], b=new int[n];
		boolean ok=true;
		for(int n0a=0; n0a<=n/2; n0a++){
			for(int n0b=0; n0b<=n/2; n0b++){
				int n1a=n/2-n0a, n1b=n/2-n0b;
				fill(a, 1);
				for(int i=0; i<n0a; i++){
					a[i]=0;
				}
				for(int i=0; i<n0b; i++){
					a[i+n/2]=0;
				}
				// debug("1", a);
				if(false)
					for(int j=0; j<d-1; j++){
						for(int i=0; i<n; i++){
							// b[w[j][i]]=a[i];
							b[i]=a[w[j][i]];
						}
						System.arraycopy(b, 0, a, 0, n);
						sort(a, 0, n/2);
						sort(a, n/2, n);
					}
				for(int j=d-2; j>=0; j--){
					for(int i=0; i<n; i++){
						b[i]=a[w[j][i]];
					}
					System.arraycopy(b, 0, a, 0, n);
					sort(a, 0, n/2);
					sort(a, n/2, n);
				}
				// debug("2", a);
				for(int i=0; i<n-1; i++){
					ok&=a[i]<=a[i+1];
				}
			}
		}
		println(ok?"Yes":"No");
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