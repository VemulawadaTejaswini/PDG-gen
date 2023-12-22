import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String s = input.readLine();
		String p = input.readLine();
		
		s = s.concat(s);
		int num = s.indexOf(p);
		
		if(num != -1) System.out.println("Yes");
		else          System.out.println("No");
	
		
	}

}