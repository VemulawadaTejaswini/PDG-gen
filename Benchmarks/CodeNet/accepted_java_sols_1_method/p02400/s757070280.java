
//Computation - Circle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(in.readLine());
		
//		double r =34.1201;
		
		System.out.printf("%.6f %.6f\n" ,r*r*Math.PI,2*r*Math.PI);
			

	}
}