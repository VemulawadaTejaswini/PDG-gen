import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	String[] s = br.readLine().split("");
	int input1 = Integer.parseInt(s[0]);
	int input2 = Integer.parseInt(s[1]);
	if(input1<input2){
	System.out.println("a<b");
	}else if (input1 == input2){
	System.out.println("a==b");
	}else{
	System.out.println("a>b");
	}
    }
}