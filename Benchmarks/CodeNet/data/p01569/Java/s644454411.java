import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	long INF=1L<<60;
	double EPS=1e-12;

	int n;
	long[] as, bs;

	void run() throws Exception{
		n=sc.nextInt();
		as=new long[n];
		bs=new long[n];
		for(int i=0; i<n; i++){
			bs[i]=sc.nextLong();
			as[i]=sc.nextLong();
		}
		solve();
	}

	void solve() throws Exception{
		if(n==0){
			println("Yes 1");
			return;
		}

		int m=5;
		long[] ps=new long[5];
		ps[0]=BigInteger.valueOf((int)1e3).nextProbablePrime().longValue();
		for(int i=1; i<m; i++){
			ps[i]=BigInteger.valueOf(ps[0]).add(BigInteger.ONE)
					.nextProbablePrime().longValue();
		}

		for(int x=1; x<=1000; x++){
			int mod1=(int)ps[0], mod2=(int)ps[1];
			if(f(x, mod1)==0&&df(x, mod1)==0&&f(x, mod2)==0&&df(x, mod2)==0){
				println("Yes "+x);
				return;
			}
		}

		long min=INF;

		long[] A=new long[m], B=new long[m];
		fill(A, 1);
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] lists=new ArrayList[m];
		for(int i=0; i<m; i++){
			lists[i]=new ArrayList<Integer>();
		}
		for(int x1 : lists[0]){
			for(int x2 : lists[1]){
				for(int x3 : lists[2]){
					for(int x4 : lists[3]){
						for(int x5 : lists[4]){
							B[0]=x1;
							B[1]=x2;
							B[2]=x3;
							B[3]=x4;
							B[4]=x5;
							long res=linearCongruence(A, B, ps);
							if(res!=-1&&res>0){
								min=min(min, res);
							}
						}
					}
				}
			}
		}
		if(min<INF){
			println("Yes "+min);
		}else{
			println("No");
		}
	}

	ArrayList<Integer> candidate(int mod){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<mod; i++){
			if(f(i, mod)==0&&df(i, mod)==0){
				list.add(i);
			}
		}
		return list;
	}

	long f(long x, int mod){
		long val=0;
		for(int i=0; i<n; i++){
			val=(val+as[i]%mod*powMod(x, bs[i], mod)%mod)%mod;
		}
		return val;
	}

	long df(long x, int mod){
		long val=0;
		for(int i=0; i<n; i++){
			if(bs[i]>0){
				val=(val+bs[i]%mod*as[i]%mod*powMod(x, bs[i]-1, mod)%mod)%mod;
			}
		}
		return val;
	}

	long powMod(long x, long k, int mod){
		if(k==0){
			return 1%mod;
		}
		if(k%2==0){
			return powMod(x*x%mod, k>>>1, mod);
		}
		return x*powMod(x, k-1, mod)%mod;
	}

	long linearCongruence(long[] A, long[] B, long[] M){
		long x=0, m=1;
		for(int i=0; i<A.length; i++){
			long a=A[i]*m, b=B[i]-A[i]*x, d=gcd(M[i], a);
			if(b%d!=0)
				return -1;
			x+=m*(mulMod(b/d, invMod(a/d, M[i]/d), (M[i]/d)));
			m*=M[i]/d;
		}
		return x%m;
	}

	long gcd(long a, long b){
		return a==0?b:gcd(b%a, a);
	}

	long invMod(long a, long mod){
		return powMod(a, mod-2, mod);
	}

	long mulMod(long x, long y, long mod){
		long res=0;
		for(;y!=0;y>>>=1){
			if((y&1)==1){
				res=(res+x)%mod;
			}
			x=(x+x)%mod;
		}
		/*
		if(y==0)
			return 0;
		if((y&1)==0)
			return mulMod((x<<1)%mod, y>>>1, mod);
		return (x+mulMod(x, y-1, mod))%mod;
		*/
		return res;
	}

	long powMod(long x, long k, long mod){
		long res=0;
		for(;k!=0;k>>>=1){
			if((k&1)==1){
				res=mulMod(res, x, mod);
			}
			x=mulMod(x, x, mod);
		}
		return res;
		/*
		if(k==0){
			return 1%mod;
		}
		if(k%2==0){
			return powMod(mulMod(x, x, mod), k>>>1, mod);
		}
		return mulMod(x, powMod(x, k-1, mod), mod);
		*/
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception{
		new Main().run();
	}
}