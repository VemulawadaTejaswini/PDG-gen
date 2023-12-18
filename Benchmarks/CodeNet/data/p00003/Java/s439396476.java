import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			x = in.readLine();
			int lim = Integer.parseInt(x);
			
			for (int i = 0; i < lim; i++) {
				String[] values = in.readLine().split(" ");
				int a = Integer.parseInt(values[0]);
				int b = Integer.parseInt(values[1]);
				int c = Integer.parseInt(values[2]);
				if (((a + b) < c) || ((b + c) < a) || ((c + a) < b)) System.out.println("NO");
				else System.out.println("YES");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(x);
	}
}