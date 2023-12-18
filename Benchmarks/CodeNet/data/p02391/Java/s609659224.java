import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String[] input = br.readLine.split("");

	if(input[0]<input[1]){
	System.out.println("a<b");
	}else if (input[0] == input[1]){
	System.out.println("a==b");
	}else{
	System.out.println("a>b");
	}
    }
}