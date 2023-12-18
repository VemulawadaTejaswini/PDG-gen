

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
		long[] ar =  new long[n];
		for(int i=0;i<n;i++) {
			ar[i] = s.nextLong();
		}
		long ans=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				ans+=ar[i]*ar[j];
			}
			ans=ans%1000000007;
		}
		System.out.println(ans%1000000007);
		
		
	}
}
	

