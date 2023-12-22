

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {
	
	static boolean isPalindrome(String s) {
		StringBuilder res = new StringBuilder(s);
		String test = res.reverse().toString();
		if(test.compareTo(s) == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      String s = sc.nextLine();
      
      if(isPalindrome(s) == true) {
    	  int n = s.length();
    	  String left = s.substring(0,(n - 1) / 2);
    	  String right = s.substring((n + 1) / 2, n);
    	  if(isPalindrome(left) == true && isPalindrome(right) == true)
    		  System.out.println("Yes");
    	  else
    		  System.out.println("No");
      }
      else
    	  System.out.println("No");
      
      
      
      out.close();
	}
	public static PrintWriter out;

	   public static class MyScanner {
	      BufferedReader br;
	      StringTokenizer st;
	 
	      public MyScanner() {
	         br = new BufferedReader(new InputStreamReader(System.in));
	      }
	 
	      String next() {
	          while (st == null || !st.hasMoreElements()) {
	              try {
	                  st = new StringTokenizer(br.readLine());
	              } catch (IOException e) {
	                  e.printStackTrace();
	              }
	          }
	          return st.nextToken();
	      }
	 
	      int nextInt() {
	          return Integer.parseInt(next());
	      }
	 
	      long nextLong() {
	          return Long.parseLong(next());
	      }
	 
	      double nextDouble() {
	          return Double.parseDouble(next());
	      }
	 
	      String nextLine(){
	          String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	      }

	   }

      

}
