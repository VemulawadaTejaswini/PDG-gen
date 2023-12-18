import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	  public static void main(String[] args) {
	    String line;
	    double n;

	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        line = reader.readLine();
	        n = Integer.parseInt(line);
	        double Pi=Math.PI;
	        System.out.printf("%6f %6f\n",n*n*Pi,2*n*Pi);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}