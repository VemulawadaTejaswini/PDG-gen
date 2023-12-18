import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		double r = Double.parseDouble(line);
		final double PI = 3.141592653589;
		System.out.printf("%.6f %.6f",r*r*PI ,2*r*PI);
	}
}