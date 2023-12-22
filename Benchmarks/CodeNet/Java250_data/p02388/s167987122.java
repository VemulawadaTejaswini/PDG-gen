import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		  BufferedReader r =new BufferedReader(new InputStreamReader(System.in), 1);
		                                        // ???????????\????????????
		  
		  String s =r.readLine();
		  int x = Integer.parseInt(s);
		System.out.println(x*x*x);
		
	}
}