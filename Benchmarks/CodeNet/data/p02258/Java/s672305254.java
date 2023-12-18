import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());
			
			
			int a = Integer.parseInt(in.readLine());
			int b = 0;
			
			int max = 0;
			for (int i = 1; i < lim; i++) {
				b = Integer.parseInt(in.readLine());
				int minus = b - a;
				a = b;
				
				if (max == 0) max = minus;
				if (max < minus) max = minus;
			}
			System.out.println(max);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}