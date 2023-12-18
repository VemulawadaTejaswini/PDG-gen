import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
            String su=br.readLine();
	        	        
		    StringBuilder outArray = new StringBuilder();
		    
		    outArray.append(su);
		    outArray.reverse();
		    System.out.println(outArray);
	}
}