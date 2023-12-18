import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input, 1);
		int N = Integer.parseInt(reader.readLine());
		if(N == 1) {
          System.out.println("Hello World");
		}else {
			System.out.println(Integer.parseInt(reader.readLine()) + 
					Integer.parseInt(reader.readLine()));
		}
		
	}

}