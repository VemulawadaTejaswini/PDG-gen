import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		    try {
			    input = br.readLine();
		        
		    } catch (IOException e) {
	    	}
	    	String[] num = input.split(" ");
		    int a = Integer.parseInt(num[0]);
		    int b = Integer.parseInt(num[1]);
		    int d = a / b;
		    int r = a % b;
		    double f =(double)a / b; 
		System.out.printf("%d %d %f\n", d, r, f);
	}
}
