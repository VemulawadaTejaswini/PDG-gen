import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data = reader.readLine();
		double r = Double.parseDouble(data);
		double area = r*r*Math.PI;
		double circle = 2*r*Math.PI;
		System.out.println(area + " " + circle);
	}
}