import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
        
	        String[] su=br.readLine().split(" ");
	        	        
		    StringBuilder outArray = new StringBuilder();
		    
		    for(int i=n-1;i>=0;i--){
		    	outArray.append(su[i] + " ");
		    }
		    int p=outArray.length();
		    outArray.deleteCharAt(p-1);
		    System.out.println(outArray);
	}
}