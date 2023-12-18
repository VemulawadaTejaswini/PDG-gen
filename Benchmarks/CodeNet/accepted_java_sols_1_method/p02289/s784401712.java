import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);

	    PriorityQueue<Integer> quere = new PriorityQueue<Integer> (Collections.reverseOrder());
	    while(true){
		    String read = buffer.readLine();
		    String[] scan = read.split(" ");
	    	if(scan[0].equals("insert")){
	    		quere.add(Integer.parseInt(scan[1]));
	    	}
	    	if(scan[0].equals("extract")){
	    		System.out.println(quere.poll());
	    	}
	    	if(scan[0].equals("end")){
	    		break;
	    	}
	    }
	}
}