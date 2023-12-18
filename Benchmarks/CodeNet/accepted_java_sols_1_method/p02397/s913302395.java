import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		for(int i = 1; i < 3000; i++){
		    try {
			    input = br.readLine();
		        
		    } catch (IOException e) {
	    	}
	    	String[] xy = input.split(" ");
		    int x = Integer.parseInt(xy[0]);
		    int y = Integer.parseInt(xy[1]);
		    if(x > y){
		        int tem = x;
		        x = y;
		        y = tem;
		    }
	    	if(x == 0 && y == 0){
    		    break;
	    	}   
		    System.out.println(x + " " + y);
		}
	}
}

