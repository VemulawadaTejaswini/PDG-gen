import java.util.Scanner;

public class Main {
	
	private static final long MOD = 1000000000 + 7;
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			long[] dp0 = new long[n+1];
			long[] dp9 = new long[n+1];
			long[] dpNone = new long[n+1];
			long[] dp19 = new long[n+1];
			
			dp0[1] = 1;
			dp9[1] = 1;
			dpNone[1] = 8;
			dp19[1] = 0;
			
			for(int i = 2 ; i <= n ; i++ ) {
				dp0[i] = add(mult(dp0[i-1],9), dpNone[i-1]);
				dp9[i] = add(mult(dp9[i-1],9), dpNone[i-1]);
				dpNone[i] = mult(dpNone[i-1], 8);
				dp19[i] = (mult(dp19[i-1], 10) + dp0[i-1] + dp9[i-1]) % MOD;
			}
			
			System.out.println(dp19[n]);
		}
	}
	
	public static long mult(long a, long b) {
		return (a * b) % MOD; 
	}
	
	public static long add(long a, long b) {
		return (a + b) % MOD;
	}

}