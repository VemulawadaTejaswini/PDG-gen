import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int MOD = 1000000007;
		long b = 1;
		long c = 0;
		int MAX = 2000 + 1;
		long e;


long[] fac = new long[MAX];
long[] finv = new long[MAX];
long[] inv = new long[MAX];;


  fac[0] = fac[1] = 1;
  finv[0] = finv[1] = 1;
  inv[1] = 1;
  for (int i = 2; i < MAX; i++){
	  fac[i] = fac[i - 1] * i % MOD;
	  inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
	  finv[i] = finv[i - 1] * inv[i] % MOD;
  }
		for(int i = 0;a > 2; i++){
			b = 1;
			a += -3;
		

// 二項係数計算
    e = fac[a + i] * (finv[a] * finv[i] % MOD) % MOD;


			c += e;
			c = c % MOD;
		} 
		System.out.println(c);
		
		
	}
}