import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a, b, C, radianC, c, S, h;
		
		String str[] = br.readLine().split(" ");
			a = Double.parseDouble(str[0]);
			b = Double.parseDouble(str[1]);
			C = Double.parseDouble(str[2]);
			
			radianC = Math.toRadians(C);
			
			S = (a * b * Math.sin(radianC)) / 2;
			c = Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(radianC)));
			h = (2 * S) / a;
			
			System.out.println(S);
			System.out.println(a + b + c);
			System.out.println(h);
        }
}