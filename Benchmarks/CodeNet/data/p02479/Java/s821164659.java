import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double r = Double.parseDouble(input.readLine());
		
		System.out.println(r*r*Math.PI + " " + 2*r*Math.PI);
		
	}

}