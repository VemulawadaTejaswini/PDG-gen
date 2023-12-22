

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String input[] = br.readLine().split(" ");
	      long a = Long.parseLong(input[0]);
	      long b = Long.parseLong(input[1]);
	      
	      if(a == 1 || b ==1) {
	    	  System.out.println("1");
	    	  return;
	      }
	      else {
	    	  long res = (a * b + 1)/2;
	    	  System.out.println(res);
	      }
	}

}
