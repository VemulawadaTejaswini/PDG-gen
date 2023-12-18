import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine()) != null){
        	
        	line = line.replaceAll("apple", "apple2");
        	line = line.replaceAll("peach", "apple");
        	line = line.replaceAll("apple2", "peach");
        	System.out.println(line);
        	
        }
        
	}

}