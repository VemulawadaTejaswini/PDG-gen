import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
    	try {
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		String buf = br.readLine();
    		int x = Integer.parseInt(buf);
    		x=x*x*x;
    		System.out.println(x);

    	} catch(IOException e) {
		    System.err.println(e);
	}
    }
}