import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		for(int i = 1; ; i++){
		    try {
			    input = br.readLine();
		        
		    } catch (IOException e) {
	    	}
	    	String[] inputs = input.split(" ");
	    	int a = Integer.parseInt(inputs[0]);
	    	String op = inputs[1];
	    	int b = Integer.parseInt(inputs[2]);
	    	// a op bの順に計算式を書くから、inputsの番号はこの順番になる
	    	if(op.equals("?")){
    		    break;
	    	}   
	    	if(op.equals("+")){
	    	    System.out.println(a + b);
	    	}
	    	if(op.equals("-")){
	    	    System.out.println(a - b);
	    	}
	    	if(op.equals("*")){
	    	    System.out.println(a * b);
	    	}
	    	if(op.equals("/")){
	    	    System.out.println(a / b);
	    	}
		}
	}
}

