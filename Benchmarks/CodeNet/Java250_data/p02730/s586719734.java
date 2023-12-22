/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
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
  
    static boolean is_palindrome(String s){
        for (int i=0;i<=s.length()/2 ;i++ ) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) {
	    FastReader ob = new FastReader();
	    String s = ob.next();
	    int n = s.length();
	    //System.out.println(is_palindrome(s.substring(0,((n-1)/2))));
	    //System.out.println(is_palindrome(s.substring(((n+3)/2)-1,n)));
	    if(is_palindrome(s) && is_palindrome(s.substring(0,((n-1)/2))) && is_palindrome(s.substring(((n+3)/2)-1,n))){
	        System.out.println("Yes");
	        
	    }
	    else{
	        System.out.println("No");
	    }
	}
}