import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] b = a.split(" ");
		long S = Long.parseLong(b[2]); 
		long D = Long.parseLong(b[0]);
		long T = Long.parseLong(b[1]);
		double result = (double)D/S ;
		if(result <= T) 
			System.out.println("Yes");
		else
			System.out.println("No");

		
		
	}

}
