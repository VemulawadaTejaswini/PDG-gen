import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n;
		
		while((string = reader.readLine()) != null){
			n = Integer.parseInt(string);
			if(n == 0) break;
			
			String[] cake = reader.readLine().split(" ");
			int peace = 0;
			for(int i = 0; i < cake.length; i++)
				peace += Integer.parseInt(cake[i]);
			
			System.out.println(peace / (n - 1));
		}
		reader.readLine();
	}
}