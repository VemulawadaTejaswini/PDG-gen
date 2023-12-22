import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			while ((x = in.readLine()) != null) {
				String[] ab = x.split(" ");
				long a = Integer.parseInt(ab[0]);
				long b = Integer.parseInt(ab[1]);
				
				if (a > b) {
					long tmp = a;
					a = b;
					b = tmp;
				}
				
				long tmp;
				long ta = a;
				long tb = b;
				while ((tmp = tb % ta) != 0) {
					tb = ta;
					ta = tmp;
				}
				
				long gcd = ta;
				long lcm = a * (b / gcd);
				
				System.out.println(gcd + " " + lcm);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}