import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		while(!(string = reader.readLine()).equals("-1"))
			System.out.println(Math.pow(Integer.valueOf(string), 1.0 / 3.0));
		
		reader.close();
	}
}