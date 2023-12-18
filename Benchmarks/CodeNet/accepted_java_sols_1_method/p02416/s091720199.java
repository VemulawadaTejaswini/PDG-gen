import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int x;
	    String inputed;
	    ArrayList<String> inputs = new ArrayList<String>();

	    while(true){
	    	try {
	    		inputed = br.readLine();
	    		if(Character.getNumericValue(inputed.charAt(0)) == 0) {
	    			break;
	    		}
	    		inputs.add(inputed);
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    }
		for(int i = 0; i < inputs.size(); i++){
			x = 0;
			for(int j = 0; j < inputs.get(i).length(); j++) {
				x += Character.getNumericValue(inputs.get(i).charAt(j));
			}
			System.out.printf("%d\n",x);
		}
	}
}

