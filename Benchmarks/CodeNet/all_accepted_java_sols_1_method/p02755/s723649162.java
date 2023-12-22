

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String input[] = br.readLine().split(" ");
		      int a = Integer.parseInt(input[0]);
		      int b = Integer.parseInt(input[1]);
		      int p = 0;
		      for(int i = 1; i < 1251 ; i++) {
		    	  double tax1 = (i * 0.08);
		    	  double tax2 = (i * 0.1);
		    	  if(a == (int)tax1 && b == (int)tax2 ) {
		    		  p = i;
		    		  break;
		    	  }
		      }
		      if(p == 0)
		    	  System.out.println("-1");
		      else
		    	  System.out.println(p);
		}
}