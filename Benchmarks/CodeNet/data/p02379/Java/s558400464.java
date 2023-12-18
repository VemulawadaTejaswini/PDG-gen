import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		double x1 = Double.parseDouble(input[0]);
		double y1 = Double.parseDouble(input[1]);
		double x2 = Double.parseDouble(input[2]);
		double y2 = Double.parseDouble(input[3]);

		double a = Math.pow(Math.abs(x1-x2), 2);
		double b = Math.pow(Math.abs(y1-y2), 2);

		System.out.println(String.format("%.6f",Math.sqrt(a+b)));
	}
}