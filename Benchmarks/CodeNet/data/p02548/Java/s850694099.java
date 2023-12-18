

import java.util.*;
import java.io.*;
import java.math.*;

public class Main 

{ 
static int mod=1000000007;
static int MAX = 1000001; 
static int factor[];
	 static FastReader sc=new FastReader(); 
	 
		  public static void main(String[] args) 
    {
			  int n=i();
			  long res=0;
			  factor = new int[MAX]; 
				factor[0] = 0; 

				generatePrimeFactors(); 
			  for(int i=1;i<n;i++) {
				  long r=calculateNoOFactors(n-i);
				  //double sq=Math.sqrt(n-i);
//				  if(Math.floor(sq)==Math.ceil(sq)) {
//					  r-=1;
//				  }
				  res+=r;
			  }
			  System.out.println(res);
			  
			  
			  
			  
			  
			  
    } 
		  static void generatePrimeFactors() 
			{ 
				factor[1] = 1; 

				// Initializes all the positions with 
				// their value. 
				for (int i = 2; i < MAX; i++) 
					factor[i] = i; 

				// Initializes all multiples of 2 with 2 
				for (int i = 4; i < MAX; i += 2) 
					factor[i] = 2; 

				// A modified version of Sieve of 
				// Eratosthenes to store the 
				// smallest prime factor that 
				// divides every number. 
				for (int i = 3; i * i < MAX; i++) { 
					// check if it has no prime factor. 
					if (factor[i] == i) { 
						// Initializes of j starting from i*i 
						for (int j = i * i; j < MAX; j += i) { 
							// if it has no prime factor 
							// before, then stores the 
							// smallest prime divisor 
							if (factor[j] == j) 
								factor[j] = i; 
						} 
					} 
				} 
			} 

			// function to calculate number of factors 
			static int calculateNoOFactors(int n) 
			{ 
				if (n == 1) 
					return 1; 

				int ans = 1; 

				// stores the smallest prime number 
				// that divides n 
				int dup = factor[n]; 

				// stores the count of number of times 
				// a prime number divides n. 
				int c = 1; 

				// reduces to the next number after prime 
				// factorization of n 
				int j = n / factor[n]; 

				// false when prime factorization is done 
				while (j != 1) { 
					// if the same prime number is dividing n, 
					// then we increase the count 
					if (factor[j] == dup) 
						c += 1; 

					/* if its a new prime factor that is 
					factorizing n, then we again set c=1 
					and change dup to the new prime factor, 
					and apply the formula explained 
					above. */
					else { 
						dup = factor[j]; 
						ans = ans * (c + 1); 
						c = 1; 
					} 

					// prime factorizes a number 
					j = j / factor[j]; 
				} 

				// for the last prime factor 
				ans = ans * (c + 1); 

				return ans; 
			}   
		  
		  
		  
		  
		  
		  
static int[] input(int n) {
	int A[]=new int[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextInt();
	   }
	   return A;
   }
static long[] inputL(int n) {
	long A[]=new long[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextLong();
	   }
	   return A;
   }
static String[] inputS(int n) {
	String A[]=new String[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.next();
	   }
	   return A;
   }


static void input(int A[],int B[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
		   B[i]=sc.nextInt();
	   }
}
static long mod(long x) {
	  return ((x%mod + mod)%mod);
}

     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }  
     static void sort(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
        Arrays.sort(arr);
     }
  
        
        
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
} 



