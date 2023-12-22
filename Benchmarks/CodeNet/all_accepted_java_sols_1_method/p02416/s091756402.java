import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input;
    	int total = 0;

    	while((input = br.readLine()) != null){
    		if(input.equals("0")) break;
    		char[] cArray = input.toCharArray();
    		for(char c : cArray){
    			total += Character.getNumericValue(c);
    		}
    		System.out.println(total);
    		total = 0;
    	}
    }
}