//package Cpp_Template;
import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{ 

	 static FastReader sc=new FastReader(); 
	  public static void main(String[] args) 
    {
			    int n=i();
	        	int A[]=new int[n];
	        	input(A);
	        	long sum=0;
	        	for(int i : A)
	        		sum+=i;
	        	long B[]=new long[n+1];
	        	for(int i=0;i<n;i++) {
	        		sum-=A[i];
	        		B[i+1]=sum;
	        	}
	        	BigInteger res=new BigInteger("0");
	        	BigInteger a,b;
	        	for(int i=0;i<n-1;i++) {
	        		a=BigInteger.valueOf(A[i]);
	        		b=BigInteger.valueOf(B[i+1]);
	        		res=res.add(a.multiply(b));
	        	}
	        	int m=(int)Math.pow(10,9)+7;
	        	a=BigInteger.valueOf(m);
	        	res=res.remainder(a);
	        	System.out.println(res);
			
			
	
	}    
	 static long togglebit(long n) 
    { 
        if (n == 0) 
            return 1; 
  
        long i = n; 
        n |= n >> 1; 
        n |= n >> 2; 
        n |= n >> 4; 
        n |= n >> 8; 
        n |= n >> 16; 
  
        return i ^ n; 
    }  
    static long nor(long num1, long num2) 
    {  
        if (num1 < num2) 
        { 
            long temp = num1; 
            num1 = num2; 
            num2 = temp; 
        } 
      
        num1 = togglebit(num1); 
      
        return num1 ^ num2; 
    } 
    	
   static void input(int A[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
	   }
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
     public static String rev(String str){  
    	    char ch[]=str.toCharArray();  
    	    String rev="";  
    	    for(int i=ch.length-1;i>=0;i--){  
    	        rev+=ch[i];  
    	    }  
    	    return rev;  
    	}  
        static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
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




