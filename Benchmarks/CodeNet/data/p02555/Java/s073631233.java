import java.util.Scanner;

public class Main {
	
	private static final long MOD = 1000000000 + 7;
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int s = sc.nextInt();
			
			//数列長がnの時、最低限からの余剰(s - n*3)をnで0以上で分配する通り数を考える必要あり
			//n=2、余剰=50 ==> 51通り
			//n=3, 余剰=50 ==> A+B+C=50 A, B, C>=50
			//n=4, ... --> 50+n C n-1
			
			int maxLen = s / 3;
			long ans = 0;
			
			for(int i = 1 ; i <= maxLen ; i++ ) {
				int rest = s - i * 3;
				
				long comb = combination(rest + (i-1), i-1);
//				System.out.println(comb);
				
				ans = (ans + comb) % MOD;
				
			}
			
			System.out.println(ans);
		}
	}
	public static long combination(int a, int b) {
		
//		System.out.println(a + " C " + b);
		
		long comb = 1;
		for(int i = 0 ; i < b ; i++ ) {
			comb = comb * (long)(a-i) % MOD;
			comb = comb * calcModInv((long)(b-i)) % MOD;
		}
		
		return comb;
		
	}

	public static long calcModInv(long a) {
		long n = MOD - 2;
		long ans = 1;
		
		while(n > 0 ) {
			if ( (n & 1) == 0x1) {
				ans = ans * a % MOD;
			}
			a = a * a % MOD;
			n = n >> 1;
		}
		
		return ans;
	}
}