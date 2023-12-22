import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			x = in.readLine();
			String[] ab = x.split(" ");

			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			
			int tmp = 0;
			if (a > b) {
				tmp = b;
				b = a;
				a = tmp;
			}
			
			while ((tmp = (b % a)) != 0) {
				b = a;
				a = tmp;
			}
			System.out.println(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}