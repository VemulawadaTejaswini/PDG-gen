import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	String[] s = br.readLine().split("");
	input[0] = Integer.parseInt(s[0]);
	input[1] = Integer.parseInt(s[1]);

	if(input[0]<input[1]){
	System.out.println("a<b");
	}else if (input[0] == input[1]){
	System.out.println("a==b");
	}else{
	System.out.println("a>b");
	}
    }
}