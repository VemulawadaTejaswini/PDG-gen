
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String input[] = br.readLine().split(" ");
	      long a = Long.parseLong(input[0]);
	      long b = Long.parseLong(input[1]);
	      long c = Long.parseLong(input[2]);
	      if(c < a || c < b) {
	    	  System.out.println("No");
	    	  return;
	      }
	      long d = c - a - b;
	      
	      System.out.println((d > 0 && (d * d) > (4 * a * b))?"Yes":"No");
	}

}
