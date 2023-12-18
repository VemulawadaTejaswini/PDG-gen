

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
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
	            while (st == null || !st.hasMoreTokens()) 
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

			public Character charAt(int i) {
				// TODO Auto-generated method stub
				return null;
			} 
	    } 
	 static int divisors(long x) {
		    long limit = x;
		    int numberOfDivisors = 0;

		    if (x == 1) return 1;

		    for (int i = 1; i < limit; ++i) {
		        if (x % i == 0) {
		            limit = x / i;
		            if (limit != i) {
		                numberOfDivisors++;
		            }
		            numberOfDivisors++;
		        }
		    }

		    return numberOfDivisors;
		} 
	public static void main(String[] args)throws IOException  {
		FastReader s=new FastReader();		
		int n = s.nextInt();
		int c=0,c1=0,c2=0,c3=0;
		String ac = "AC";
		String wa = "WA";
		String tle = "TLE";
		String re = "RE";
		for(int i=0;i<n;i++) {
			String se = s.next();
			if(se.contentEquals(ac))c++;
			else if(se.contentEquals(wa))c1++;
			else if(se.contentEquals(tle))c2++;
			else if(se.contentEquals(re))c3++;
			
		}
		System.out.println("AC x "+c);
		System.out.println("WA x "+c1);
		System.out.println("TLE x "+c2);
		System.out.println("RE x "+c3);
	}
}