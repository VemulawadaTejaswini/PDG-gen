//SHIVAM GARG
import java.util.*;
import java.lang.*;
import java.io.*;
 
/*
2
2
5 9
7
1 2 4 8 16 64 128
*/
public class Main
{
 
 
	public static void main (String[] args) throws java.lang.Exception {
	    FastReader reader = new FastReader();
	    int temp = reader.nextInt() % 1000;
		if(temp  == 0){
                System.out.println(0);
        }else{
                          System.out.println(1000-temp);
        }

			    
    }
    
 
 
 /* Iterative Function to calculate  (x^y)%p in O(log y) */
 
    public static long prime = 1000000007;
    public static long[] fact;
    static long power(long x, long y) 
    { 
        // Initialize result 
        long res = 1; 
        // Update x if it is more than or 
        // equal to p 
        x = x % prime; 
                      
        while (y > 0) 
        { 
            // If y is odd, multiply x  with result 
            if (y % 2 == 1) 
                res = (res * x) % prime; 
            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % prime; 
        } 
          
        return res; 
    } 
      
    // Returns n^(-1) mod p 
    static long modInverse(long n) 
    {   return power(n, prime-2);   } 
      
    // Returns nCr % p using Fermat's little theorem. 
    static long nCrModPFermat(int n, int r) 
    { 
        // Base case 
        if (r == 0) 
            return 1; 
        long a1 = fact[n];
        long a2 = modInverse(fact[r]) % prime;
        long a3 = modInverse(fact[n-r]) % prime;
        return ((fact[n] * a2)%prime * a3) % prime; 
    } 
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        {  br = new BufferedReader(new InputStreamReader(System.in));  } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) { 
                try{    st = new StringTokenizer(br.readLine()); 
                }catch (IOException  e) { 
                    //e.printStackTrace();
                }
            } 
            return st.nextToken(); 
        }
  
        int nextInt() 
        { return Integer.parseInt(next());  } 
  
        long nextLong() 
        {  return Long.parseLong(next());  } 
  
        double nextDouble() 
        {  return Double.parseDouble(next());  } 
        
        long[] nextLongArray(int n){
            long[] a = new long[n];
            for(int i=0; i<n; i++)
            {   a[i] = nextLong();  }
            return a;
        }
        
        int[] nextIntArray(int n){
            int[] a = new int[n];
            for(int i=0; i<n; i++)
            {   a[i] = nextInt();   }
            return a;
        }
        String nextLine() { 
            String str = ""; 
            try{    str = br.readLine(); 
            } catch (IOException e) { 
                //e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	
}
