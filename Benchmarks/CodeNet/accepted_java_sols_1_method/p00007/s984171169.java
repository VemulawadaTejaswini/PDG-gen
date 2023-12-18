import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int weeks = Integer.parseInt(in.readLine());
			
			int d = 100000;
			for (int i = 0; i < weeks; i++) {
				d = (int)((double)d * 1.05 + 999) / 1000 * 1000;
			}
			
			System.out.println(d);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}