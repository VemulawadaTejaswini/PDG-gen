import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int add = scanner.nextInt();
		String temp = scanner.next();
		int length = temp.length();
		long mod = (long) (Math.pow(10, 9) + 7l);
		int amount = length + add;
		long[] powers = new long[amount + 1];
		powers[0] = 1l;
		for (int i = 0; i < powers.length - 1; i++) 
		    powers[i + 1] = powers[i] * 25 % mod;
		
		long result = 1l;
		for(int i = 0; i < amount; i++) 
			result = result * 26 % mod;
		for(int i = 0; i < length; i++) {
			long temporal = powers[amount - i] * nCrModPFermat(amount, i, mod) % mod;
			result -= temporal;
			while(result < 0)
				result += mod;
			result %= mod;
		}
		System.out.print(result);
	}
	
	static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    } 
	
	static long power(long x, long y, long p) 
    { 
        long res = 1l; 
      
        x = x % p; 
                      
        while (y > 0) 
        { 
              
            if (y % 2 == 1) 
                res = (res * x) % p; 
      
            y = y >> 1;
            x = (x * x) % p; 
        } 
        return res; 
    } 
	
    static long nCrModPFermat(int n, int r, long p) { 
          
        if (r == 0) 
            return 1; 
      
        long[] fac = new long[n+1]; 
        fac[0] = 1; 
          
        for (int i = 1 ;i <= n; i++) 
            fac[i] = fac[i-1] * i % p; 
      
        return (fac[n]* modInverse(fac[r], p) 
                % p * modInverse(fac[n-r], p) 
                                    % p) % p; 
    } 
}
