

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
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

	 static int gcd(int a , int b) {
		 if(b==0)return a;
		 return gcd(b,a%b);
	 }

	/**
	 * @param args
	 * @throws IOException
	 */
	 
	 static void findProductSum(long A[], int n) 
	 { 
	     // calculating array sum (a1 + a2 ... + an) 
	     long array_sum = 0; 
	     for (int i = 0; i < n; i++) 
	         array_sum = array_sum + A[i]; 
	   

	     long array_sum_square = (array_sum * array_sum) ;
	   

	     long individual_square_sum = 0; 
	     for (int i = 0; i < n; i++) 
	         individual_square_sum += (A[i] * A[i]); 
	     
	    
	     // required sum is (array_sum_square - 
	     // individual_square_sum) / 2 
	     long p =(array_sum_square - individual_square_sum)/ 2;
	     System.out.println(p%1000000007);
	   
	 } 
	public static void main(String[] args)throws IOException  {
		FastReader s=new FastReader();		
//		String se = s.next();
//		String a = s.next();
//		int k=0,max=0,c=0;
//		String a2="";
//		for(int i=0;i<a.length();i++) {
//			a2 +=a.charAt(i);
//			if(se.contains(a2)) {
//				k=a2.length();
//				
////				System.out.println(1);
//			}
//			else{
//				se="";
//				k=0;
//			}
//			
//			max = Math.max(k, max);
//		}
//		System.out.println(a.length()-max-c);
		int n  = s.nextInt();
		long[] ar =  new long[300001];
		long[] p =  new long[300001];
		p[0]=0;
		long m = 1000000007;
		long k=0,ans=0;
		for(int i=1;i<=n;i++) {
			ar[i] = s.nextLong();
			k=(p[i-1]*ar[i])%m;
			ans=(ans+k)%m;
			p[i] = (ar[i]+p[i-1])%m;
			
		}
		System.out.println(ans);
	}
}
	

