
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	      int n=sc.nextInt();
	      int count=0;
	      for(int i=1;i<n;i++) {
	  count+=(n-1)/i;
	        
	          }
	        
	   System.out.println(count);
	      
	}
static long nCr(int n, int r, 
    int p) 
{ 


if (r == 0) 
return 1; 


int[] fac = new int[n + 1]; 
fac[0] = 1; 

for (int i = 1; i <= n; i++) 
fac[i] = fac[i - 1] * i % p; 

return (fac[n] * modInverse(fac[r], p) 
% p * modInverse(fac[n - r], p) 
% p) 
% p; 
} 
static long modInverse(int n, int p) 
{ 
    return pow(n, p - 2)%mod; 
} 
static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
} 
static int divCount(int n) 
{ 
    // sieve method for prime calculation 
    boolean hash[] = new boolean[n + 1]; 
    Arrays.fill(hash, true); 
    for (int p = 2; p * p < n; p++) 
        if (hash[p] == true) 
            for (int i = p * 2; i < n; i += p) 
                hash[i] = false; 
  
    // Traversing through  
    // all prime numbers 
    int total = 1; 
    for (int p = 2; p <= n; p++)  
    { 
        if (hash[p]) 
        { 
  
            // calculate number of divisor 
            // with formula total div =  
            // (p1+1) * (p2+1) *.....* (pn+1) 
            // where n = (a1^p1)*(a2^p2)....  
            // *(an^pn) ai being prime divisor 
            // for n and pi are their respective  
            // power in factorization 
            int count = 0; 
            if (n % p == 0)  
            { 
                while (n % p == 0)  
                { 
                    n = n / p; 
                    count++; 
                } 
                total = total * (count + 1); 
            } 
        } 
    } 
    return total; 
} 
  
}


