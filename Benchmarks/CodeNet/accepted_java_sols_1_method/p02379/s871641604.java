import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		String[] str = line.split(" ");
		
		double x1 = Double.parseDouble(str[0]);
		double y1 = Double.parseDouble(str[1]);
		double x2 = Double.parseDouble(str[2]);
		double y2 = Double.parseDouble(str[3]);
		
		double x = Math.pow(x1 - x2 , 2);
		double y = Math.pow(y1 - y2 , 2);
		
		double det = Math.sqrt(x + y);
		
		System.out.println(det);
		
	}

}