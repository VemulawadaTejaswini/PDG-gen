package tips;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AandP {

	   public static void main(String args[]) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
	        line = line.replaceAll("apple", "XXXXX");  
	        line = line.replaceAll("peach", "yyyyy");  
	        line = line.replaceAll("XXXXX", "peach");  
	        line = line.replaceAll("yyyyy", "apple");         
	   System.out.println(line);
	   }
}