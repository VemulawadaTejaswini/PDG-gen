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
	        double answer1=n*n*Pi;
	        double answer2=2*n*Pi;
	        System.out.println(answer1+""+answer2);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}