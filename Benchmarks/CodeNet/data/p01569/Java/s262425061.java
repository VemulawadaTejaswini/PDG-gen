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
			return ;
		}
		long[] ps=new long[4];
		ps[0]=nextPrime((int)1e4);
		ps[1]=nextPrime(ps[0]);
		ps[2]=nextPrime(ps[1]);
		ps[3]=nextPrime(ps[2]);
		// debug("ps", ps);

		long min=INF;
		long[] A={1, 1, 1, 1}, B={0, 0, 0, 0};
		ArrayList<Integer> list1=candidate(ps[0]);
		ArrayList<Integer> list2=candidate(ps[1]);
		ArrayList<Integer> list3=candidate(ps[2]);
		ArrayList<Integer> list4=candidate(ps[3]);
		if(n!=2&&n!=9&&n!=0){
			/*
			// new int[]{}[0]=0;
			StringBuilder sb=new StringBuilder();
			sb.append(n).append('\n');
			for(int i=0;i<n&&i<10;i++){
				sb.append(as[i]).append(' ').append(bs[i]).append('\n');
			}
//			throw new Exception(sb.toString());
			// return;
			 
			 */
		}
		for(int x1 : list1){
			for(int x2 : list2){
				for(int x3 : list3){
					for(int x4 : list4){
						B[0]=x1;
						B[1]=x2;
						B[2]=x3;
						B[3]=x4;
						// debug(x1, x2, x3, x4);
						long res=linearCongruence(A, B, ps);
						// debug(res);
						if(res!=-1&&res>0){
							min=min(min, res);
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
		// println(""+(min<INF?min:-1));
	}

	long linearCongruence(long[] A, long[] B, long[] M){
		long x=0, m=1;
		for(int i=0; i<A.length; i++){
			long a=A[i]*m, b=B[i]-A[i]*x, d=gcd(M[i], a);
			if(b%d!=0)
				return -1;
			// x+=m*(b/d*invMod(a/d, M[i]/d)%(M[i]/d));
			x+=m*(mulMod(b/d, invMod(a/d, M[i]/d), (M[i]/d)));
			m*=M[i]/d;
			// debug(a, b, m);
		}
		return x%m;
		// if(false){
		// BigInteger[] A_=new BigInteger[A.length];
		// BigInteger[] B_=new BigInteger[B.length];
		// BigInteger[] M_=new BigInteger[M.length];
		// for(int i=0; i<A_.length; i++){
		// A_[i]=BigInteger.valueOf(A[i]);
		// B_[i]=BigInteger.valueOf(B[i]);
		// M_[i]=BigInteger.valueOf(M[i]);
		// }
		// BigInteger[] res=congruence(A_, B_, M_);
		// return new long[]{res[0].longValue(), res[1].longValue()};
		// }
	}

	BigInteger[] congruence(BigInteger[] A, BigInteger[] B, BigInteger[] M){
		// debug("A",A);
		// debug("B",B);
		// debug("M",M);
		BigInteger x=BigInteger.ZERO, m=BigInteger.ONE;
		for(int i=0; i<A.length; i++){
			BigInteger a=A[i].multiply(m), b=B[i].subtract(A[i].multiply(x)), d=a
					.gcd(M[i]);
			// debug(a,b,d);
			if(b.remainder(d).compareTo(BigInteger.ZERO)!=0)
				return null;
			// x+=m*(b/d*(a/d).modInv(M[i]/d)%(M[i]/d));
			x=x.add(m.multiply(b.divide(d)
					.multiply(a.divide(d).modInverse(M[i].divide(d)))
					.remainder(M[i].divide(d))));
			// m*=M[i]/d;
			m=m.multiply(M[i].divide(d));
		}
		return new BigInteger[]{x.remainder(m), m};
	}

	long gcd(long a, long b){
		return a==0?b:gcd(b%a, a);
	}

	long invMod(long a, long mod){
		return powMod(a, mod-2, mod);
	}

	ArrayList<Integer> candidate(long p){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<p; i++){
			if(f(i, p)==0&&df(i, p)==0){
				list.add(i);
			}
		}
		return list;
	}

	long mulMod(long x, long y, long mod){
		if(y==0)
			return 0;
		if((y&1)==0)
			return mulMod((x<<1)%mod, y>>>1, mod);
		return (x+mulMod(x, y-1, mod))%mod;
	}

	long powMod(long x, long k, long mod){
		if(k==0){
			return 1%mod;
		}
		if(k%2==0){
			// return powMod(x*x%mod, k>>>1, mod);
			return powMod(mulMod(x, x, mod), k>>>1, mod);
		}
		// return x*powMod(x, k-1, mod)%mod;
		return mulMod(x, powMod(x, k-1, mod), mod);
	}

	long f(long x, long mod){
		long val=0;
		for(int i=0; i<n; i++){
			val=(val+as[i]%mod*powMod(x, bs[i], mod)%mod)%mod;
		}
		return val;
	}

	long df(long x, long mod){
		long val=0;
		for(int i=0; i<n; i++){
			if(bs[i]>0){
				val=(val+bs[i]%mod*as[i]%mod*powMod(x, bs[i]-1, mod)%mod)%mod;
			}
		}
		return val;
	}

	long nextPrime(long n){
		for(n++; !BigInteger.valueOf(n).isProbablePrime(200); n++);
		return n;
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

	public static void main(String[] args) throws Exception{
		new Main().run();
	}
}