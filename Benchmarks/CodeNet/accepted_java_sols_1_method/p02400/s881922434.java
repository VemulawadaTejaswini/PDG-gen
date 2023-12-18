import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {

    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			double r = Double.parseDouble(buf);
	    	//面積 πr^2
	    	//円周 2πr
	    	System.out.printf("%f %f",Math.PI*Math.pow(r, 2),Math.PI*2*r);

    	} catch(IOException e) {
    		System.err.println(e);
		}
    }
}