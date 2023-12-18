import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {

    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			int i=0;
			while(true){
				String buf = br.readLine();
				int x = Integer.parseInt(buf);
				if(x == 0) break;
				i++;
				System.out.println("Case "+i+": "+x);
    		}


    	} catch(IOException e) {
    		System.err.println(e);
		}
    }
}