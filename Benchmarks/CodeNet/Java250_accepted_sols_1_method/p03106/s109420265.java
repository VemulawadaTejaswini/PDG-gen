import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

    	try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){

    		String line = r.readLine();
    		String[] vals = line.split(" ");

    		int A = Integer.parseInt(vals[0]);
    		int B = Integer.parseInt(vals[1]);
    		int K = Integer.parseInt(vals[2]);
	    	int cnt = 0;

	    	int small = Math.min(A, B);
	    	for(int i=small; i>=1; i--) {

	    		if(A % i == 0 && B % i == 0){
	    			if(++cnt == K) {
	    				System.out.println(i);
	    				return;
	    			}
	    		}
	    	}
    	}
    }
}