import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	static ArrayList<Integer> prime=new ArrayList();
	/*public static void PrimeArray(int n)
	{
		for(int i=2;i<=n;i++)
		{
			boolean b=isprime(i);
			if(b)
			{
				prime.add(i);
			}
		}
	}
	*/
	
	public static long gcd(long n1, long n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
	
//////////////////	
	public static class trie {
        int x,y,z;
        trie (int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
	
	} 
        
	public static class pair {
        int x,y;
        pair (int x,int y){
            this.x=x;
            this.y=y;
        }
        public boolean equals(Object o) {
        	if(o instanceof pair) {
        		pair p = (pair)o;
        		return (x == p.x && y == p.y);
        	}
        	return false;
        }
        public int hashCode() {
        	return (Integer.hashCode(x) * 3 + Integer.hashCode(y) );
        }
    }
	
//////////////////	
	
	static class Cmp implements Comparator<pair>
	{
		public int compare(pair a,pair b)
		{
			if(a.x==b.x)
			{
				return(a.y-b.y);
			}
			return(a.x-b.x);
		}
	}
	
	
//////////////////
	
	
	
	
//////////////////
	
	
	
	
	
	   static class FastReader
	   {
		   BufferedReader br;
		   StringTokenizer st;
		   public FastReader()
		   {
			   br = new BufferedReader(new InputStreamReader(System.in));
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
	   
////////////////////// 
	//public static ArrayList<Integer> a=new ArrayList();
	   
	  public static long Divisors(long n) 
	   { 
	       // Note that this loop runs till square root 
		   long sum=0;
	       for (long i=1; i*i<=(n); i++) 
	       { 
	           if (n%i == 0) 
	           { 
	               // If divisors are equal, print only one 
	               if (n/i == i) 
	               {
	                  // printf("%d ", i); 
	            	   sum=sum+1;
	            	 //  a.add(i);
	               }
	     
	               else // Otherwise print both 
	               {
	                   //printf("%d %d ", i, n/i); 
	            	   sum=sum+2;
	            	  // a.add(i);
	            	   //a.add(n/i);
	               }
	           } 
	       } 
	       return(sum);
	   } 
	   
/////////////////////	  
	  
	  public static long SmallestPrimeDivisor(long n) 
	  { 
	      // if divisible by 2 
	      if (n % 2 == 0) 
	          return 2; 
	    
	      // iterate from 3 to sqrt(n) 
	      for (long i = 3; i * i <= n; i += 2) { 
	          if (n % i == 0) 
	              return i; 
	      } 
	    
	      return n; 
	  } 
	    
////////////////////	  
	   
	   public static boolean isprime(long n)
	    {
	        int count=0;
	     
	        for(long i=2;i*i<=n;i++)
	        {
	            if(n%i==0)
	            {
	                return(false);
	            }
	        }
	        return(true);
	    }
	
	   
//////////////////////
	   
	     //   (x^n)%1000000007
	   public static long modularExponentiation(long x,long n,long M)
	   {
	       if(n==0)
	           return 1;
	       else if(n%2 == 0)        //n is even
	           return modularExponentiation((x*x)%M,n/2,M);
	       else                             //n is odd
	           return (x*modularExponentiation((x*x)%M,(n-1)/2,M))%M;

	   }
	   
	   public static long nCr(int n,int k)
	   {
		  if(k==0)
			  return 1;
		  return(n*nCr(n-1,k-1)/k);
	   }
	   public static long factorial(int n)
	   {
		   if(n==1)
			   return 1;
		   return((n%1000000007)*factorial(n-1));
	   }
	   
	   public static void debug(Object...o) {
		    System.out.println( Arrays.deepToString(o) );
	   }
	   
	   
	 
	   
	   
	   
	   
	   

		public static void main(String []args) throws Exception
		{
			
			
			 FastReader in =new FastReader();	
			 PrintWriter pw = new PrintWriter(System.out);
		    //Scanner sc=new Scanner(System.in)
			// int x=in.nextInt();
			String a[]=in.nextLine().split(" ");
			//String b=in.nextLine();
			int x=in.nextInt();
			int y=in.nextInt();
			String z=in.nextLine();
			if(z.equals(a[0]))
			{
				x--;
			}
			else
			{
				y--;
			}
			pw.println(x+" "+y);

			 
			
					     		  
	        pw.flush();
			pw.close();
			
			
		}
			
	}	
		
		
		
		
		
		
		
		
		
		
	

