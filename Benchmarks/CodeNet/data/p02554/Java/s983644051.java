import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if (N==1) {
			System.out.println(0);
			return ;
		}
		long total = Main.total(N,10);
		long tempeight[] = new long[(int)(N+1)];
		tempeight[0]=1;
		long ng =0;
		for (int i=1;i<=N;i++) {
			tempeight[i]=(tempeight[i-1]*8)%1000000007;
		}
		Main.pre_factrials((int)N);
		for (int i=0;i<N;i++) {
			long temp = Main.fastFermatComb((int)N, (int)(N-i));
			temp = (temp *tempeight[i])%1000000007;
			ng = (ng + temp)%1000000007;
		}
		ng = (ng*2)%1000000007;
		ng =( ng +tempeight[(int)N]) %1000000007;
		System.out.println((total+1000000007-ng)%1000000007);
//		total = (total + N*(N-1)/2)%1000000007;
//		System.out.println(total);
	}

	public static long total(long N, int a) {
		long re =1;
		for (int i=0;i<N;i++) {
			re = (re*10)%1000000007;
		}
		return re;
	}

	static long factorials[];
    static long factorialDivs[];
    static int mod = (int) 1e9 + 7;
    static void pre_factrials(int n) {
        factorials = new long[n + 1];
        factorialDivs = new long[n + 1];//割算の結果を格納する配列
        factorials[0] = 1;
        for (int i = 0; i < n; i++) {
            factorials[i + 1] = mul(i + 1, factorials[i]);
        }
        factorialDivs[n] = div(1, factorials[n]);//最初に1/(n!)を求める事で、1/(n-1)!からは掛け算で求める事ができる。
        for (int i = n - 1; i >= 0; i--) {
            factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
        }
    }

    static long fastFermatComb(int a, int b) {
        if (factorials.length == 0)
            System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
        long af = factorials[a];
        long bf = factorialDivs[b];
        long abf = factorialDivs[a - b];
        long res = mul(mul(af, bf), abf);
        return res;
    }

  //MOD culculations
    static long plus(long x, long y) {
        x %= mod;
        y %= mod;
        long res = (x + y) % mod;
        return res;
    }

    static long sub(long x, long y) {
        x %= mod;
        y %= mod;
        long res = (x - y + mod) % mod;
        return res;
    }

    static long mul(long x, long y) {
        x %= mod;
        y %= mod;
        long res = x * y % mod;
        return res;
    }

    static long div(long x, long y) {
        x %= mod;
        y %= mod;
        long res = x * modpow(y, mod - 2) % mod;
        return res;
    }

    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long halfP = p / 2;
            long root = modpow(a, halfP);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }
}