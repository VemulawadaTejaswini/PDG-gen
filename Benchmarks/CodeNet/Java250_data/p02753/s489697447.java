

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String s = br.readLine();
		      int a = 0, b = 0;
		      for(char c : s.toCharArray()) {
		    	  if(c == 'A')
		    		  a++;
		    	  if(c == 'B')
		    		  b++;
		      }
		      if(a == 0 || b == 0)
		    	  System.out.println("No");
		      else
		    	  System.out.println("Yes");
		}
}
