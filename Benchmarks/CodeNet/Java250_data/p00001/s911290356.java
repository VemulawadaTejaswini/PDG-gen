import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;



public class Main {

	public static void main(String[] args) throws IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3, Collections.reverseOrder());
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null && s.length() != 0) {
	    	pq.add(Integer.parseInt(s));
//	    	System.out.println(s);
	    // An empty line or Ctrl-Z terminates the program	    
	    }
	    for (int i = 0; i < 3; i++) {
			System.out.println(pq.poll());
		}
	    
	}
	
	
	
	

}