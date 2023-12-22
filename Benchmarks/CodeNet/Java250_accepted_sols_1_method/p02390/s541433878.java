import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine();
		
		int second = Integer.parseInt(test);
		int minite = 0;
		int hour = 0;
		
		minite = second / 60;
		second %= 60;
		hour = minite / 60;
		minite %= 60;
		
		System.out.println(hour+ ":" + minite + ":" + second);
		
		
	}
}