import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
            input = br.readLine();
		        
		} catch (IOException e) {
        }
		String[] abc = input.split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
		int count = 0;
        for(int i = a; i <= b; i++){
            if(c % i == 0){
	            count++;
	        }
        }
        System.out.println(count);
	}
}
