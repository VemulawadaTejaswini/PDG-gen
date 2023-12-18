import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Complex Integer Solutions
// 2012/12/25
public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	int[] a;

	void run(){
		n=sc.nextInt();
		a=new int[n+1];
		for(int i=n; i>=0; i--){
			a[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		int p1=nextPrime(1500), p2=nextPrime(p1), p=p1*p2;

		ArrayList<P> list1=new ArrayList<P>(), list2=new ArrayList<P>();
		for(int x=0; x<p1; x++){
			for(int y=0; y<p1; y++){
				P eval=evalMod(x, y, p1);
				if(eval.x==0&eval.y==0){
					list1.add(new P(x, y));
				}
			}
		}
		for(int x=0; x<p2; x++){
			for(int y=0; y<p2; y++){
				P eval=evalMod(x, y, p2);
				if(eval.x==0&eval.y==0){
					list2.add(new P(x, y));
				}
			}
		}

		TreeSet<P> set=new TreeSet<P>();
		for(P z1 : list1){
			for(P z2 : list2){
				int x=linearCongruence(new int[]{1, 1},
						new int[]{z1.x, z2.x}, new int[]{p1, p2});
				int y=linearCongruence(new int[]{1, 1},
						new int[]{z1.y, z2.y}, new int[]{p1, p2});
				if(x>abs(x-p)){
					x=x-p;
				}
				if(y>abs(y-p)){
					y=y-p;
				}
				P eval=eval(x, y);
				if(eval.x==0&&eval.y==0){
					set.add(new P(x, y));
				}
			}
		}

		P[] ps=set.toArray(new P[0]);
		println(ps.length+"");
		for(int i=0; i<ps.length; i++){
			int x=ps[i].x, y=ps[i].y;
			String s=x+"+"+y+"i";
			s=s.replaceAll("\\+-", "-").replaceAll("[\\+|-]0i", "")
					.replaceAll("\\+1i", "+i").replaceAll("-1i", "-i")
					.replaceAll("^0", "").replaceAll("^\\+", "");
			if(s.length()==0){
				s="0";
			}
			print(s);
			if(i<ps.length-1){
				print(" ");
			}else{
				print("\n");
			}
		}
	}

	int nextPrime(int n){
		for(n++; !BigInteger.valueOf(n).isProbablePrime(200); n++);
		return n;
	}

	int linearCongruence(int[] A, int[] B, int[] M){
		int x=0, m=1;
		for(int i=0; i<A.length; i++){
			int a=A[i]*m, b=B[i]-A[i]*x, d=gcd(M[i], a);
			if(b%d!=0)
				return -1;
			x+=m*(b/d*invMod(a/d, M[i]/d)%(M[i]/d));
			m*=M[i]/d;
		}
		return (x%m+m)%m;
	}

	int gcd(int a, int b){
		return a==0?b:gcd(b%a, a);
	}

	int invMod(int x, int mod){
		return (int)powMod(x, mod-2, mod);
	}

	long powMod(long x, int k, int mod){
		if(k==0)
			return 1;
		else if((k&1)==0)
			return powMod(x*x%mod, k>>>1, mod);
		else
			return x*powMod(x, k-1, mod)%mod;
	}

	P evalMod(int x, int y, int mod){
		P eval=new P(0, 0);
		for(int i=0; i<=n; i++){
			mul(eval, x, y);
			add(eval, a[i], 0);
			eval.x%=mod;
			eval.y%=mod;
		}
		return eval;
	}

	P eval(int x, int y){
		P eval=new P(0, 0);
		for(int i=0; i<=n; i++){
			mul(eval, x, y);
			add(eval, a[i], 0);
		}
		return eval;
	}

	void add(P p, int x, int y){
		p.x+=x;
		p.y+=y;
	}

	void mul(P p, int x, int y){
		int nx=p.x*x-y*p.y;
		int ny=x*p.y+y*p.x;
		p.x=nx;
		p.y=ny;
	}

	class P implements Comparable<P>{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}

		@Override
		public String toString(){
			return "("+x+", "+y+")";
		}

		public int compareTo(P p){
			return Long.signum(x-p.x)*2+Long.signum(y-p.y);
		}
	}

	void println(String s){
		System.out.println(s);
	}

	void print(String s){
		System.out.print(s);
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
	}

	public static void main(String[] args){
		new Main().run();
	}
}