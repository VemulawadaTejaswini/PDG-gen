import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		double x=0,y=0;
		double angle=0;

		while(!(str=br.readLine()).equals("0,0")){
			double a = Double.parseDouble(str.substring(0, str.indexOf(",")));
			double b = Double.parseDouble(str.substring(str.indexOf(",")+1, str.length()));

			y += a * Math.cos(-Math.toRadians(angle));
			x += a * Math.sin(Math.toRadians(angle));
			angle += b;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}