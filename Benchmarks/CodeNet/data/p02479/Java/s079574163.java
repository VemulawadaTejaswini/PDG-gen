import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Main{
	  public static void main(String[] args) {
	    String line;
	    double n;

	  

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	        line = reader.readLine();
	        n = Integer.parseInt(line);
	        double Pi=Math.PI;
	        double answer1 = n*n*Pi;
	        double answer2 = 2*n*Pi;
	        double answer3 = new BigDecimal(String.valueOf(answer1)).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
	        double answer4 = new BigDecimal(String.valueOf(answer2)).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
	        System.out.println(answer3+" "+answer4);
	    }
	      catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	}